package toy2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import toy2.log.Logger;
import toy2.log.PaymentAction;
import toy2.log.ServerLogger;

@Configuration
public class ApplicationConfig {

    @Bean(name = "serverLogger")
    public Logger getLogger() {
        return new ServerLogger();
    }

    @Bean(name = "paymentAction")
    public  PaymentAction getPaymentAction() {
         return new PaymentAction();
    }
}

