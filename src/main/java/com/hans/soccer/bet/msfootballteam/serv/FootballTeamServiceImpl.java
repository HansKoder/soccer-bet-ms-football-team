package com.hans.soccer.bet.msfootballteam.serv;

import com.hans.soccer.bet.msfootballteam.dao.FootballTeamDao;
import com.hans.soccer.bet.msfootballteam.ent.FootballTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootballTeamServiceImpl implements FootballTeamService{

    @Autowired
    private FootballTeamDao dao;

    @Override
    public List<FootballTeam> findAll() {
        return dao.findAll();
    }

    @Override
    public FootballTeam save(FootballTeam entity) {
        return dao.save(entity);
    }
}
