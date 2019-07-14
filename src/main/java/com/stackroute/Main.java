package com.stackroute;

import com.stackroute.config.AppConfig;
import com.stackroute.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Movie movie = (Movie) ctx.getBean("movie");
        System.out.println(movie);


        Movie movie1 = (Movie) ctx.getBean("movie1");
        System.out.println(movie1);

        Movie movie2 = (Movie) ctx.getBean("movie2");
        System.out.println(movie2);


        //Checking scope
        System.out.println(movie==movie1);

    }

}