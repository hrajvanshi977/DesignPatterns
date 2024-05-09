package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneObservableImpl;
import ObserverDesignPattern.Observable.StockObservable;
import ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("asd@gmail.com", iphoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("asdf@gmail.com", iphoneObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("9999999990", iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(3);
        iphoneObservable.setStockCount(12);
        iphoneObservable.setStockCount(0);
        iphoneObservable.setStockCount(1);
    }
}
