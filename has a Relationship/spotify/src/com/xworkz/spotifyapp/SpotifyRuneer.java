package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.songs.Songs;
import com.xworkz.spotifyapp.spotifyy.Spotify;

public class SpotifyRuneer {
    public static void main(String[] args) {
        System.out.println("main started");

        Spotify spotify=new Spotify();
        spotify.song="Kavithe Kavithe";

        Songs songs=new Songs();//null;
        songs.id=1;
        songs.lyricsWriter="YogRaj Bhat";
        songs.singer="Vijay Prakash";
        songs.musicComposer="V HariKrishna";
        //we can call allow method here only after initialization before we give it will error
        spotify.allow(songs);


        System.out.println("main ended");
    }
}
