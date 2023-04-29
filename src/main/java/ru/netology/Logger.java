package ru.netology;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Logger {
    private static Logger instance;
    private static int num = 1;

    private Logger() {

    }

    public void Log(String msg) {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy 'в' HH.mm.ss");
        System.out.println("[" + format.format(date) + " " + num + "] " + msg);
        num++;
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
