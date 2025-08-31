class Observer {

    constructor(name) {
        this.namePick = name;
    }

    updateStatus(location) {
        this.goToHelp(location);
    }

    goToHelp(location) {
        console.log(`${this.namePick}:::PING:::${location}`);
    }
}


class Subject {

    constructor() {
        this.observers = [];
    }

    subscribe(observer) {
        this.observers.push(observer);
    }

    unsubscribe(observer) {
        this.observers = this.observers.filter(obs => obs !== observer);
    }

    notify(location) {
        this.observers.forEach(observer => observer.updateStatus(location));
    }
}

// Usage
const subject = new Subject();
const observer1 = new Observer('Alice');
const observer2 = new Observer('Bob');
const observer3 = new Observer('Charlie');
const observer4 = new Observer('David');

subject.subscribe(observer1);
subject.subscribe(observer2);
subject.subscribe(observer3);
subject.subscribe(observer4);

subject.notify('Location A');

console.log("===================")
subject.unsubscribe(observer2);
subject.notify('Location B');
