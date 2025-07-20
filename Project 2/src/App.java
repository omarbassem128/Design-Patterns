public class App {
    public static void main(String[] args) throws Exception {
        Buyer buyer1 = new Buyer();
        Buyer buyer2 = new Buyer();
        Buyer buyer3 = new Buyer();
        buyer1.setPayment(new GroupBuyers());
        buyer2.setPayment(new SingleOfflineBuyers());
        buyer3.setPayment(new SingleOnlineBuyers());
        System.out.println(buyer1.pay()); 
        System.out.println(buyer2.pay()); 
        System.out.println(buyer3.pay()); 
    }
}
