package com.zerobase.cms.service.test;

import com.zerobase.cms.client.MailgunClient;
import com.zerobase.cms.client.mailgun.SendMailForm;
import feign.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSendService {
    private final MailgunClient mailgunClient;

    public String sendEamil() {

        SendMailForm form = SendMailForm.builder()
                .from("sandbox4d2e86aa8aac4fbf98409ca6d11d5e36@mailgun.org")
                .to("dohoonkim348@gmail.com")
                .subject("Test email from zero base")
                .text("my text")
                .build();
        return mailgunClient.sendMail(form);
    }

}
