package com.hm.debugaopv2.service.impl;

import com.hm.debugaopv2.service.Calculator;
import org.springframework.stereotype.Component;

/**
 * @Author: hmly
 * @Date: 2025/3/1 20:28
 * @Project: spring-practice
 * @Version: 1.0.0
 * @Description:
 */

@Component
public class CalCulatorImpl implements Calculator {
    @Override
    public void add(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }
}
