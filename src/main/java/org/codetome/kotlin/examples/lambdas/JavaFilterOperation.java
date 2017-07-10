package org.codetome.kotlin.examples.lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class JavaFilterOperation {

    private List<String> items;

    /**
     * Since there is no syntax for method parameter types
     * we have to create an interface for it.
     */
    @FunctionalInterface
    interface FilterOperation {
        Boolean filter(String element);
    }

    /**
     * The method which takes a function looks like this.
     * Note that we could use `Function<String, Boolean>` here but
     * it only works for functions with one parameter!
     */
    private List<String> filterBy(FilterOperation fn) {
        return items.stream()
                .filter(fn::filter) // applying the function
                .collect(Collectors.toList());
    }

    public void doFilter() {
        filterBy((element) -> {
            return element.length() > 0; // calling the function with an actual lambda
        });
    }
}
