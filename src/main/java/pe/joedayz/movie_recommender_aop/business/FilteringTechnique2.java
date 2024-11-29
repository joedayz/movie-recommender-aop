package pe.joedayz.movie_recommender_aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.joedayz.movie_recommender_aop.data.User;

/**
 * @author josediaz
 **/
@Service
public class FilteringTechnique2 {
  @Autowired
  private User user;

  public String collaborativeFiltering() {
    String userDetails =  user.getUserDetails();
    return userDetails;
  }
}
