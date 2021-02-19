package me.xueyao.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author Simon.Xue
 * @date 2/19/21 10:10 PM
 **/
@Getter
@Configuration
public class SampleConfig {

    @Value("${sample.name}")
    private String name;
}
