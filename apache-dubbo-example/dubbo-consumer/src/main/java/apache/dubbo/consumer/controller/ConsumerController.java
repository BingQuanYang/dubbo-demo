package apache.dubbo.consumer.controller;

import apache.dubbo.consumer.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/con")
public class ConsumerController {
    @Resource
    ConsumerService consumerService;

    @GetMapping("/")
    public String test() {
        return consumerService.test();
    }
}
