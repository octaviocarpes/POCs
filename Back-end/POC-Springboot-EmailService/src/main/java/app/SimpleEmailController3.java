package app;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;

@Controller
public class SimpleEmailController3 {

    @Autowired
    private JavaMailSender sender;

    @RequestMapping("/simpleemail3")
    @ResponseBody
    String home() {
        try {
            sendEmail();
            return "Email Sent!";
        } catch (Exception ex) {
            return "Error in sending email: " + ex;
        }
    }

    private void sendEmail() throws Exception {
        MimeMessage message = sender.createMimeMessage();

        // Enable the multipart flag!
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setTo("youremailhere@gmail.com");
        helper.setText("<html><body>Here is a logo! <img src='cid:id101'/><body></html>", true);
        helper.setSubject("Hi");

        File image = new File("src/main/download.jpeg");
        helper.addInline("id101", image);
        sender.send(message);
    }
}
