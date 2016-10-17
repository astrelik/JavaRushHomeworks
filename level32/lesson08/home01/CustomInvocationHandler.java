package com.javarush.test.level32.lesson08.home01;

/**
 * Created by strel on 06/10/2016.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {

    private SomeInterfaceWithMethods siwm;

    public CustomInvocationHandler(SomeInterfaceWithMethods someInterfaceWithMethods) {
        this.siwm = someInterfaceWithMethods;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + " in");
        Object result = method.invoke(siwm, args);
        System.out.println(method.getName() + " out");
        return result;
    }
}
