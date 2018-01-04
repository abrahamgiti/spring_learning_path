package com.learning.spring.game;

import org.springframework.stereotype.Component;

/**
 * Created by rin9790 on 4/01/18.
 */
@Component
public class RedSocks implements Team {

    @Override
    public String getName() {
        return "RED SOCKS";
    }
}
