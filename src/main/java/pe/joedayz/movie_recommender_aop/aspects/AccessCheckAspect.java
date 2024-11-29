package pe.joedayz.movie_recommender_aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author josediaz
 **/
@Aspect
@Configuration
public class AccessCheckAspect {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Before("execution(* pe.joedayz.movie_recommender_aop..*.*Filtering(..)) || execution(String pe.joedayz.movie_recommender_aop..*.*(..))")
  //@Before("execution(String io.datajek.springaop.movierecommenderaop..*.*(String))")
  //@Before("execution(* io.datajek.springaop.movierecommenderaop..*.*Filtering(..))")
  //@Before("execution(String io.datajek.springaop.movierecommenderaop..*.*(..))")
  //@Before("execution(* io.datajek.springaop.movierecommenderaop.business.*.*(..))")
  public void before(JoinPoint joinPoint) {
    //	logger.info("Intercepted method call");
    logger.info("Intercepted call before execution of: {}", joinPoint);

    //access check logic
  }
}