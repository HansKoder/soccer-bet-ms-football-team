package com.hans.soccer.bet.msfootballteam.api;

import com.hans.soccer.bet.msfootballteam.ent.FootballTeam;
import com.hans.soccer.bet.msfootballteam.serv.FootballTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{teamId}")
    ResponseEntity<?> getFootballTeam (@PathVariable Long teamId) {
        Optional<FootballTeam> opt = service.findById(teamId);

        if (opt.isEmpty()) {
            String msg = "Not found team with the ID " + teamId;
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonMap("error", msg));
        }

        return ResponseEntity.ok(opt.get());
    }

}
