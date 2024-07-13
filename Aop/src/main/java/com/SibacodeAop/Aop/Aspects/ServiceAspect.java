package com.SibacodeAop.Aop.Aspects;




import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ServiceAspect {

    @Before("execution(*)")
    public void mesajVerMetodundanOnce(JoinPoint joinPoint) {
        System.out.println("Mesaj ver metodundan önce parametre yakalandi param: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.SibacodeAop.Aop.service.*.*(..))")
    public void mesajVerMetodundanSonra(JoinPoint joinPoint) {
        System.out.println("Mesaj ver metodundan sonra parametre yakalandi param: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
}
