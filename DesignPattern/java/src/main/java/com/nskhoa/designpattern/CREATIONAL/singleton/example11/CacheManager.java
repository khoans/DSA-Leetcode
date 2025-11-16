package com.nskhoa.designpattern.creational.singleton.example11;

import java.util.HashMap;
import java.util.Map;

/**
 * Example 5: Quản lý cache dữ liệu
 * Cache singleton giúp lưu trữ dữ liệu tạm thời trong memory,
 * tránh việc truy vấn database nhiều lần cho cùng một dữ liệu.
 */
public class CacheManager {
    private static CacheManager instance;
    private Map<String, CacheEntry> cache;
    private static final long DEFAULT_TTL = 300000; // 5 minutes in milliseconds
    private int hitCount;
    private int missCount;

    private static class CacheEntry {
        Object value;
        long expiryTime;

        CacheEntry(Object value, long ttl) {
            this.value = value;
            this.expiryTime = System.currentTimeMillis() + ttl;
        }

        boolean isExpired() {
            return System.currentTimeMillis() > expiryTime;
        }
    }

    private CacheManager() {
        cache = new HashMap<>();
        hitCount = 0;
        missCount = 0;
        System.out.println("CacheManager initialized");
    }

    public static synchronized CacheManager getInstance() {
        if (instance == null) {
            instance = new CacheManager();
        }
        return instance;
    }

    public void put(String key, Object value) {
        put(key, value, DEFAULT_TTL);
    }

    public void put(String key, Object value, long ttl) {
        cache.put(key, new CacheManager.CacheEntry(value, ttl));
        System.out.println("Cached: " + key);
    }

    public Object get(String key) {
        CacheManager.CacheEntry entry = cache.get(key);

        if (entry == null) {
            missCount++;
            System.out.println("Cache MISS: " + key);
            return null;
        }

        if (entry.isExpired()) {
            cache.remove(key);
            missCount++;
            System.out.println("Cache EXPIRED: " + key);
            return null;
        }

        hitCount++;
        System.out.println("Cache HIT: " + key);
        return entry.value;
    }

    public void remove(String key) {
        cache.remove(key);
        System.out.println("Removed from cache: " + key);
    }

    public void clear() {
        cache.clear();
        hitCount = 0;
        missCount = 0;
        System.out.println("Cache cleared");
    }

    public void cleanExpired() {
        cache
                .entrySet()
                .removeIf(entry -> entry
                        .getValue()
                        .isExpired());
        System.out.println("Expired entries removed");
    }

    public void showStatistics() {
        int total = hitCount + missCount;
        double hitRate = total > 0
                         ? (hitCount * 100.0 / total)
                         : 0;

        System.out.println("\n=== Cache Statistics ===");
        System.out.println("Cache Size: " + cache.size());
        System.out.println("Hit Count: " + hitCount);
        System.out.println("Miss Count: " + missCount);
        System.out.println("Hit Rate: " + String.format("%.2f%%", hitRate));
    }

    public static void main(String[] args) {
        CacheManager cache = CacheManager.getInstance();

        cache.put("user_1", "John Doe");
        cache.put("user_2", "Jane Smith", 10000); // 10 seconds TTL

        System.out.println("Retrieved: " + cache.get("user_1"));
        System.out.println("Retrieved: " + cache.get("user_2"));

        cache.showStatistics();

        // Simulate waiting for expiration
        try {
            Thread.sleep(11000); // 11 seconds
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Retrieved after expiration: " + cache.get("user_2"));
        cache.showStatistics();
    }
}
