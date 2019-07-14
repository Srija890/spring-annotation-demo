package com.stackroute;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Movie
{
        private String m_name;
        @Autowired
        private Actor actor;

        public Movie(String m_name) {
                this.m_name = m_name;
        }
        public Movie(){

        }

        public String getM_name() {
                return m_name;
        }

        public void setM_name(String m_name) {
                this.m_name = m_name;
        }

        public Actor getActor() {
                return actor;
        }

        public void setActor(Actor actor) {
                this.actor = actor;
        }

        @Override
        public String toString() {
                return "Movie{" +
                        "m_name='" + m_name + '\'' +
                        ", actor=" + actor +
                        '}';
        }
}

