package com.hans.soccer.bet.msfootballteam.api;

import com.hans.soccer.bet.msfootballteam.ent.FootballTeam;
import com.hans.soccer.bet.msfootballteam.serv.FootballTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/football-teams")
public class FootballTeamRestController {

    @Autowired
    private FootballTeamService service;

    @GetMapping("/")
    ResponseEntity<List<FootballTeam>> getFootballTeams () {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/")
    ResponseEntity<FootballTeam> saveFootballTeam (@RequestBody FootballTeam entity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(entity));
    }

}
