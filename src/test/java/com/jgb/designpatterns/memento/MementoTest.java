package com.jgb.designpatterns.memento;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * @author jgb
 * @since 09/12/2017 13:31
 */
public class MementoTest {

    @Test
    public void testMementoSaveState() {
        final CareTaker careTaker = new CareTaker();
        final Originator originator = new Originator(5, 10, careTaker);
        System.out.println("Default State: " + originator);

        assertEquals("Memento INITIAL x must be the same as Originator", originator.getX(), originator.careTaker.getMemento("INITIAL").getX(), 0);
        assertEquals("Memento INITIAL y must be the same as Originator", originator.getY(), originator.careTaker.getMemento("INITIAL").getY(), 0);

        originator.setX(originator.getY() * 51);
        System.out.println("State: " + originator);
        originator.createSavepoint("SAVE1");

        assertEquals("Memento SAVE1 x must be the same as Originator", originator.getX(), originator.careTaker.getMemento("SAVE1").getX(), 0);
        assertEquals("Memento SAVE1 y must be the same as Originator", originator.getY(), originator.careTaker.getMemento("SAVE1").getY(), 0);

        originator.setY(originator.getX() / 22);
        System.out.println("State: " + originator);
        originator.undo();
        System.out.println("State after undo: " + originator);

        assertEquals("Memento SAVE1 x must be the same as Originator", originator.getX(), originator.careTaker.getMemento("SAVE1").getX(), 0);
        assertEquals("Memento SAVE1 y must be the same as Originator", originator.getY(), originator.careTaker.getMemento("SAVE1").getY(), 0);

        originator.setX(Math.pow(originator.getX(), 3));
        originator.createSavepoint("SAVE2");
        System.out.println("State: " + originator);

        assertEquals("Memento SAVE2 x must be the same as Originator", originator.getX(), originator.careTaker.getMemento("SAVE2").getX(), 0);
        assertEquals("Memento SAVE2 y must be the same as Originator", originator.getY(), originator.careTaker.getMemento("SAVE2").getY(), 0);

        originator.setY(originator.getX() - 30);
        originator.createSavepoint("SAVE3");
        System.out.println("State: " + originator);

        assertEquals("Memento SAVE3 x must be the same as Originator", originator.getX(), originator.careTaker.getMemento("SAVE3").getX(), 0);
        assertEquals("Memento SAVE3 y must be the same as Originator", originator.getY(), originator.careTaker.getMemento("SAVE3").getY(), 0);

        originator.setY(originator.getX() / 22);
        originator.createSavepoint("SAVE4");
        System.out.println("State: " + originator);

        assertEquals("Memento SAVE4 x must be the same as Originator", originator.getX(), originator.careTaker.getMemento("SAVE4").getX(), 0);
        assertEquals("Memento SAVE4 y must be the same as Originator", originator.getY(), originator.careTaker.getMemento("SAVE4").getY(), 0);

        originator.undo("SAVE2");
        System.out.println("Retrieving at: " + originator);

        assertEquals("Memento SAVE2 x must be the same as Originator", originator.getX(), originator.careTaker.getMemento("SAVE2").getX(), 0);
        assertEquals("Memento SAVE2 y must be the same as Originator", originator.getY(), originator.careTaker.getMemento("SAVE2").getY(), 0);

        originator.undoAll();
        System.out.println("State after undo all: " + originator);

        assertEquals("Originator x must be the same as first x", 5, originator.getX(), 0);
        assertEquals("Originator y must be the same as first x", 10, originator.getY(), 0);
        assertNull("Memento INITIAL state must be null", originator.careTaker.getMemento("INITIAL"));
    }
}