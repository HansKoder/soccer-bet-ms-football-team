package com.hans.soccer.bet.msfootballteam.dao;

import com.hans.soccer.bet.msfootballteam.ent.FootballTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballTeamDao extends JpaRepository<FootballTeam, Long> {
}
