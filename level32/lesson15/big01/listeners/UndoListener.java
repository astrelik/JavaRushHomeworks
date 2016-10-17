package com.javarush.test.level32.lesson15.big01.listeners;

/**
 * Created by strel on 07/10/2016.
 */
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

/**
 *  Этот класс будет следить за правками, которые можно отменить или вернуть.
 */
public class UndoListener implements UndoableEditListener {

    private UndoManager undoManager;

    public UndoListener(UndoManager undoManager) {
        this.undoManager = undoManager;
    }

    @Override
    public void undoableEditHappened(UndoableEditEvent e) {
        undoManager.addEdit(e.getEdit());

    }

}