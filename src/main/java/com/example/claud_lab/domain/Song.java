package com.example.claud_lab.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor

@Table(name = "song")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "amount_of_likes")
    private Integer amountOfLikes;

    @Column(name = "amount_of_downloads")
    private Integer amountOfDownloads;

    @Column(name = "streams")
    private Integer streams;

    @Column(name = "singer_id")
    private Integer singerId;


    public Song(int id, String title, Integer amountOfLikes, Integer amountOfDownloads, Integer streams, Integer singerId) {
        this.id = id;
        this.title = title;
        this.amountOfLikes = amountOfLikes;
        this.amountOfDownloads = amountOfDownloads;
        this.streams = streams;
        this.singerId = singerId;
    }

    public Song(String title, Integer amountOfLikes, Integer amountOfDownloads, Integer streams, Integer singerId) {
        this.title = title;
        this.amountOfLikes = amountOfLikes;
        this.amountOfDownloads = amountOfDownloads;
        this.streams = streams;
        this.singerId = singerId;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title +
                ", amountOfLikes=" + amountOfLikes +
                ", amountOfDownloads=" + amountOfDownloads +
                ", streams=" + streams +
                ", singerId=" + singerId +
                '}';
    }
}