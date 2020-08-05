package com.springboot.websocket.config;
import com.rabbitmq.client.ConnectionFactory;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
/**
 * rabbitmq配置信息
 * @author liuyarao
 */
@Data
@Configuration
public class RabbitConfig {

    @Value("${spring.rabbitmq.host:localhost}")
    public  String host;
    @Value("${spring.rabbitmq.username:guest}")
    public  String username;
    @Value("${spring.rabbitmq.password:guest}")
    public  String password;
    @Value("${spring.rabbitmq.port:5672}")
    public  Integer port;
    @Value("${spring.rabbitmq.virtual-host:/}")
    public  String virtualHost;

    public ConnectionFactory getConnectionFactory() {
        //创建连接并连接到MabbitMQ
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(host);
        factory.setUsername(username);
        factory.setPassword(password);
        factory.setPort(port);
        factory.setVirtualHost(virtualHost);
        return factory;
    }

    @Override
    public String toString() {
        return "ConnectionConfig {" +
                "host='" + host + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", port=" + port +
                ", virtualHost='" + virtualHost + '\'' +
                '}';
    }
}
