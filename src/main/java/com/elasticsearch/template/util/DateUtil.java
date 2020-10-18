package com.elasticsearch.template.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String DateFormatter(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return formatter.format(date);
    }
}
