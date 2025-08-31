class MomoPaymentAdapter {
    constructor(momoPayment) {
        this.momoPayment = momoPayment;
    }

    payWithVisa(visaPayment) {
        const convertedPayment = this.convertToVisaPayment(this.momoPayment);

        visaPayment.pay(convertedPayment);
    }

    convertToVisaPayment(momoPayment) {
        const conversionRate = 23000;
        const visaAmount = momoPayment.amount  / conversionRate;
        const visaPayment = {
            cardNumber: momoPayment.cardNumber,
            expiryDate: momoPayment.expiryDate,
            cvv: momoPayment.cvv,
            amount: visaAmount
        }

        return visaPayment;
    }
}

class VisaPayment {
    pay(payment) {
        console.log(`Paying ${payment.amount} USD with Visa Card ${payment.cardNumber}`)
    }

}

class MomoPayment {
    constructor(cardNumber, expiryDate, cvv, amount) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.amount = amount; // in VND
    }
}

const momoPayment = new MomoPayment('1234-5678-9012-3456', '12/25', '123', 230000);

const momoAdapter = new MomoPaymentAdapter(momoPayment);
const visaPayment = new VisaPayment();

momoAdapter.payWithVisa(visaPayment); // Paying 10 USD with Visa Card 1234-5678-9012-3456
