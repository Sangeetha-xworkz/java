package com.flimindustry.movieinformation.dao;
import com.flimindustry.movieinformation.dto.MovieDto;
public class MovieDao {
    MovieDto ref;

    public boolean addAllActors(MovieDto ref){
        boolean isAllActorAdded=false;

        if(ref.directorName!=null&&ref.heroineName!=null){
            this.ref=ref;
            isAllActorAdded=true;
        }else {
            System.out.println("Please Provide Required Names");
        }
        return isAllActorAdded;
    }

    public void getMovieInfo(){
        System.out.println("Movie Name: "+ref.movieName);
        System.out.println("Hero Name: "+ref.heroName);
        System.out.println("Heroine Name: "+ref.heroineName);
        System.out.println("Director Name: "+ref.directorName);
    }
}
