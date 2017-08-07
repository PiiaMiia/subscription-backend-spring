package com.piiamiia.testspring.bills;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class BillsDB {
    private static HashMap<AtomicLong, Bills> bills = new HashMap<AtomicLong, Bills>();

    static {
        bills.put(new AtomicLong(), new Bills("13.04.17", "13.04.17-12.05.17", "€", "2.99"));
        bills.put(new AtomicLong(), new Bills("12.03.17", "12.03.17-12.04.17", "€", "2.99"));
        bills.put(new AtomicLong(), new Bills("12.02.17", "12.02.17-12.03.17", "€", "2.99"));
    }


    public static List<Bills> getAll() {
        List<Bills> result = new ArrayList<Bills>();
        for (AtomicLong key : bills.keySet()) {
            result.add(bills.get(key));
        }
        return result;
    }
}