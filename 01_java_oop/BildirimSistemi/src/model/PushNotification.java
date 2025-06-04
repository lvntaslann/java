package model;

public class PushNotification extends Notification {
    private  String devieId;

    public PushNotification(String message,String deviceId){
        super(message);
        this.devieId = deviceId;
    }

    @Override
    public void send() {
        System.out.println("Push bildirimi gönderildi: "+ message+" --> Cihaz ID:" + devieId);
    }
}
