package com.learning.spring.game;

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
    public Team getAwayTeam() {
        return null;
    }

    @Override
    public Team getHomeTeam() {
        return null;
    }

    @Override
    public void playGame() {
        System.out.println( "Game between " + this.homeTeam.getName() + " vs " + this.awayTeam.getName()  );
    }
}
