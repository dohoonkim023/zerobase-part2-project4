package com.zerobase.cms.controller;

import com.zerobase.cms.client.MailgunClient;
import com.zerobase.cms.service.test.EmailSendService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestContr {

    private final MailgunClient mailgunClient;

    @GetMapping
    public String sendEmail() {
//        //testcode작성
//        return MailgunClient.sendEamil();
        return "";

    }
}
