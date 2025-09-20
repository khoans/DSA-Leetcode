import {MinPriorityQueue} from '@datastructures-js/priority-queue';

class TimeLimitedCache {
    cache = {};
    queue = new MinPriorityQueue();
    size = 0;

    handleExpiredData() {
        const now = Date.now();
        while (this.queue.size() > 0 && this.queue.front().priority < now) {
            const entry = this.queue.dequeue().element;
            if (!entry.overwritten) {
                delete this.cache[entry.key];
                this.size -= 1;
            }
        }
    };

    set(key, value, duration) {
        this.handleExpiredData();
        const hasVal = key in this.cache
        if (hasVal) {
            this.cache[key].overwritten = true
        } else {
            this.size += 1;
        }
        const expiration = Date.now() + duration;
        const entry = {key, value, expiration, overwritten: false}
        this.cache[key] = entry
        this.queue.enqueue(entry, expiration);
        return hasVal;
    }

    get(key) {
        this.handleExpiredData();
        if (this.cache[key] === undefined) return -1;
        return this.cache[key].value;
    }

    count() {
        this.handleExpiredData();
        return this.size;
    }
};

const cache = new TimeLimitedCache();

async function getFileWithCache(filename) {
    let content = cache.get(filename);
    if (content !== -1) return content;
    content = await loadFileContents(filename);
    const ONE_HOUR = 60 * 60 * 1000;
    cache.set(filename, content, ONE_HOUR);
    return content;
}
