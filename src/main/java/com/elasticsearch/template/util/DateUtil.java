package com.elasticsearch.template.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String DateFormatter(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(date);
    }
}
