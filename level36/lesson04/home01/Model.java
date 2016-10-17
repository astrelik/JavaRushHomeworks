package com.javarush.test.level36.lesson04.home01;

/**
 * Created by strel on 11/10/2016.
 */
import java.util.List;

public class Model {

    private Service service = new Service();

    public List<String> getStringDataList() {
        return service.getData();
    }

}
