package apache.dubbo.consumer.service.impl;

import apache.dubbo.api.service.ProducerService;
import apache.dubbo.consumer.service.ConsumerService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    //引用暴露的接口
    //@Reference 注意包名 org.apache.dubbo.config.annotation.Reference
    @Reference
    ProducerService producerService;

    @Override
    public String test() {
        return producerService.test();
    }
}
