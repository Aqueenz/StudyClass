package DateClass;

import java.util.Date;
/*
 *  时间和日期类
 *    java.util.Date
 *    
 *  毫秒概念: 1000毫秒=1�?
 *  
 *  毫秒�?0�?: 
 *     System.currentTimeMillis() 返回值long类型参数
 *     获取当前日期的毫秒�??   3742769374405
 *     时间原点; 公元1970�?1�?1�?,午夜0:00:00 英国格林威治  毫秒值就�?0
 *     时间2088�?8�?8�?
 *  
 *  重要: 时间和日期的计算,必须依赖毫秒�?
 *    XXX-XXX-XX = 毫秒
 *    
 *      long time = System.currentTimeMillis();
        System.out.println(time);
 */
public class DateTest {
    public static void main(String[] args) {
        dateGetTime();
    }
    
    /*
     * Date类的long参数的构造方�?
     * Date(long ) 表示毫秒�?
     * 传�?�毫秒�??,将毫秒�?�转成对应的日期对象
     */
    public static void function_01() {
        Date date = new Date(1573030047773L);
        System.out.println(date);
    }
    
    /**
     * 传�?�毫秒�??,将毫秒�?�转成对应的日期对象
     */
   public static void function_02(){
        Date date = new Date();
        System.out.println(date);
        
        date.setTime(0);
        System.out.println(date);
    }
   
   /*
    *   Date类方�? getTime() 返回值long
    *   返回的是毫秒�?
    *   将Date表示的日�?,转成毫秒�?
    *   日期和毫秒�?�转�?
    */
   public static void dateGetTime(){
       Date date = new Date();
       System.out.println(date.toString());
       long time = date.getTime();
       System.out.println(time);
   }
   
}
