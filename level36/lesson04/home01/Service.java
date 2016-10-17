package com.javarush.test.level36.lesson04.home01;

/**
 * Created by strel on 11/10/2016.
 */
import java.util.ArrayList;
import java.util.List;

public class Service {

    public List<String> getData() {
        List<String> data = new ArrayList<String>() {{
            add("First string");
            add("Second string");
            add("Third string");
        }};
        return data;
    }

}