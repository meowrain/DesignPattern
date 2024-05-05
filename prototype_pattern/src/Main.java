public class Main {
    public static void main(String[] args) {
        Client client = new Client("computer","work");
        Client cloneClient = (Client) client.clone();
        System.out.println(client == cloneClient); //false
        System.out.println("client"+client);
        System.out.println();
        System.out.println("client clone:"+ cloneClient);
    }
}
