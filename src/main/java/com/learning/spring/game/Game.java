package com.learning.spring.game;

/**
 * Created by rin9790 on 4/01/18.
 */
public interface Game {

    Team getHomeTeam();

    Team getAwayTeam();

    void setHomeTeam(Team team);


    void setAwayTeam(Team team);

    void playGame();



}
