package org.codetome.kotlin.examples.strings;

/**
 * String manipulation in java is painful.
 * It can be alleviated by using `String.format` but
 * it will still remain painful.
 */
public class JavaUser {
    private final String name;
    private final int age;

    public JavaUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toHumanReadableFormat() {
        return "JavaUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String toHumanReadableFormatWithStringFormat() {
        return String.format("JavaUser{name='%s', age=%s}", name, age);
    }
}
