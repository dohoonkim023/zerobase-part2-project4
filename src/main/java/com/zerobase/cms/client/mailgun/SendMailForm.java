package com.zerobase.cms.client.mailgun;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
public class SendMailForm {
    private String from;
    private String to;
    private String subject;
    private String text;
}
