package com.example.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * @date 2020/9/24
 */
@Configuration
@MapperScan("com.example.mall.mbg.mapper")
public class MyBatisConfig {
}
