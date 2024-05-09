package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String email;
    StockObservable observable;

    public EmailAlertObserverImpl(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(email, "Product is in stock, hurry up!");
    }

    private void sendEmail(String email, String msg) {
        System.out.println("Mail has been sent to: " + email);
    }
}
