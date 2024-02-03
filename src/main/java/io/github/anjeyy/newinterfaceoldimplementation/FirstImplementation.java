package io.github.anjeyy.newinterfaceoldimplementation;

class FirstImplementation implements OldInterface {

    @Override
    public int calculateBase() {
        return 10;
    }

    @Override
    public int calculateAlternativeBase() {
        return 16;
    }
}
