package com.springboot.websocket.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
/**
 * 交换机和消息队列的绑定信息
 * @author Mr.Liu
 */
@Data
@Configuration
public class BindingConfig {

    @Value("${define.queueName:queue_simulation}")
    public String queueName;
    @Value("${define.exchangeName:exchange_simulation}")
    public String exchangeName;
    @Value("${define.routingType:direct}")
    public String routingType;
    @Value("${define.routingKey:routekey_simulation}")
    public String routingKey;

    @Override
    public String toString() {
        return "BindingConfig{" +
                "queueName='" + queueName + '\'' +
                ", exchangeName='" + exchangeName + '\'' +
                ", routingType='" + routingType + '\'' +
                ", routingKey='" + routingKey + '\'' +
                '}';
    }
}
