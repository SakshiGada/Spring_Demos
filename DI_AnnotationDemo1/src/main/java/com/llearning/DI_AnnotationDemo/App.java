package com.llearning.DI_AnnotationDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoClass demoClass = context.getBean(DemoClass.class);
        demoClass.show();
    }
}
