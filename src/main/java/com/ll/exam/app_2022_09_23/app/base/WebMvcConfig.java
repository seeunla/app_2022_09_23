package com.ll.exam.app_2022_09_23.app.base;

import com.ll.exam.app_2022_09_23.app.interceptor.BeforeActionInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class WebMvcConfig {
    private final BeforeActionInterceptor beforeActionInterceptor;
}
