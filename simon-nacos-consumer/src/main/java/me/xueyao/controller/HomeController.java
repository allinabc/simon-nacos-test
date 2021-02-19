package me.xueyao.controller;

import me.xueyao.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Simon.Xue
 * @date 2/19/21 9:12 PM
 **/
@RestController
public class HomeController {
    @Autowired
    private ProviderService providerService;

    @GetMapping("/index")
    public String index() {
        return providerService.hello();
    }
}
