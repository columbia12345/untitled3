package exercise0120;

import java.time.LocalDateTime;
import java.util.logging.*;

public class Char {
    public static void main(String[] args) {

        Logger logger = Logger.getGlobal();
        logger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler();  //FileHandler handler = new FileHandler 就是将日志写到文件里面
        handler.setLevel(Level.ALL);  //Level. 后面可以跟日记之路级别，设置自动显示的内容
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        Filter filter = new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
/*                if (record.getMessage().length() < 6)
                    return false;
                else
                    return true;*/
                return record.getMessage().length() < 6? false:true;

            }
        };

        logger.setFilter(filter);

        Formatter formatter = new Formatter() {
            @Override
            public String format(LogRecord record) {
                return LocalDateTime.now().toString() + ": " + record.getMessage() +"\n;";
            }
        };


        handler.setFormatter(formatter);


        Logger.getGlobal().severe("severe");
        Logger.getGlobal().warning("warning");
        Logger.getGlobal().info("info"); //只需要记info以上的级别
        Logger.getGlobal().config("config");
        Logger.getGlobal().fine("fine");
        Logger.getGlobal().finer("finer");
        Logger.getGlobal().finest("finest");

    }
}
