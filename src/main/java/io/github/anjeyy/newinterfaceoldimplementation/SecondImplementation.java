package io.github.anjeyy.newinterfaceoldimplementation;

class SecondImplementation implements OldInterface {

    @Override
    public int calculateBase() {
        return 2;
    }

    @Override
    public int calculateAlternativeBase() {
        return calculateBase(); // pass-through interface
    }
}
