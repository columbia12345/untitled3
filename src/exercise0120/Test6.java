package exercise0120;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test6 {
    static void f() throws IOException {
        try(FileInputStream fis = new FileInputStream("");//打碎花瓶
            FileOutputStream fos = new FileOutputStream("")
        ) {

        } catch (IOException e) {
            IOException t = new IOException("ffffff",e);//赔了一部分钱
            //t.initCause(e);//带上了原始异常（跟踪打碎花瓶的信息）
            throw t;//儿子没解决完，抛出（注意这里是将解决的部分和原始的异常一起往上抛了。
        }
    }

    static void g() throws IOException {
        try {
            f();
        } catch (IOException e) {
            IOException t = new IOException("ffffff");
            throw e;//老爸也没解决完，继续抛出
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (IOException e) {
            e.printStackTrace(); //最终解决
        }
    }
}

