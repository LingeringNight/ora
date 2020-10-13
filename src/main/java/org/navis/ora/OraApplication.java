package org.navis.ora;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动类
 * @author Administrator
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("org.navis.ora.mapper")
public class OraApplication {

    public static void main(String[] args) {
        SpringApplication.run(OraApplication.class, args);
    }

}
