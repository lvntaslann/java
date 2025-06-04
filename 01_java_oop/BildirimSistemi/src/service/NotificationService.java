package service;
import model.Notification;
import java.util.ArrayList;
import java.util.List;
import model.Notification;

import java.util.ArrayList;

public class NotificationService {
    private List<Notification> history = new ArrayList<>();

    public void sendNotification(Notification notification){
        notification.send();
        history.add(notification);
    }

    public void showHistory(){
        System.out.println("Gönderilen bildirimler");
        for(Notification notification:history){
            System.out.println("-"+notification.getClass().getSimpleName()+ ": "+notification.getMessage());
        }
    }
}
