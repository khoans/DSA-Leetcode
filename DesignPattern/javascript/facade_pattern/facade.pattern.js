class Discount {
    calc(value) {
        return value * 0.9;
    }
}

class Shipping {
    calc() {
        return 5;
    }
}

class Fees {
    calc(value) {
        return value * 1.05;
    }
}


class PriceFacade {
    constructor() {
        this.discount = new Discount();
        this.shipping = new Shipping();
        this.fees = new Fees();
    }

    getFinalPrice(originalPrice) {
        const priceAfterDiscount = this.discount.calc(originalPrice);
        const priceAfterFees = this.fees.calc(priceAfterDiscount);
        const shippingFee = this.shipping.calc();

        return priceAfterFees + shippingFee;
    }
}




const priceFacade = new PriceFacade();
const finalPrice = priceFacade.getFinalPrice(100);
console.log('---> Final Price:::', finalPrice);
