package com.stackroute.config;

import com.stackroute.Actor;
        import com.stackroute.Movie;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration
{
    @Bean(name = "movie")
    public Movie getMovie(){
        Movie movie=new Movie();
        movie.setM_name("Maharshi");
        return movie;
    }
    @Bean(name = "movie1")
    public Movie getMovie1(){
        Actor actor1=new Actor("Prabhas","Male",40);
        Movie movie1=new Movie("Bahubali",actor1);
        return movie1;
    }
    @Bean(name = "movie2")
    public Movie getMovie2(){
        Actor actor1=new Actor("Anushka","Female",40);
        Movie movie1=new Movie("Arundathi",actor1);
        return movie1;
    }
}
