package com.hans.soccer.bet.msfootballteam.serv;

import com.hans.soccer.bet.msfootballteam.ent.FootballTeam;

import java.util.List;
import java.util.Optional;

public interface FootballTeamService {

    List<FootballTeam> findAll();

    FootballTeam save(FootballTeam entity);

    Optional<FootballTeam> findById(Long id);
}
