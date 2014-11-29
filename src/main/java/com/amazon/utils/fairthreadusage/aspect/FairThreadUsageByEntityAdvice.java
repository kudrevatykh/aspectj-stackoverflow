package com.amazon.utils.fairthreadusage.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import com.facade.feed.FairThreadUsageByEntity;


@Aspect
public class FairThreadUsageByEntityAdvice extends FairThreadUsageBase{

    @Around("@annotation(fairUsage)")
    public Object fairThreadUsageByEntity(final ProceedingJoinPoint pjp, final FairThreadUsageByEntity fairUsage)
            throws Throwable {
    	System.out.println("from aop");
    	return pjp.proceed();
    }
}