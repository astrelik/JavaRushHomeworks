package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String path = bufferedReader.readLine();
        FileWriter fileWriter = new FileWriter(path, true);

        char[] nextID, productName, price, quantity;
        char[] resultString = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; // 50 символов общая длина

//        System.arraycopy(from, fromlndex, to, tolndex, count)
//
//        from — исходный массив.
//        fromIndex — индекс элемента, с которого в исходном массиве начинается копирование.
//        to — массив, в который копируются элементы исходного массива.
//        toIndex — индекс элемента, с которого в массив to начнется вставка.
//        count — количество элементов, которые требуется скопировать.
        nextID = nextID(path);
        System.arraycopy(nextID, 0, resultString, 0, nextID.length); // ID

        price = args[args.length-2].toCharArray();
        System.arraycopy(price, 0, resultString, 38, price.length); // price

        quantity = args[args.length-1].toCharArray();
        System.arraycopy(quantity, 0, resultString, 46, quantity.length); // quantity

        String str = ""; // собираем составное название товара
        for (int i = 1; i <= args.length - 3; i++) {
            str = str + args[i];
            str = str + " ";
        }
        // если слишком длинное название- обрезаем до 30 символов
        if (str.length() > 30) str = str.substring(0, 30);
        productName = str.toCharArray();
        System.arraycopy(productName , 0, resultString, 8, productName.length);

        // запись результата в конец файла(без символов перехода на новую строку)
        fileWriter.write(resultString);

        bufferedReader.close();
        fileWriter.close();
    }

    public static char[] nextID (String path) throws IOException{
        Integer tmpInt, maxID = 0;
        String tmpStr;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        while (bufferedReader.ready()) {
            tmpStr = bufferedReader.readLine();
            // вырезаем из считанной строки первые 8 символов и убираем лишние пробелы
            tmpInt = Integer.parseInt(tmpStr.substring(0, 8).trim());
            if (tmpInt > maxID) maxID = tmpInt;
        }
        maxID++;
        bufferedReader.close();
        return (maxID).toString().toCharArray(); // возвращаем массив char со следующим после макс id
    }
}
