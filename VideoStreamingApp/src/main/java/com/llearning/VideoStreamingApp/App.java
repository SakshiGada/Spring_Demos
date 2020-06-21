package com.llearning.VideoStreamingApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.llearning.VideoStreamingApp.mainservice.VideoStreamingService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        VideoStreamingService service = (VideoStreamingService)context.getBean("videoStreamingObj");
        service.watch();
    }
}
