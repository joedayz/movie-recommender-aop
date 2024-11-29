package pe.joedayz.movie_recommender_aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.joedayz.movie_recommender_aop.data.Movie;

/**
 * @author josediaz
 **/
@Service
public class FilteringTechnique1 {

  @Autowired
  private Movie movie;

  public String contentBasedFiltering() {
    String movieDetails = movie.getMovieDetails();
    return movieDetails;
  }
}
