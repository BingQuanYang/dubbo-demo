package apache.dubbo.producer.service.impl;

import apache.dubbo.api.service.ProducerService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

//添加@Service注意属于哪个包
//属于org.apache.dubbo.config.annotation.Service包的，不是spring的
@Service
public class ProducerServiceImpl implements ProducerService {
    @Value("${server.port}")
    String port;

    @Override
    public String test() {
        return port;
    }
}
