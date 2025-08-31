class ServiceLogistics {
    constructor(doors = 6, price = '100.000 VND', truck = 'Truck 10') {
        this.name = name;
        this.doors = doors;
        this.price = price;
    }

    static getTransport = (cargoVolume) => {
        switch (cargoVolume) {
            case '10':
                return new ServiceLogistics(6, '100.000 VND', 'Truck 10');
            case '20':
                return new ServiceLogistics(16, '200.000 VND', 'Truck 20');
        }
    }
}
