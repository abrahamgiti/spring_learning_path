package com.learning.spring.game;

import org.springframework.stereotype.Component;

/**
 * Created by rin9790 on 5/01/18.
 */
@Component
public class Royals implements  Team {
    @Override
    public String getName() {
        return "The great Royals";
    }
}
