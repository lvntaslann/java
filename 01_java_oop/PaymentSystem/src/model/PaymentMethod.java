package model;

public abstract class PaymentMethod {
    private double amount;
    private boolean success;
      public PaymentMethod(double amount){
          this.amount =amount;
      }

    public double getAmount() {
        return amount;
    }

    public boolean isSuccess(){
          return success;
    }

    public void setSuccess(boolean success){
          this.success =success;

    }
    public abstract void processPayment();
}
