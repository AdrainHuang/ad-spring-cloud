# ad-spring-cloud-pom
spring cloud自学

## 注册中心
Zookeeper version: 3.4.5

ad-spring-cloud-server作为配置中心，zuul作为网关，但发现zuul读取配置中心失败。
在zuul网关服务启动的时候会读取zk上面的所有服务节点。但配置中心的配置文件并没作为zuul
的配置文件。

`zuul端口：7070`
`person-service端口：9090`
`person-client端口：8888`
服务调用链：zuul(7070)->person-client(8888)->person-service(9090)
访问地址：http://localhost:7070/person-client/person/find/all

### Eureka高可用演示 查看以下三个模块
```xml
 <module>ad-eureka-server</module>
 <module>ad-server-provider</module>
 <module>ad-server-consume</module>
```
