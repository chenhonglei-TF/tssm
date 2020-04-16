package com.chenhl.tssm.custom.annotation;

import java.lang.annotation.*;

/**
 * @创建人: chenhl
 * @创建时间: 2020/3/25
 * @描述:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogAnnotation {

    String value() default "";
}
