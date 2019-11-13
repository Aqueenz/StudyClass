package DateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

    public static void main(String[] args) {
        function_parse();
    }
    /*
     * 如何对日期格式化
     *  步骤:
     *    1. 创建SimpleDateFormat对象
     *       在类构�?�方法中,写入字符串的日期格式 (自己定义)
     *    2. SimpleDateFormat调用方法format对日期进行格式化
     *         String format(Date date) 传�?�日期对�?,返回字符�?
     *    日期模式:
     *       yyyy    年份
     *       MM      月份
     *       dd      月中的天�?
     *       HH       0-23小时
     *       mm      小时中的分钟
     *       ss      �?
     *       yyyy年MM月dd�? HH点mm分钟ss�?  汉字修改,: -  字母表示的每个字段不可以随便�?
     */
    public static void function_format() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(new Date());
        System.out.println(date);
    }
    /*
     *  将字符串转成Date对象
     */
    public static void function_parse() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("1995-01-21");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }
}
