package io.github.anjeyy.normalisesymmetries;

class Example {

    /*
     * Normalise the same behaviour into the same appearance.
     * F.e. different lazy initialisations.
     */

    private static Example instance;

    static Example createFirstExample() {
        if (instance == null) {
            instance = new Example();
        }
        return instance;
    }

    static Example createSecondExample() {
        if (instance != null) {
            return instance;
        }
        instance = new Example();
        return instance;
    }

    static Example createThirdExample() {
        return instance == null ? instance = new Example() : instance;
    }

    static Example createFourthExample() {
        instance = instance != null ? instance : new Example();
        return instance;
    }
}
