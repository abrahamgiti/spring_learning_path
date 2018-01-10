package com.learning.spring.game;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;


/**
 * Created by rin9790 on 4/01/18.
 */
public class BaseballGame implements Game
{

    private Team awayTeam;
    private Team homeTeam;
    private DataSource dataSource;


    public BaseballGame(){

    }

    public BaseballGame(Team awayTeam, Team homeTeam) {
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    @Override
    public Team getAwayTeam() {
        return null;
    }

    @Override
    public Team getHomeTeam() {
        return null;
    }

    @Override
    public void playGame() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Game between " + this.homeTeam.getName() + " vs " + this.awayTeam.getName();
    }

    @PostConstruct
    public void startGame() {
        System.out.println("Playing");
    }

    @PreDestroy
    public void endGame() {
        System.out.println("Sending highlights");
    }



}
