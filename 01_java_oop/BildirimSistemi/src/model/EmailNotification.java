package model;

public class EmailNotification extends Notification {
    private String email;

    public EmailNotification(String message,String email){
        super(message);
        this.email=email;
    }
    @Override
    public void send(){
        System.out.println("Emil gönderildi: " + message+ "-->" + email);
    }
}
