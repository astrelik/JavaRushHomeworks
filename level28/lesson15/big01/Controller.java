package com.javarush.test.level28.lesson15.big01;


import com.javarush.test.level28.lesson15.big01.model.Model;

/**
 * Created by ANDY on 02-10-2016.
 */
import com.javarush.test.level28.lesson15.big01.model.Provider;
import com.javarush.test.level28.lesson15.big01.vo.Vacancy;

import java.util.ArrayList;
import java.util.Arrays;

public class Controller {

    private Model model;

    public Controller(Model model) {
        if (model == null) {
            throw new IllegalArgumentException();
        }
        this.model = model;
    }


    public void onCitySelect(String cityName) {
        model.selectCity(cityName);
    }

}
