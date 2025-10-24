
public class SMS implements INotification {
	private String sender;

	public SMS(String sender) {
		this.sender = sender;
	}

	@Override
	public void send(String recipient, String message) {
		System.out.printf("[SMS] From: %s To: %s — %s%n", sender, recipient, message);
	}

	@Override
	public int getPriority() {
		return 2;
	}

	@Override
	public String getType() {
		return "SMS";
	}

}
