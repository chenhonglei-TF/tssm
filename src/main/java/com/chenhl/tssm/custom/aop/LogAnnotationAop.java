package com.chenhl.tssm.custom.aop;

import com.alibaba.fastjson.JSON;
import com.chenhl.tssm.custom.annotation.LogAnnotation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @创建人: chenhl
 * @创建时间: 2020/3/25
 * @描述:
 */

@Aspect
@Component
public class LogAnnotationAop {

    private static final Logger logger = LoggerFactory.getLogger(LogAnnotationAop.class);

    @Around("@annotation(logAnnotation)")
    public Object printLog(ProceedingJoinPoint pjp, LogAnnotation logAnnotation) throws Throwable {
        final String methodUri = pjp.getSignature().getDeclaringType().getName() +
                "." +
                pjp.getSignature().getName();
        System.out.println("methodUri=" + methodUri);
        Object[] args = pjp.getArgs();
        for (Object arg : args) {
            System.out.println("arg="+arg);
        }
        final long startTime = System.currentTimeMillis();
        logger.info("[" + methodUri + ", 开始处理!]");
        Object result=null;
        result = pjp.proceed();
        logger.info("[" + methodUri + " 出参]：{}", JSON.toJSONString(result));
        logger.info("[" + methodUri + ", 处理结束!]耗时: {} ms", System.currentTimeMillis() - startTime);
        return result;
    }
}
