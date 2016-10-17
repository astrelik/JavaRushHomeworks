package com.javarush.test.level26.lesson15.big01.command;

/**
 * Created by strel on 13/10/2016.
 */
import com.javarush.test.level26.lesson15.big01.CashMachine;
import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.util.ResourceBundle;

class ExitCommand implements Command {

    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "exit_en");

    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage(res.getString("exit.question.y.n"));
        if (ConsoleHelper.readString().equals("yes"))
            ConsoleHelper.writeMessage(res.getString("thank.message"));
    }


}