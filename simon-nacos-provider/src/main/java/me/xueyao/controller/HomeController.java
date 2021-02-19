package me.xueyao.controller;

import me.xueyao.config.SampleConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Simon.Xue
 * @date 2/19/21 9:08 PM
 **/
@RefreshScope
@RestController
public class HomeController {
    @Autowired
    private SampleConfig sampleConfig;

    @GetMapping("/hello")
    public String hello() {
        return "hello," + sampleConfig.getName();
    }
}
