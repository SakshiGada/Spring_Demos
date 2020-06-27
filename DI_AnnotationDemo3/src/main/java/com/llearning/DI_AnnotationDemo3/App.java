package com.llearning.DI_AnnotationDemo3;

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
        DemoP demoP = context.getBean(DemoC.class);
        demoP.greet();
    }
}
