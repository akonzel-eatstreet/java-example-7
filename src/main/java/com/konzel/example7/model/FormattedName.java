package com.konzel.example7.model;

public class FormattedName {
    public FormattedName(String[] fragments) {
        value = String.join(" ", fragments);
    }

    public final String value;
}