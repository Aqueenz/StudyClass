package DateClass;

import java.util.Calendar;

/**
 * 获取日历
 * @author lly
 *
 * 2019�?11�?7�?
 * Calendar,月份是从0-11   算月份要+1
 *          星期�?0-6 0是星期日  算星期要-1
 */
public class CalendarTest {
    public static void main(String[] args) throws Exception {
        funtion_add();
        
    }
    /*
     * Calendar类方法add 日历的偏移量,
           * 可以指定�?个日历中的字�?,
           * 进行整数的偏�? add(int field, int value)
     */
    public static void funtion_add() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, 1); //偏移1�?
        
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"-"+month+"-"+day);
    }
    /**
     * Calendar,Set方法
     */
    public static void funtion_set() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH,5);  //月份是从0-11   算月份要+1,�?�?12�?-1，得�?12月份
        //c.set(2018, 8, 8);   //传�?�年月日 
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"-"+month+"-"+day);
    }
    /**
     * Calendar,Get方法
     */
    public static void funtion_get() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"-"+month+"-"+day);
    }
    
}
