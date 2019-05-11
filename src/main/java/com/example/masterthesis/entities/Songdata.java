package com.example.masterthesis.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Songdata {
    private String artist;
    private String song;
    private String link;
    private String text;

    @Basic
    @Column(name = "artist")
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Basic
    @Column(name = "song")
    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Column(name = "link")
    @Id
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Basic
    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Songdata songdata = (Songdata) o;
        return Objects.equals(artist, songdata.artist) &&
                Objects.equals(song, songdata.song) &&
                Objects.equals(link, songdata.link) &&
                Objects.equals(text, songdata.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, song, link, text);
    }
}
