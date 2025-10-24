
public class Email implements INotification {
	private String fromAdress;

	public Email(String fromAdress) {

		this.fromAdress = fromAdress;
	}

	@Override
	public void send(String recipient, String message) {
		System.out.printf("[Email] From: %s To: %s — %s%n", fromAdress, recipient, message);
	}

	@Override
	public int getPriority() {
		return 1;
	}

	@Override
	public String getType() {
		return "Email";
	}
}
