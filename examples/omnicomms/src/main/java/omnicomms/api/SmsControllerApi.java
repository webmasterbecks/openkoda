package omnicomms.api;

import omnicomms.service.TwilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsControllerApi {

    @Autowired
    private TwilioService twilioService;

    @PostMapping("/api/send-sms")
    public String sendSms(@RequestParam String to, @RequestParam String body) {
        twilioService.sendSms(to, body);
        return "sent";
    }
}
