public class Client {
    public static void main(String[] args) throws Exception {
        Broker.buyShare("Facebook", 10);
        Broker.sellShare("Google", 20);
    }
}
