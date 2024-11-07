package Bank;

import java.util.Date;

public class paymentHistory {
    private Date paymentDate;
    private  double amount;
    private String paymentMethod;

    public paymentHistory(Date paymentDate, double amount,String paymentMethod){
        this.paymentDate= paymentDate;
        this.amount= amount;
        this.paymentMethod=paymentMethod;

    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Date: " + paymentDate + ", Amount: " + amount + ", Method: " + paymentMethod;
    }
}
