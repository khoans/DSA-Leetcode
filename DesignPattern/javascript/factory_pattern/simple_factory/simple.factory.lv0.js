const serviceLogistics = (cargoVolume) => {
    switch (cargoVolume) {
        case '10':
            return {
                name: 'Truck 10',
                doors: 6,
                price: '100.000VND'
            }
        case '20':
            return {
                name: 'Truck 20',
                doors: 16,
                price: '200.000VND'
            }
    }
}

console.log(serviceLogistics('10'))
