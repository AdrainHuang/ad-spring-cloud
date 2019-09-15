## 三种注册注册中心客户端演示

### Eureka
- 客户端： Eureka Client
    - Eureka 客户端配置API   org.springframework.boot.context.properties.ConfigurationProperties
    - Eureka 实例配置API org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean
    
    
### Zookeeper
[zookeeper docker 安装地址](https://docs.docker.com/samples/library/zookeeper/)
```
docker run --name zk \ 
           -p 2181:2181  \
           --restart always \ 
           -d zookeeper
```

### Consul
[consul docker 安装地址](https://docs.docker.com/samples/library/consul/)

```
docker run -d \
    --name=dev-consul \ 
    -p 8500:8500 \
    -e CONSUL_BIND_INTERFACE=eth0 \
    consul
 ```