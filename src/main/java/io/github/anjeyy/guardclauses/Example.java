package io.github.anjeyy.guardclauses;

class Example {

    double singleIfBefore(int x) {
        if (x != 0) {
            return (double) x / 2;
        }
        throw new UnsupportedOperationException("Division by 0.");
    }

    double singleIfAfter(int x) {
        if (x == 0) {
            throw new UnsupportedOperationException("Division by 0.");
        }

        return (double) x / 2;
    }

    double doubleIfBefore(int x) {
        if (x != 0) {
            if (x > 0) {
                return (double) x / 2;
            }
            throw new UnsupportedOperationException("Division for negatives not allowed.");
        }
        throw new UnsupportedOperationException("Division by 0.");
    }

    double doubleIfAfter(int x) {
        if (x == 0) {
            throw new UnsupportedOperationException("Division by 0.");
        }
        if (x < 0) {
            throw new UnsupportedOperationException("Division for negatives not allowed.");
        }
        return (double) x / 2;
    }
}
