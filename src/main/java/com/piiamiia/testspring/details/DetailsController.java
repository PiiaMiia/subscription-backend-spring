package com.piiamiia.testspring.details;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
public class DetailsController {

    @RequestMapping(method=GET, value="/details")
    public Details getDetails() {
        return DetailsDB.getDetails();
    }

    @RequestMapping(method=DELETE, value="/details")
    public Details deleteDetails() {
        return new Details("","Free","GO Service");
    }

    @RequestMapping(method=POST, value="/details")
    public Details restoreDetails() {
        return new Details("01.09.2017", "Premium account", "Go Service");
    }
}