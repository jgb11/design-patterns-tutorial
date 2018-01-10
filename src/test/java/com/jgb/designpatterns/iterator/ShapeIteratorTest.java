package com.jgb.designpatterns.iterator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jgb
 * @since 10/01/2018 12:55
 */
public class ShapeIteratorTest {

    private ShapeStorage storage;
    private ShapeIterator iterator;

    @Before
    public void setUp() {
        storage = new ShapeStorage();

        storage.addShape("Polygon");
        storage.addShape("Hexagon");
        storage.addShape("Circle");
        storage.addShape("Rectangle");
        storage.addShape("Square");

        iterator = new ShapeIterator(storage.getShapes());
    }

    @Test
    public void testHasNextAndNextPrintCorrectShape() {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        assertEquals("actual position must be 5", 5, iterator.actualPosition());
    }

    @Test
    public void testRemoveShapesWhileIterating() {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        assertEquals("actual position must be 3", 3, iterator.actualPosition());
    }
}