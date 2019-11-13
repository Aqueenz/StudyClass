package DateClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BirthdayNumber {
    public static void main(String[] args) throws Exception {
        dayNumber3();
    }
    /*
     * 出生日期转换
     * 1�?=1000毫秒
     */
    public static void dayNumber1() throws Exception {
        //当前日期
        Date nowDay = new Date();
        long nowTime = nowDay.getTime(); //当前毫秒时间
        
        String birthDay = "1995-02-28"; //出生日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthDay);
        long time = date.getTime();  //转换成毫秒时�?
        
        long todaySecond = nowTime - time;
        if(todaySecond<0) {
            System.out.println("您输入的日期有误");
        }else {
            System.out.println(todaySecond/1000/60/60/24);
        }
    }
    public static void dayNumber2() {
        Calendar c = Calendar.getInstance(); //当前日期
        Calendar birthDay = Calendar.getInstance();  //出生日期
        birthDay.set(Calendar.YEAR, 1995);
        birthDay.set(Calendar.MONTH, 2);
        birthDay.set(Calendar.DATE, 28);
        System.out.println(c);
        System.out.println(c.get(Calendar.DATE));
       /* int day = c.get(Calendar.DATE) - birthDay.get(Calendar.DATE);
        System.out.println(day);*/
        
    }
    
    /**
     * 闰年计算
     * 2000  3000
     * 高级的算�? - 日历设置到指定的年份3�?1日，add向前偏移�?天，获取天数�?29闰年
     */
    public static void dayNumber3() {
        Calendar c = Calendar.getInstance(); //当前日期
        //将日历设置成3�?1�?
        c.set(2021, 2, 1);
        //日历add方法，向前品偏移1�?
        c.add(Calendar.DAY_OF_MONTH, -1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        if(day==29) {
            System.out.println("您输入的日期是闰年！");
        }else {
            System.out.println("您输入的日期是平年！");
        }
        
    }
}
