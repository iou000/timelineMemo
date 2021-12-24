package com.sparta.timelineMemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // 생성, 수정시간이 바뀌었을 때 자동으로 업데이트
@SpringBootApplication
public class TimelineMemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimelineMemoApplication.class, args);
    }

}
