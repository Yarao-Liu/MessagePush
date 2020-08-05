package com.springboot.websocket.config;

import com.springboot.websocket.websocket.PushMsgServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @author liuyarao
 * 说明：这个bean自动注册使用了@ServerEndPoint注解声明的WebSocketEndpoint。
 * 注意：如果使用独立的servlet容器，而不是使用独立的servlet容器，
 *      而不是直接使用springboot的内置容器，就不要注入ServerEndPointExporter，
 *      因为它将由容器自己提供和管理。
 */
@Configuration
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter()
    {
        return new ServerEndpointExporter();
    }

    /**
     * 注入rabbitmq配置
     * @param rabbitConfig
     */
    @Autowired
    public void setRabbitConfig(RabbitConfig rabbitConfig) {
        PushMsgServer.rabbitConfig = rabbitConfig;
    }

    @Autowired
    public void setBingConfig(BindingConfig bingConfig){
        PushMsgServer.bindingConfig=bingConfig;
    }
}
