package sample;

import javax.swing.*;

public class CheckIn {
    private boolean paymentMethod;  // if true visa, else cash
    private int cardNumber;
    private int securityCode;
    public CheckIn(){}
    public CheckIn(boolean paymentMethod, int cardNumber, int securityCode) {
        this.paymentMethod = paymentMethod;
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
    }

    public boolean isPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(boolean paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }
    public void PaymentMethod(boolean paymentMethod){
        if(paymentMethod){
            this.cardNumber=cardNumber;
            this.securityCode=securityCode;
        }else{
            JOptionPane.showMessageDialog(null,"Proceed payment at the counter","payment status",1);
        }
    }
}
