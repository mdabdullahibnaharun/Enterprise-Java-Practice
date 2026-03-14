package com.mdabdullaih.main.configuration;

import com.mdabdullaih.main.helper.TaxCalculation;
import com.mdabdullaih.main.model.Computer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    public void BeanConfiguration() {
        System.out.println("BeanConfiguration");
    }
    @Bean
    public static Computer computer(){
        // Framework will
        Computer computer = new Computer("hp","probook",32,1000,3.5f);
        return computer;
    }


    @Bean
    public static Computer hpProbook(){
        // Framework will
        Computer computer = new Computer("hp","probook",32,1000,3.5f);
        return computer;
    }

    @Bean
    public static Computer asusVivoBook(){
        // Framework will
        Computer computer = new Computer("Asus","VivoBook",32,1000,3.5f);
        return computer;
    }

//    @Bean
//    public static TaxCalculation taxCalculation(){
//        return new TaxCalculation();
//    }
}
