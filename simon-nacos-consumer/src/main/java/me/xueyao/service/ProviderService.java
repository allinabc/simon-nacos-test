package me.xueyao.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Simon.Xue
 * @date 2/19/21 9:13 PM
 **/
@FeignClient(value = "nacos-provider" )
public interface ProviderService {
    /**
     *
     * @return
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();
}
