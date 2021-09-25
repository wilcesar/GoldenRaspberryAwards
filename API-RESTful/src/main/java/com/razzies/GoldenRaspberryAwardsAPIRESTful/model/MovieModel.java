package com.razzies.GoldenRaspberryAwardsAPIRESTful.model;

import javax.persistence.*;

@Entity(name = "movielist")
public class MovieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer id;

    @Column(name = "title", nullable = false, length = 200)
    public String title;

    @Column(name = "studios", nullable = false, length = 200)
    public String studios;

    @Column(name = "releaseyear", nullable = false)
    public Integer year;

    @Column(name = "producers", nullable = false, length = 200)
    public String producers;

    @Column(name = "winner", nullable = true, length = 3)
    public String winner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public String getStudios() {
        return studios;
    }

    public void setStudios(String studios) {
        this.studios = studios;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getProducers() {
        return producers;
    }

    public void setProducers(String producers) {
        this.producers = producers;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
    public String toString() {
        return "Movie{title='" + title + "\', year=" + year + ", winner='" + winner + "\'}";
    }
}
