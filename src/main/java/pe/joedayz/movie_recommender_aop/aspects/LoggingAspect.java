package pe.joedayz.movie_recommender_aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author josediaz
 **/
@Aspect
@Configuration
public class LoggingAspect {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @AfterReturning(value = "execution(* pe.joedayz.movie_recommender_aop.business.*.*(..))",
      returning = "result")
  //@AfterReturning("execution(* io.datajek.springaop.movierecommenderaop.data.*.*(..))")
  public void logAfterExecution(JoinPoint joinPoint, Object result) {
    //logger.info("Method {} complete", joinPoint);
    logger.info("{} returned with: {}", joinPoint, result);
  }

  @AfterThrowing(value = "execution(* pe.joedayz.movie_recommender_aop.business.*.*(..))",
      throwing = "exception")
  public void logAfterException(JoinPoint joinPoint, Object exception) {
    logger.info("Exception in {} returned with: {}", joinPoint, exception);
  }

  @After(value = "execution(* pe.joedayz.movie_recommender_aop.business.*.*(..))")
  public void logAfterMethod(JoinPoint joinPoint) {
    logger.info("After {}", joinPoint);
  }
}
