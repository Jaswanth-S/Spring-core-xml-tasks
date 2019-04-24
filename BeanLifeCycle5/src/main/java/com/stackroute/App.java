package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifeCycleDemoBean beanLifeCycleDemoBean = context.getBean("beanlifecycle",BeanLifeCycleDemoBean.class);

            context.close();


    }
}
