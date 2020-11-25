package decorator;

public class Client {

    public static void main(String[] args) {
        Message message = new HtmlEncodedMessage(new TextMessage("Anil <FORCE> Patro"));
        System.out.println(message.getContent());

        message = new Base64EncodedMessage(message);
        System.out.println(message.getContent());

    }
}
