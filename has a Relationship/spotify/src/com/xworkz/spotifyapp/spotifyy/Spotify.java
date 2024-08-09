package com.xworkz.spotifyapp.spotifyy;

import com.xworkz.spotifyapp.songs.Songs;

public class Spotify {

    public  String song;
    public Songs ref;
       public boolean allow(Songs ref){
           boolean isAllowed=false;

           if(song=="Kavithe Kavithe"){
               System.out.println("Song matches......");
               if (ref!=null){
                   this.ref=ref;
                   this.ref.getSongsDetails();
                   isAllowed=true;
                   System.out.println("All information matches.....Song being played");
               }else System.out.println("Song found ,but not all information matches...");
           }else System.out.println("Sorry the requested Song is not available....");
           return isAllowed;
       }
}
