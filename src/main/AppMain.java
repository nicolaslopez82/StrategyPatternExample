package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import config.AppConfig;
import main.stores.Store;

/**
 * Created by Nicolas on 9/9/2016.
 */

@Configuration
@ComponentScan
public class AppMain {

    public static void main(String [] args){

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);

        Store store = (Store) context.getBean("store");
        store.showYourFuckingTypeCar("sedan");
    }
}
