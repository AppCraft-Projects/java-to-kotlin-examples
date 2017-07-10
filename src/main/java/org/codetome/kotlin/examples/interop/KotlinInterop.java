package org.codetome.kotlin.examples.interop;

public class KotlinInterop {

    public void helloJava() {
        System.out.println("Hello from Java!");
    }

    public void helloKotlin() {
        JavaInterop.createInstance().helloKotlin();
    }
}
