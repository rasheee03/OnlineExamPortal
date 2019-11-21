package com.lti.controller;


@Controller
public class RootController {

		@Autowired
		private SmtpMailSender smtpMailSender;

		@GetMapping("/send-mail")
		public void sendMail() throws MessagingException {
			smtpMailSender.send("rashi.150410107121@gmail.com", "testing-subject", "hey there-body");
		}

	}
}
