package com.ppp.piaicodemother.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 这是一个注解的目标类型注解，用于指定注解可以应用的目标元素类型为方法。
 * ElementType.METHOD 表示该注解只能被应用于方法上。
 */
@Target(ElementType.METHOD)
/**
 * 这是一个注解的保留策略注解，用于指定注解的保留阶段。
 * RetentionPolicy.RUNTIME 表示该注解将在运行时保留，因此可以通过反射机制读取。
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCheck {

    /**
     * 必须有某个角色
     *
     * @return
     */
    String mustRole() default "";
}
