# spring-boot-demo
spring-boot+mybaits+jsp
jsp问题相关
服务debug/run as启动正常，但是访问jsp却404，通过mvn spring-boot:run也是正常
问题解决：因为是作为一个idea 中的module，所以启动时需要配置working directory
