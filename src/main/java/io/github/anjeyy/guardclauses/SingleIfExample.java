package io.github.anjeyy.guardclauses;

class SingleIfExample {

    double before(int x) {
        if (x != 0) {
            return (double) x / 2;
        }
        throw new UnsupportedOperationException("Division by 0.");
    }

    double sfter(int x) {
        if (x == 0) {
            throw new UnsupportedOperationException("Division by 0.");
        }

        return (double) x / 2;
    }
}
