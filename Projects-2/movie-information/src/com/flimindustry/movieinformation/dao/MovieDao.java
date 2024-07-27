package com.flimindustry.movieinformation.dao;
import com.flimindustry.movieinformation.dto.MovieDto;
public class MovieDao {
    MovieDto ref;

    public boolean addAllActors(MovieDto ref){
        boolean isAllActorAdded=false;
        boolean isMovieName=false;
        boolean isHeroName=false;
        boolean isHeroineName=false;
        boolean isDirectorName=false;

        if(ref!=null){
            if (ref.movieName!=null)
                isMovieName=true;
            else System.out.println("Movie Name can not be null");
            if (ref.heroName!=null)
                isHeroName=true;
            else System.out.println("Hero Name Con't be null");
            if (ref.heroineName!=null)
                isHeroineName=true;
            else System.out.println("Heroine Name con't be null");
            if (ref.directorName!=null)
                isDirectorName=true;
            else System.out.println("Director Name con't be null");
        }else {
            System.out.println("Invalid data......");
        }
        if (isMovieName==true&&isHeroName==true&&isHeroineName==true&&isDirectorName==true){
            this.ref=ref;
            isAllActorAdded=true;
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
