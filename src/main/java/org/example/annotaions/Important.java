package org.example.annotaions;

import org.example.tryEnum.Complexity;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Important {
    Complexity startOrder() default Complexity.ONE;
}
