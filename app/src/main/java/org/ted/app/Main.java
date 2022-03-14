package org.ted.app;

import org.ted.annotation.CustomAnnotation;

public class Main {

    private void run() {
        CustomClass custom = new CustomClass();
        custom.doSomething();
    }

    static public void main(String[] argv) {
        (new Main()).run();
    }
}

@CustomAnnotation
class CustomClass {

    public void doSomething() {
        System.out.println("blah~ blah");
    }
}
