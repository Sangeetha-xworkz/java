package com.flimindustry.movieinformation;
import com.flimindustry.movieinformation.dto.MovieDto;
import com.flimindustry.movieinformation.dao.MovieDao;

public class MovieRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        MovieDto ref=new MovieDto();
         ref.movieName="Bahubali";
         ref.heroName="Prabhas";
         ref.heroineName="Anushka Shetty";
         ref.directorName="S.S. Rajamouli";

         MovieDao mov=new MovieDao();
         boolean isMovieInfoAdded=mov.addAllActors(ref);
        System.out.println("Movie Information added: "+isMovieInfoAdded);
        mov.getMovieInfo();
        System.out.println("main ended");
    }
}
