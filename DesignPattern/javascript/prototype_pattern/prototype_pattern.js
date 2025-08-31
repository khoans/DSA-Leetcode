class FifaOnlinePlayer {
    constructor(name, team, position, goals) {
        this.name = name;
        this.team = team;
        this.position = position;
        this.goals = goals;
    }

    score() {
        this.goals++;
    }

    clone() {
        return new FifaOnlinePlayer(this.name, this.team, this.position, this.goals);
    }
}

FifaOnlinePlayer.prototype.stats = {
    minutesPlayed: 0
}

// Usage
const protoTypePattern = new FifaOnlinePlayer("CR7", "Al Nassr", "FW", 0);

const cr7 = protoTypePattern.clone();
// Modifying the stats of cr7 will  affect the prototype or m10 -> shared reference, need to shallow copy the stats object
cr7.stats.minutesPlayed = 1000;
const m10 = protoTypePattern.clone();

m10.name = "Messi";
m10.team = "Inter Miami";

cr7.score();
console.log(`${cr7.name} has scored ${cr7.goals} goals.Played ${cr7.stats.minutesPlayed}`); // CR7 has scored 1 goals.

m10.score();
m10.score();
console.log(`${m10.name} has scored ${m10.goals} goals.Played ${m10.stats.minutesPlayed}`); // Messi has scored 2 goals.
