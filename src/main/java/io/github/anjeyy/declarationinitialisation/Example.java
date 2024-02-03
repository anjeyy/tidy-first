package io.github.anjeyy.declarationinitialisation;

class Example {

    int before(int x) {
        int a;
        x = x * x;
        a = x % 2;
        int b;
        x = a;
        b = x % 2;
        return a + b;
    }

    int after(int x) {
        x = x * x;
        int a = x % 2;
        int b = a % 2;
        return a + b;
    }
}
