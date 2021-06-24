package org.leandroloureiro.mahabharatagods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.nativex.hint.InitializationHint;
import org.springframework.nativex.hint.InitializationTime;
import org.springframework.nativex.hint.NativeHint;

@NativeHint(
        options = {"--enable-url-protocols=http"},
        initialization = {
                @InitializationHint(
                        initTime = InitializationTime.BUILD,
                        types = {
                                org.slf4j.impl.StaticLoggerBinder.class,
                                org.slf4j.LoggerFactory.class,
                                ch.qos.logback.classic.Logger.class,
                                ch.qos.logback.core.spi.AppenderAttachableImpl.class,
                                ch.qos.logback.core.status.StatusBase.class,
                                ch.qos.logback.classic.Level.class,
                                ch.qos.logback.core.status.InfoStatus.class,
                                ch.qos.logback.classic.PatternLayout.class,
                                ch.qos.logback.core.CoreConstants.class
                        }
                )
        }
)
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
