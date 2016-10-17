package com.javarush.test.level28.lesson15.big01.view;

/**
 * Created by strel on 12/10/2016.
 */
import com.javarush.test.level28.lesson15.big01.Controller;
import com.javarush.test.level28.lesson15.big01.vo.Vacancy;

import java.util.List;

public interface View {

    void update(List<Vacancy> vacancies);
    void setController(Controller controller);

}