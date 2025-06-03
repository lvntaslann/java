package service;

import model.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {
    List<PaymentMethod> paymentMethods = new ArrayList<>();

    public void makePayment(PaymentMethod method) {
        method.processPayment();

        if (method.isSuccess()) {
            paymentMethods.add(method);
        } else {
            System.out.println("Ödeme başarısız olduğu için kaydedilmedi.");
        }
    }

    public void getPaymentHistory() {
        if (paymentMethods.isEmpty()) {
            System.out.println("Henüz hiç ödeme yapılmadı.");
            return;
        }

        System.out.println("Ödeme Geçmişi:");
        for (PaymentMethod paymentMethod : paymentMethods) {
            System.out.println("- " + paymentMethod);
        }
    }
}
