package com.eminpolat.util.datetime.formatter;

public class DateTimeFormatterUtil {
    private DateTimeFormatterUtil()
    {
    }

    public static final java.time.format.DateTimeFormatter DATETIME_DOT_SEC_TR = java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    public static final java.time.format.DateTimeFormatter DATETIME_TR = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
}
