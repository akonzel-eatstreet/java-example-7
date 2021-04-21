package com.konzel.example7.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattedDateTime {
    public FormattedDateTime(LocalDateTime ldt) {
        date = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(ldt);
        time = DateTimeFormatter.ofPattern("HH:mm:ss").format(ldt);
    }

    public final String date;
    public final String time;
}
