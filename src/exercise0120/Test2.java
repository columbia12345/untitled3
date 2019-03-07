package exercise0120;
import java.io.IOException;
import java.lang.module.InvalidModuleDescriptorException;

class MyException extends Throwable {
    public MyException(){
        super("余额不足");
    }

    public MyException(String s){
        super(s); //这时候如果下面括号里面有字符串参数，下面调用的就是这个构造器了。
    }

    //所有的异常的父类都带了一个带自古穿的构造器，可以哪里啊直接用

}



public class Test2 {
    int g(){
        try {
            return 0;
        }finally{
            return 1;  //方法g最终返回的值是1，不是0
        }
    }

    void f() {
        throw new IndexOutOfBoundsException();
        //RuntimeException及其子类没必要被声明或者捕获。运行的时候不一定会出错，不是必减异常
    }

    public static void main(String[] args){
        try {
            if (args.length > 0)
                throw new MyException("xxxx");
            //try中一旦发生异常，就会立刻停止之后的语句，转而执行catch后的语句
            System.out.println("hello");
           // return; //try里面return程序还是会执行finally
            //System.exit(1); //才能使finally不执行，后面这个是linux系统接受但不做任何回应，

            //选第一个可以用的catch用
        } catch (MyException e) {
            //catch参数捕获的异常类型必须是抛出异常本身或其父类 如这里MyException可以替换为上面继承的Throwable
            e.printStackTrace();
        }catch (Throwable e){
            System.out.println("catch...");
            //catch可以有多个，但越往下内容必须越宽泛，且顺序不能变
        } finally {
            //无论是否产生异常，finally里面但内容一定会执行
            System.out.println("finally");
        }
        //throw new NullPointerException(); //只能throw一个，不然后报错

    }

}
