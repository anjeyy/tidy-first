package io.github.anjeyy.explainingvariables;

import java.awt.Point;

class Example {

    Point before(int z) {
        return new Point(
            z * z * z + z * z + z + 1,
            z + z * z + z * z + 2
        );
    }

    Point after(int z) {
        int x = z * z * z + z * z + z + 1;
        int y = z + z * z + z * z + 2;
        return new Point(x, y);
    }

    Point afterAlternative(int z) {
        int widthMovement = z * z * z + z * z + z + 1;
        int horizontalCoordinate = z + z * z + z * z + 2;
        return new Point(widthMovement, horizontalCoordinate);
    }
}
