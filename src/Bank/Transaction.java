package Bank;
import java.util.Date;

public class Transaction {
    private Date date;
    private String type;
    private double  amount;


    public Transaction(Date date, String type, double amount){
        this.date =date;
        this.type = type;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount > 0){
            this.amount = amount;}
        else {this.amount = 0.0;}
    }

    public String getType() {
        return type;
    }
    public void setType(String type){
        this.type=type;
    }


}
