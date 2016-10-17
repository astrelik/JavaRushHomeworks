package com.javarush.test.level35.lesson04.task01;

/* Знакомство с дженериками
Параметризируйте классы SomeClass и Solution следующим образом:
1. SomeClass должен работать с типами, которые наследуются от Number;
2. Solution должен работать с типами, которые наследуются от List, который в свою очередь параметризируется типом SomeClass.
*/
import java.util.List;

public class Solution < K extends List<Solution.SomeClass>> {
    public static class SomeClass<T extends Number> {
    }
}
