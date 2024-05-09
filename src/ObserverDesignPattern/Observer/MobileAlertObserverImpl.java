package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String phoneNumber;
    StockObservable observable;

    public MobileAlertObserverImpl(String phoneNumber, StockObservable observable) {
        this.phoneNumber = phoneNumber;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(phoneNumber, "Product is in stock, hurry up!");
    }

    private void sendEmail(String phoneNumber, String msg) {
        System.out.println("Msg has been sent to: " + phoneNumber);
    }
}
