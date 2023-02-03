package org.example.annotaions;

import org.example.tryEnum.Complexity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Important {
    Complexity startOrder() default Complexity.ONE;
}
