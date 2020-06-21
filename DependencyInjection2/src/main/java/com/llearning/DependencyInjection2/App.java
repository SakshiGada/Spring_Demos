package com.llearning.DependencyInjection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        DemoParent parent = (DemoParent)context.getBean("demoBean");
        parent.showMessage();
        
    }
}
