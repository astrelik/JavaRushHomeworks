package com.javarush.test.level09.lesson08.task05;

/* Перехват unchecked исключений
В методе processExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..
*/

public class Solution
{
    public static void main(String[] args) {
        processExceptions(new Solution());
    }

    public static void processExceptions(Solution obj) {

        try /*п.1 - создаём один try и в него записываем
            все методы*/
        {
        obj.method1();
        obj.method2();
        obj.method3();
        }

        //создаем перехват1
        catch (IndexOutOfBoundsException e){
            printStack(e);
        }

        //создаем перехват2
        catch (NumberFormatException e){
            printStack(e);
        }

        //создаем перехват 3
        catch (NullPointerException e){
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1(){
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
