package Integer;

import java.time.LocalDate;

public class DateInterval extends Pair<LocalDate> {
    //public void setSecond(Object second){   }

    public void getSecond(LocalDate Second) {
        //... 这个是对上面父类方法的重写
    }
    public static void main(String[] args){
        DateInterval d = new DateInterval();

    }
}


    /*DateInterval interval = new DateInterval();
    Pair<LocalDate> pair = interval; //pair是一个父类对象，后面interval是子类对象，所以pair多态
pair.setSecond(new Date());  //一个对象是多态的时候，调用的是子类方法*/
