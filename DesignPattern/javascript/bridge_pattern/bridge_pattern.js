class PaymentProcess {
    payment(amount) {

    }
}

class VisaPaymentProcessor extends PaymentProcess {
    constructor(cardNumber, expiryDate, cvv) {
        super()
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv
    }

    // Implementation of the pay method for VisaPayment
    pay(amount) {
        console.log(`Paying ${amount} USD with Visa Card ${this.cardNumber}...`)
    }
}

class MomoPaymentProcess extends PaymentProcess {
    constructor(phoneNumber) {
        super()
        this.phoneNumber = phoneNumber;
    }

    // Implementation of the pay method for MomoPayment
    pay(amount) {
        console.log(`Paying ${amount} VND with Momo Account ${this.phoneNumber}...`)
    }
}


class MemberRegistration {
    constructor(paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    register() {
        const amount = 100;
        this.paymentProcessor.pay(amount);
        console.log(`Registered for Youtube Membership successfully!`)
    }
}

const visaPaymentProcessor = new VisaPaymentProcessor('1234-5678-9012-3456', '12/25', '123');
const membershipVisa = new MemberRegistration(visaPaymentProcessor)

membershipVisa.register();

const momoPaymentProcessor = new MomoPaymentProcess('0909090909')
const membershipMomo = new MemberRegistration(momoPaymentProcessor)
membershipMomo.register()
