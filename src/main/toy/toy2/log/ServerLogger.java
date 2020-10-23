package toy2.log;

import org.springframework.stereotype.Component;

import toy2.log.Logger;

public class ServerLogger implements Logger {
    public void log(String info) {
        System.out.println("server log = " + info);
    }
}