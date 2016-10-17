package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/
public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));

        while (bufferedReader.ready()) {
            String[] split = bufferedReader.readLine().split(" "); // парсим строку на Имя(возможно составное) и Дату (разделены пробелом)

            Date date = new Date(); // заготовка под Date
            StringBuilder nameString = new StringBuilder(); // заготовка под имя

            String dateString = split[split.length-3] + " " + split[split.length-2] + " " + split[split.length-1]; // собираем дату в строку
            DateFormat format = new SimpleDateFormat("d MM yyyy");

            date = format.parse(dateString); // переводим собранную строку в Date()

            for (int i = 0; i <= split.length - 4; i++) { // собрали имя
                nameString.append(split[i]).append(" ");
            }

            PEOPLE.add(new Person(nameString.toString().trim(), date)); // заносим новый объект Person в PEOPLE
        }

        bufferedReader.close();

        //---------------------------------
        //for (Person pers: PEOPLE) {
        //    System.out.println(pers.getName() + " " + pers.getBirthday());
        //}
        //---------------------------------
    }

}
