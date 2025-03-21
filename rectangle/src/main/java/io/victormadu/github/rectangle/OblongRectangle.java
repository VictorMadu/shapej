/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.victormadu.github.rectangle;

import io.victormadu.github.geometry.Rectangle;

public final class OblongRectangle implements Rectangle {
    private final double length;
    private final double width;

    public OblongRectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width cannot be negative");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double length() {
        return length;
    }

    @Override
    public double width() {
        return width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
