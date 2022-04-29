package lt.viko.eif.amvisnevskij.bookstore.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Stores the information about customer's payment.
 */

@XmlType(propOrder = {"cardNumber", "cardHolder", "expirationDate", "billedAmount"})
public class Payment {
    private String cardNumber;
    private String cardHolder;
    private String expirationDate;
    private double billedAmount;

    public Payment(String cardNumber, String cardHolder, String expirationDate, double billedAmount) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expirationDate = expirationDate;
        this.billedAmount = billedAmount;
    }

    public Payment() {
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setBilledAmount(double billedAmount) {
        this.billedAmount = billedAmount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public double getBilledAmount() {
        return billedAmount;
    }

    @Override
    public String toString() {
        return "\n\tCustomer's Payment data\nCredit Card Number: " + cardNumber
                + "\nCredit Card Holder: " + cardHolder
                + "\nExpiration Data: " + expirationDate
                + "\nAmount Billed: " + billedAmount;
    }
}
