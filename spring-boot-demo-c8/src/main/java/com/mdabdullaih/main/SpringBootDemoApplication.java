package com.mdabdullaih.main;

import com.mdabdullaih.main.helper.TaxCalculation;
import com.mdabdullaih.main.model.Computer;
import com.mdabdullaih.main.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

// di and ioc
@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {

//        SpringApplication.run(SpringBootDemoApplication.class, args);
        System.out.println("Hello World--- from Spring Boot");

        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

//        Computer computer = new Computer("hp","probook",32,1000,3.5f);
////        User user = new User("Kama","Dhaka",computer);
//        User user = new User("Kama","Dhaka");
//        user.setComputer(computer);

//        User user1 = new User("Kama","Dhaka", computer());

        User user1 = new User("Kama","Dhaka");
        System.out.println(user1);
        User user2 = new User("Kaly","uk");
        System.out.println(user2);

        // Using Application Context // by default singleton // lose coupling
//        Computer computer1 = context.getBean(Computer.class);
//        System.out.println(computer1);
//        user1.setComputer(computer1);
//        System.out.println(user1);

        Computer computer1 = (Computer) context.getBean("asusVivoBook");
        System.out.println(computer1);
        user1.setComputer(computer1);
        System.out.println(user1);

        Computer computer2 = (Computer)  context.getBean("hpProbook");
        System.out.println(computer1);
        user2.setComputer(computer1);
        System.out.println(user1);

        TaxCalculation taxCalculation =  context.getBean(TaxCalculation.class);
        System.out.println(taxCalculation);
        taxCalculation.TaxCalculationDO();


    }

}
