package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@SpringBootTest
public class MailTests {

    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void textTextMail(){
        mailClient.sendMail("t1462483207@sina.com","邮件","你好！");
    }

    @Test
    public void textHtmlMail(){
        Context context = new Context();
        context.setVariable("username","trq");
        String content = templateEngine.process("/mail/demo", context);
        System.out.println(content);
        mailClient.sendMail("t1462483207@sina.com","HTML",content);
    }
}
