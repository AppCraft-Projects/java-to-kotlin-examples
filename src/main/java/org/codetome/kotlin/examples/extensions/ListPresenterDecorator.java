package org.codetome.kotlin.examples.extensions;

import java.util.AbstractList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Writing decorators in java is cumbersome and they are not perfect.
 * In this case you can't implement `List` because it would need you to
 * implement a lot of other methods so you have to extend `AbstractList`.
 *
 * If you need to decorate something which does not provide useful base
 * classes like `AbstractList` or is a `final` class you are out of luck.
 */
public class ListPresenterDecorator<T> extends AbstractList<T> {

    private List<T> list;

    public ListPresenterDecorator(List<T> list) {
        this.list = list;
    }

    public String present() {
        return list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public int size() {
        return list.size();
    }
}