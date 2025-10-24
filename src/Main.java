public class Main {
    public static void main(String[] args) {
        NotificationManager mgr = new NotificationManager();

        mgr.addChannel(new Email("no-reply@monapp.com"));
        mgr.addChannel(new SMS("+33123456789"));
        mgr.addChannel(new Push("com.monapp.id"));

        mgr.broadcast("user@example.com", "Votre commande est expédiée.");
        mgr.broadcast("+33987654321", "Votre code de vérification est 123456.");
    }
}