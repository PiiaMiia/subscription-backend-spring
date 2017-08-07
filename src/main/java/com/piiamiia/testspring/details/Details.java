package com.piiamiia.testspring.details;

public class Details {
    private String nextDate;
    private String serviceType;
    private String serviceProvider;

    public Details(String nextDate, String serviceType, String serviceProvider) {
        this.nextDate = nextDate;
        this.serviceType = serviceType;
        this.serviceProvider = serviceProvider;
    }

    public String getNextDate() {
        return nextDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

}

