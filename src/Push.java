
public class Push implements INotification {
	private String appId;

	public Push(String appId) {

		this.appId = appId;
	}

	@Override
	public void send(String recipient, String message) {
		System.out.printf("[Push] From: %s To: %s — %s%n", appId, recipient, message);
	}

	@Override
	public int getPriority() {
		return 0;
	}

	@Override
	public String getType() {
		return "push";
	}

}
