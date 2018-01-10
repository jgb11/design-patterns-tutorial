package com.jgb.designpatterns.iterator;

import java.util.Iterator;

public class ShapeIterator implements Iterator<Shape> {

    private Shape[] shapes;
    private int position;

    public ShapeIterator(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    public boolean hasNext() {
        return position < shapes.length && shapes[position] != null;
    }

    @Override
    public Shape next() {
        return shapes[position++];
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("Illegal position");
        }
        if (shapes[position - 1] != null) {
            System.arraycopy(shapes, position, shapes, position - 1, shapes.length - 1 - (position - 1));
            shapes[shapes.length - 1] = null;
        }
    }

    public int size() {
        return shapes.length;
    }

    public int actualPosition() {
        return position;
    }
}
