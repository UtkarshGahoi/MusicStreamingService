package org.example;

public class Song {
    private String songName;
    private String singer;
    private String length;

    public Song(String songName, String singer, String length) {
        this.songName = songName;
        this.singer = singer;
        this.length = length;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
