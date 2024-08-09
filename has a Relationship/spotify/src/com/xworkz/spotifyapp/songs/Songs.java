package com.xworkz.spotifyapp.songs;

public class Songs {
    public int id;
    public  String lyricsWriter;
    public String singer;
    public String musicComposer;


    public void getSongsDetails(){
        System.out.println("Id: "+id);
        System.out.println("Lyrics Writer Name: "+lyricsWriter);
        System.out.println("Singer Name: "+singer);
        System.out.println("Music Composer Name: "+musicComposer);

    }
}
