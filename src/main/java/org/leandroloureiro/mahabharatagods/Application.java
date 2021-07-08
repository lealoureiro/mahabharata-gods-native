package org.leandroloureiro.mahabharatagods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.nativex.hint.AccessBits;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.TypeHint;

import java.lang.reflect.Type;

@NativeHint(options = {"--enable-url-protocols=http"})
@TypeHint(types = {
        ParameterizedTypeReference.class,
        Type.class
}, typeNames = "org.leandroloureiro.mahabharatagods.services.IndianGodsServiceImpl$1", access = AccessBits.FULL_REFLECTION)
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
