package com.zerobase.cms.service;

import com.zerobase.cms.domain.SignUpForm;
import com.zerobase.cms.domain.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SignUpCustomerServiceTest {

    @Autowired
    private SignUpCustomerService signUpCustomerService;

    @Test
    void signUp() {
        SignUpForm form = SignUpForm.builder()
                .name("name")
                .birth(LocalDateTime.now())
                .email("abc2@gmail.com")
                .password("2")
                .phone("010000000")
                .build();
        Customer customer = signUpCustomerService.signUp(form);
        Assert.isTrue(signUpCustomerService.signUp(form).getId()!= null);
    }
}