package com.javarush.test.level28.lesson15.big01.model;
import com.javarush.test.level28.lesson15.big01.vo.Vacancy;
/**
 * Created by ANDY on 02-10-2016.
 */

import java.util.List;

public class Provider {

    private Strategy strategy;

    public Provider(Strategy strategy) {
        this.strategy = strategy;
    }


    //Getters and setters

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //methods

    public List<Vacancy> getJavaVacancies(String searchString) {
        return strategy.getVacancies(searchString);
    }
}
