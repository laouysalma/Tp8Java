
public interface INotification {
	public void send(String recipient, String message);

	public int getPriority();

	public String getType();
}
