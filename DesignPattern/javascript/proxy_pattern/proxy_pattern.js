class Leader {
    receiveRequest(offer) {
        console.log(`Boss said: OK::${offer}`)
    }
}

class Secretary {
    constructor() {
        this.leader = new Leader();
    }

    checkRequest(offer) {
        if (offer < 5000) {
            this.leader.receiveRequest(offer);
        } else {
            console.log('Secretary said: No way, too much money!!!')
        }
    }
}

class Developer {
    constructor(offer) {
        this.offer = offer;
    }

    applyFor(target) {
        target.checkRequest(this.offer)
    }
}

const developer1 = new Developer(4000);
const developer2 = new Developer(6000);

const secretary = new Secretary();

developer1.applyFor(secretary); // Boss said: OK::4000
developer2.applyFor(secretary); // Secretary said: No way, too much money!!!
