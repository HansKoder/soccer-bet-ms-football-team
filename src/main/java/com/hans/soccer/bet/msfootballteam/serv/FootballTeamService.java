package com.hans.soccer.bet.msfootballteam.serv;

import com.hans.soccer.bet.msfootballteam.ent.FootballTeam;

import java.util.List;

public interface FootballTeamService {

    List<FootballTeam> findAll();

    FootballTeam save(FootballTeam entity);
}
