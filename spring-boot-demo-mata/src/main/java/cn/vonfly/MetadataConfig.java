package cn.vonfly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cn.vonfly.mapper")
public class MetadataConfig {
}
