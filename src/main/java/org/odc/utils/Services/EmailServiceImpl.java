package org.odc.utils.Services;

import org.odc.utils.Generics.Services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

public abstract class EmailServiceImpl implements EmailService {
    public abstract void sendEmail(String email, String subject,String content) ;
}
