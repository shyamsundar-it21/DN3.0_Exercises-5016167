package com.example.observer;

public class MobileApp implements Observer {
    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("Mobile App [" + appName + "]: Stock price updated to " + stockPrice);
    }
}
