package com.piiamiia.testspring.details;

public class DetailsDB {
    private static Details details = new Details("May 13, 2017", "Premium account for €2.99/month", "GO Server");

    public static Details getDetails() {
        return details;
    }

    public static void setDetails(Details details) {
        DetailsDB.details = details;
    }
}