package br.com.mfmoura.fundamentals.generics.reuse.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private final List<T> values = new ArrayList<>();

    public void addValue(T value) {
            values.add(value);
    }

    public T getFirst() {
        if (values.isEmpty()) {
            throw new RuntimeException("List is empty");
        }

        return values.getFirst();
    }

    @Override
    public String toString() {
        if (values.isEmpty()) {
            throw new RuntimeException("List is empty");
        }

        StringBuilder sb = new StringBuilder();
        for (T s : values) {
            sb.append("\n").append(s);
        }

        return sb.toString();
    }
}
