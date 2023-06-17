package hr.kingict.akademija2023.SpringBootAkademija2023.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PageSufixServiceAspect {

    Logger logger= LoggerFactory.getLogger(PageSufixServiceAspect.class);

    @AfterReturning(value = "execution(* hr.kingict.akademija2023.SpringBootAkademija2023.service.PageSuffixService.getSuffix(..))",returning = "result")
    public void beforePageSuffixServiceGetSuffix(JoinPoint joinpoint,String result){

        logger.info("after  page  suffix service get suffix:"+ joinpoint.getTarget().getClass().getSimpleName());
        logger.info("Result: " + result);
    }
}
