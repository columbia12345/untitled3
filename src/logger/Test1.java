package logger;

import java.time.LocalDateTime;
import java.util.logging.*;


public class Test1 {

    private static final Logger logger = Logger.getLogger("com.google.myapp");

    public static void main(String[] args) {

        Handler handler = new ConsoleHandler();
        handler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(LocalDateTime.now() + ", " + record.getLevel() + ": ");
                stringBuilder.append(record.getMessage() + "\n");
                record.getLevel();
                return stringBuilder.toString();
            }
        });

        handler.setFilter(record -> {
            return record.getLevel() == Level.INFO ? true : false; //只打印info级别
        });
        handler.setLevel(Level.FINEST);

        logger.setUseParentHandlers(false);
        logger.addHandler(handler);

        logger.severe("xxxxxxx");
        logger.info("yyyyy");
        logger.finest("xxxxxx");
        logger.warning("dsadvga");
        logger.logp(Level.INFO,
                "com.google.Test", "main", "xxxxxxx");

    }
}
