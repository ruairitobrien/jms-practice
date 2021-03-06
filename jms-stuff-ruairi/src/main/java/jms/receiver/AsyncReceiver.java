package jms.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jms.model.Notification;

@Component("asyncReceiver")
public class AsyncReceiver {
	@Autowired
	private NotificationRegistry registry;

	public void receiveMessage(Notification notification) {
		registry.registerNotification(notification);
	}
}
