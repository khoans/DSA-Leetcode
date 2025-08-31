class Car {
    constructor(name = 'Ford Ranger 2023', doors = 4, price = '10 VND', customerInfo = {}) {
        this.name = name;
        this.doors = doors;
        this.price = price;
        this.customerInfo = customerInfo;
    }
}

class ServiceLogistics {
    transportClass = Car

    getTransport = (customerInfo) => {
        return new this.transportClass(customerInfo);
    }
}


const carService = new ServiceLogistics();
console.log('CarService::', carService.getTransport({
    name: 'Toyota Fortuner 2023',
    doors: 4,
    price: '2.000.000 VND',
    customerInfo: {
        name: "Nguyen Van A",
        phone: "0123456789",
    }
}));


// Cach 1
class Truck {
    constructor(name = 'Truck 10', doors = 16, price = '100.000 VND', customerInfo = {}) {
        this.name = name;
        this.doors = doors;
        this.price = price;
        this.customerInfo = customerInfo;
    }
}

carService.transportClass = Truck;
console.log('TruckService::', carService.getTransport({
    name: 'Truck 20',
    doors: 16,
    price: '200.000 VND',
    customerInfo: {
        name: "Nguyen Van B",
        phone: "0987654321",
    }
}));

// Cach 2
class TruckService extends ServiceLogistics {
    transportClass = Truck
}

const truckService = new TruckService();

console.log('TruckService::', truckService.getTransport({
    name: 'Truck 20',
    doors: 16,
    price: '200.000 VND',
    customerInfo: {
        name: "Nguyen Van B",
        phone: "0987654321",
    }}));
