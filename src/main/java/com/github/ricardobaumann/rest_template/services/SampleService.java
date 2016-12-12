package com.github.ricardobaumann.rest_template.services;

import com.github.ricardobaumann.rest_template.configurations.Config;
import com.github.ricardobaumann.rest_template.dtos.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ricardobaumann on 12/12/16.
 */
@Service
public class SampleService {

    @Autowired
    private Config config;

    public Sample newSample() {
        return new Sample(config.getMessage());
    }

}
