package com.qf.mail;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.EMail;
import com.qf.service.IEMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.util.Date;

/**
 * @Author X
 * @Date 2019/6/30 21:23
 * @Version 1.0
 **/
public class Mail  {

    @Autowired
    private JavaMailSender javaMailSender;

    @Reference
    private IEMailService eMailService;

    public  void SendEmailInfoUser(EMail eMail) throws Exception {

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

        mimeMessageHelper.setFrom("qingdumeilingzi@sina.com");

        mimeMessageHelper.addTo("");

        mimeMessageHelper.setSubject("找回密码");

        mimeMessageHelper.setText("请点击<a href=''>这里</a>找回密码",true);

        mimeMessageHelper.setSentDate(new Date());

        javaMailSender.send(mimeMessage);
    }

}
