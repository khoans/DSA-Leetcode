class FifaOnlinePlayer {
    constructor(builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.nationality = builder.nationality;
        this.position = builder.position;
        this.team = builder.team;
        this.stats = builder.stats;
    }

    toString() {
        let player = `Player:\n`;
        player += `Name: ${this.name}\n`;
        player += `Age: ${this.age}\n`;
        player += `Nationality: ${this.nationality}\n`;
        player += `Position: ${this.position}\n`;
        player += `Team: ${this.team}\n`;
        player += `Stats: ${JSON.stringify(this.stats, null, 2)}\n`;
        return player;
    }
}

class FifaOnlinePlayerBuilder {
    constructor() {
        this.name = '';
        this.age = 0;
        this.nationality = '';
        this.position = '';
        this.team = '';
        this.stats = {};
    }

    withName(name) {
        this.name = name;
        return this;
    }

    withAge(age) {
        this.age = age;
        return this;
    }

    withNationality(nationality) {
        this.nationality = nationality;
        return this;
    }

    withPosition(position) {
        this.position = position;
        return this;
    }

    withTeam(team) {
        this.team = team;
        return this;
    }

    withStats(stats) {
        this.stats = stats;
        return this;
    }

    build() {
        return new FifaOnlinePlayer(this);
    }
}

// Usage
const player1 = new FifaOnlinePlayerBuilder()
    .withName('Cristiano Ronaldo')
    .withAge(39)
    .withNationality('Portugal')
    .withPosition('Forward')
    .withTeam('Al Nassr')
    .withStats({goals: 5, assists: 2})
    .build();

console.log(player1.toString());

const player2 = new FifaOnlinePlayerBuilder()
    .withName('Lionel Messi')
    .withAge(36)
    .withNationality('Argentina')
    .withPosition('Forward')
    .withTeam('Inter Miami')
    .withStats({goals: 7, assists: 3})
    .build();

console.log(player2.toString());
