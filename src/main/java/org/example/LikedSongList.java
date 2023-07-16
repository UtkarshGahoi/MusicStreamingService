package org.example;

import java.util.ArrayList;
import java.util.List;

public class LikedSongList {
    public static List<Song>LikedSongList=new ArrayList<>();
    public static void addSongToLikedSong(Song song){
      LikedSongList.add(song);
    }
    public List<Song>getLikedSongList(){
        return LikedSongList;
    }
    public static void  playList(){
        for(Song song:LikedSongList){
            System.out.println("in the liked song list"+song.getSongName());
            System.out.println("in the liked sonng "+"the song name is "+song.getSongName());
        }
    }
    public static void playThisSong(Song song){
        for(Song song1:LikedSongList){
            if(song1.getSongName().equalsIgnoreCase(song.getSongName())){
                System.out.println("playing the searched song in the LikedSongList");
            }
        }
    }
    public static void removeSongFromPlayList(Song song){
        System.out.println("removing the song form the playlist");
        LikedSongList.remove(song);
    }
}
