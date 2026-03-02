package ru.lizka.pipiska.remote.confing;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.cloud.openfeign.support.FeignHttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignSupportConfig {

    @Bean
    public Encoder multipartFormEncoder(ObjectProvider<FeignHttpMessageConverters> messageConvertersObjectFactory) {
        return new SpringFormEncoder(new SpringEncoder(messageConvertersObjectFactory));
    }
}