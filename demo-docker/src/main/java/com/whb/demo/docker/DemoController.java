package com.whb.demo.docker;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/**
 * 演示控制器
 *
 * @author labu
 * @date 2022/06/12
 */
@RestController
@RequestMapping("/docker")
public class DemoController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/port")
    public Object getPort() {
        System.out.println("访问时间 "+ LocalDateTime.now().toString());
        return port + " " + UUID.randomUUID().toString();
    }
}
