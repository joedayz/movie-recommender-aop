package pe.joedayz.movie_recommender_aop.data;

import org.springframework.stereotype.Repository;

/**
 * @author josediaz
 **/
@Repository
public class Movie {

  public String getMovieDetails() {
    //interacts with the Movie repository
    return "movie details";
  }
}
