package controller;

import Television.Television;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

//Start app

@SpringBootApplication
public class TechItEasyApplication {
    public static void main(String[] args) {
        SpringApplication.run(TechItEasyApplication.class, args);


        Television tv1 = new Television("A", "B", "C");
        Television tv2 = new Television("AA", "BB", "CC");
        Television tv3 = new Television("AAA", "BBB", "CCC");
        Television tv4 = new Television("ZZZ", "YYY", "XXX");


        ArrayList<Television> lijst = new ArrayList<Television>();
        lijst.add(tv1);
        lijst.add(tv2);
        lijst.add(tv3);

        System.out.println(lijst.get(1).getName());
        lijst.set(1, tv4);
        System.out.println(lijst.get(1).getName());
    }
}