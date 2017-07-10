package org.codetome.kotlin.examples.data;

import java.util.Objects;


/**
 * A plain old java object with all the boilerplate.
 */
public class HexagonValueObject {

    private final int x;
    private final int y;
    private final int z;

    public HexagonValueObject(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HexagonValueObject hexagon = (HexagonValueObject) o;
        return getX() == hexagon.getX() &&
                getY() == hexagon.getY() &&
                getZ() == hexagon.getZ();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getZ());
    }

    @Override
    public String toString() {
        return "HexagonValueObject{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
