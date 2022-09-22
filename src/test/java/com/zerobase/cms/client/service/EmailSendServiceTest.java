package com.zerobase.cms.client.service;

import com.zerobase.cms.client.MailgunClient;
import com.zerobase.cms.service.test.EmailSendService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailSendServiceTest {

    @Autowired
    private MailgunClient mailgunClient;

    @Test
    public void EmailTest() {
        //need test code
//        String response = mailgunClient.sendEamil();
//        System.out.println(response);


    }
}