package org.example.Mokito.TestDubble.dummy;

import org.example.Dummy.EmailService;

public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(String message) {
        throw  new AssertionError("Method not implemented ");
    }
}
