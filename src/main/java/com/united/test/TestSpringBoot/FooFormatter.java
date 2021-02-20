package com.united.test.TestSpringBoot;

import org.springframework.stereotype.Component;

@Component("fooFormatter")
public class FooFormatter {
    public String format() {
        return "foo";
    }
}