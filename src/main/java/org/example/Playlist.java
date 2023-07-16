package org.example;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private static List<Song>songList=new ArrayList<>();
    public static void addToPlayList(Song song){
        songList.add(song);
    }
    public List<Song> getPlayList(){
        return songList;
    }
    public static void playPlaylist() {
        for (Song song : songList) {
            System.out.println("playing the song" + song.getSongName() + song.getSinger());
        }
    }
    public static void playThisSong(Song song){
        for(Song song1:songList){
            if(song1.getSongName().equalsIgnoreCase(song.getSongName())){
                System.out.println("playing the searched song");
            }
        }
    }
}
