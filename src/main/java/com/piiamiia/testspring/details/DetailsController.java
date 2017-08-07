package com.piiamiia.testspring.details;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {

    @RequestMapping("/details")
    public Details details() {
        return new Details("01.08.2017", "Premium account", "Go Service");
    }
}