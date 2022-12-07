package com.hans.soccer.bet.msfootballteam.ent;

import jakarta.persistence.*;

@Entity
@Table(name = "football_teams")
public class FootballTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String description;

    public FootballTeam(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public FootballTeam() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
