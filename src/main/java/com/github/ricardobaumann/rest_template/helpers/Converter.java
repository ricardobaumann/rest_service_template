package com.github.ricardobaumann.rest_template.helpers;

import lombok.SneakyThrows;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 * Created by ricardobaumann on 07/12/16.
 */
@Component
public class Converter {

    @SneakyThrows
    public <T> T convertFrom(Object from, Class<T> destClass) {
        T t = destClass.newInstance();
        BeanUtils.copyProperties(from,t);
        return t;
    }

}
