package com.javarush.test.level37.lesson04.big01.female;

import com.javarush.test.level37.lesson04.big01.AbstractFactory;
import com.javarush.test.level37.lesson04.big01.Human;

/**
 * Created by strel on 12/10/2016.
 */
public class FemaleFactory implements AbstractFactory{

    public Human getPerson(int age) {
        if (age <= KidGirl.MAX_AGE) {
            return new KidGirl();
        }
        else if (age <= TeenGirl.MAX_AGE && age > KidGirl.MAX_AGE) {
            return new TeenGirl();
        }
        else {
            return new Woman();
        }
    }
}
