package com.lemonaloe.web.controller.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DataUtils {

    public static void main(String[] args) {
        String str = "2022-08-02 02:52:34";
        Date stringtoData = getStringtoData(str);
        System.err.println(stringtoData);
        Date stringtoData1 = getStringtoData(getDate("yyyy-MM-dd HH:mm:ss"));
        System.err.println(stringtoData1);
    }

    /*
    Java时间设为二十四小时制和十二小时制的区别：
    1) 二十四小时制： “yyyy-MM-dd HH:mm:ss”
    2)十二小时制： “"yyyy-MM-dd hh:mm:ss"”
    */
    //获取时间 格式自定
    //例如：type  =  "yyyy-MM-dd hh:mm:ss"
    public static String getDate(String type){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(type);
        String time = simpleDateFormat.format(new Date());
        return time;
    }

    public static Date getStringtoData(String time){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date parse = null;
        try {
            parse = format.parse(time);
            return parse;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }

    //时间排序 由大到小
    public static List<Date> sortDate(List<Date> dateList){
        dateList.sort((a1,a2) ->{
            return a1.compareTo(a2);
        });
        return dateList;
    }

}
