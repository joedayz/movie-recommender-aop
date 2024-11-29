package pe.joedayz.movie_recommender_aop.data;

import org.springframework.stereotype.Repository;

/**
 * @author josediaz
 **/
@Repository
public class User {
  public String getUserDetails() {
    //interacts with the User repository
    return "user details";
  }
}
