package exercise0120;

public class Test5 {
    public static void main(String[] args) {
        try {
            System.out.println(1 + 0);
        } catch (Exception e) {
            System.out.println("-------"); //如果有异常会执行
        } finally {
            System.out.println("*******");//一定会执行
        }
        System.out.println("++++++++"); //错误被捕获，不被捕获，都会执行
    }
} //有try，可以没有catch，可以直接跟finally
