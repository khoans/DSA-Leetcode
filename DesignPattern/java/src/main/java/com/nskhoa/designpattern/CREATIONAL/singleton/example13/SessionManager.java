package com.nskhoa.designpattern.CREATIONAL.singleton.example13;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SessionManager {
    private static SessionManager instance;
    private Map<String, SessionManager.UserSession> sessions;
    private static final long SESSION_TIMEOUT = 1800000; // 30 minutes

    public static class UserSession {
        private String sessionId;
        private String userId;
        private String username;
        private LocalDateTime loginTime;
        private LocalDateTime lastAccessTime;
        private Map<String, Object> attributes;

        public UserSession(String userId, String username) {
            this.sessionId = UUID
                    .randomUUID().toString();
            this.userId = userId;
            this.username = username;
            this.loginTime = LocalDateTime.now();
            this.lastAccessTime = LocalDateTime.now();
            this.attributes = new HashMap<>();
        }

        public String getSessionId() {
            return sessionId;
        }

        public String getUserId() {
            return userId;
        }

        public String getUsername() {
            return username;
        }

        public void updateLastAccessTime() {
            this.lastAccessTime = LocalDateTime.now();
        }

        public void setAttribute(String key, Object value) {
            attributes.put(key, value);
        }

        public Object getAttribute(String key) {
            return attributes.get(key);
        }

        public boolean isExpired() {
            return System.currentTimeMillis() -
                   java.sql.Timestamp.valueOf(lastAccessTime).getTime() > SESSION_TIMEOUT;
        }

        @Override
        public String toString() {
            return String.format("Session[id=%s, user=%s, loginTime=%s]",
                                 sessionId, username, loginTime);
        }
    }

    private SessionManager() {
        sessions = new HashMap<>();
        System.out.println("SessionManager initialized");
    }

    public static synchronized SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public String createSession(String userId, String username) {
        SessionManager.UserSession session = new SessionManager.UserSession(userId, username);
        sessions.put(session.getSessionId(), session);
        System.out.println("Session created: " + session);
        return session.getSessionId();
    }

    public SessionManager.UserSession getSession(String sessionId) {
        SessionManager.UserSession session = sessions.get(sessionId);
        if (session != null) {
            if (session.isExpired()) {
                sessions.remove(sessionId);
                System.out.println("Session expired: " + sessionId);
                return null;
            }
            session.updateLastAccessTime();
        }
        return session;
    }

    public void invalidateSession(String sessionId) {
        SessionManager.UserSession session = sessions.remove(sessionId);
        if (session != null) {
            System.out.println("Session invalidated: " + session.getUsername());
        }
    }

    public void cleanExpiredSessions() {
        int removed = 0;
        sessions.entrySet().removeIf(entry -> {
            if (entry.getValue().isExpired()) {
                System.out.println("Removing expired session: " + entry.getValue().getUsername());
                return true;
            }
            return false;
        });
    }

    public void showActiveSessions() {
        System.out.println("\n=== Active Sessions ===");
        System.out.println("Total sessions: " + sessions.size());
        sessions.values().forEach(session ->
                                          System.out.println(session)
                                 );
    }

    public int getActiveSessionCount() {
        return sessions.size();
    }

    public static void main(String[] args) {
        SessionManager sessionMgr = SessionManager.getInstance();

// Tạo session khi user đăng nhập
        String sessionId = sessionMgr.createSession("user123", "john_doe");

// Lấy session
        SessionManager.UserSession session = sessionMgr.getSession(sessionId);
        if (session != null) {
            session.setAttribute("role", "admin");
            session.setAttribute("department", "IT");
        }

// Hiển thị sessions
        sessionMgr.showActiveSessions();

// Đăng xuất
        sessionMgr.invalidateSession(sessionId);
    }
}
