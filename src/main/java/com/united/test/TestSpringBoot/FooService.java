package com.united.test.TestSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooService {  
    @Autowired
    private FooFormatter fooFormatter;
    
}