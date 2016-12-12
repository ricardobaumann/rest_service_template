package com.github.ricardobaumann.rest_template.controllers;

import com.github.ricardobaumann.rest_template.SampleService;
import com.github.ricardobaumann.rest_template.dtos.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ricardobaumann on 12/12/16.
 */
@RestController
@RequestMapping(value = "samples")
public class SampleControllers {

    @Autowired
    private SampleService sampleService;

    @RequestMapping(method = RequestMethod.GET)
    public Sample get() {
        return sampleService.newSample();
    }

}
