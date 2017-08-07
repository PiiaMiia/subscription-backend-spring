package com.piiamiia.testspring.bills;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillsController {

    @RequestMapping("/bills")
    public List<Bills> getBills() {
        return BillsDB.getAll();
    }
}
