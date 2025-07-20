public class Buyer {
    Payment payment;

    public void setPayment(Payment payment){
        this.payment = payment;
    }

    public String pay(){
        return "Paying With "+ payment.Description();
    }
}
