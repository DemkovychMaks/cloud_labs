package com.example.claud_lab.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor

@Table(name = "library")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "amount_of_downloaded_songs")
    private Integer amountOfDownloadedSongs;

    @Column(name = "amount_of_liked_songs")
    private Integer amountOfLikedSongs;

    @Column(name = "amount_of_downloaded_albums")
    private Integer amountOfDownloadedAlbums;

    @Column(name = "amount_of_liked_albums")
    private Integer amountOfLikedAlbums;

    @Column(name = "amount_of_subscribed_singers")
    private Integer amountOfSubscribedSingers;

    public Library(int id, Integer amountOfDownloadedSongs, Integer amountOfLikedSongs, Integer amountOfDownloadedAlbums, Integer amountOfLikedAlbums, Integer amountOfSubscribedSingers) {
        this.id = id;
        this.amountOfDownloadedSongs = amountOfDownloadedSongs;
        this.amountOfLikedSongs = amountOfLikedSongs;
        this.amountOfDownloadedAlbums = amountOfDownloadedAlbums;
        this.amountOfLikedAlbums = amountOfLikedAlbums;
        this.amountOfSubscribedSingers = amountOfSubscribedSingers;

    }

    public Library(Integer amountOfDownloadedSongs, Integer amountOfLikedSongs, Integer amountOfDownloadedAlbums, Integer amountOfLikedAlbums, Integer amountOfSubscribedSingers) {
        this.amountOfDownloadedSongs = amountOfDownloadedSongs;
        this.amountOfLikedSongs = amountOfLikedSongs;
        this.amountOfDownloadedAlbums = amountOfDownloadedAlbums;
        this.amountOfLikedAlbums = amountOfLikedAlbums;
        this.amountOfSubscribedSingers = amountOfSubscribedSingers;
    }


    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", amountOfDownloadedSongs=" + amountOfDownloadedSongs +
                ", amountOfSongs=" + amountOfLikedSongs +
                ", amountOfDownloadedAlbums=" + amountOfDownloadedAlbums +
                ", amountOfLikedAlbums=" + amountOfLikedAlbums +
                ", amountOfSubscribedSingers=" + amountOfSubscribedSingers +
                '}';
    }
}
