package io.github.anjeyy.guardclauses;

class DoubleIfExample {

    double before(int x) {
        if (x != 0) {
            if (x > 0) {
                return (double) x / 2;
            }
            throw new UnsupportedOperationException("Division for negatives not allowed.");
        }
        throw new UnsupportedOperationException("Division by 0.");
    }

    double after(int x) {
        if (x == 0) {
            throw new UnsupportedOperationException("Division by 0.");
        }
        if (x < 0) {
            throw new UnsupportedOperationException("Division for negatives not allowed.");
        }
        return (double) x / 2;
    }
}
