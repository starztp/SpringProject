package com.tianyou.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "otherbean")
public class OtherBean {

    @Value("otherbeanmsg")
    private String msg;
}
