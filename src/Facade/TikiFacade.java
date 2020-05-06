/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Service.AccountService;
import Service.EmailService;
import Service.PaymentService;
import Service.ShippingService;
import Service.SmsService;

/**
 *
 * @author CongNguyen
 */
public class TikiFacade {
    private static final TikiFacade INSTANCE = new TikiFacade();
 
    private AccountService accountService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private EmailService emailService;
    private SmsService smsService;
 
    private TikiFacade() {
        accountService = new AccountService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
        emailService = new EmailService();
        smsService = new SmsService();
    }
 
    public static TikiFacade getInstance() {
        return INSTANCE;
    }
 
    public void buyProductByCashWithFreeShipping(String email) {
        accountService.getAccount(email);
        paymentService.paymentByCash();
        shippingService.freeShipping();
        emailService.sendMail(email);
        System.out.println("Done\n");
    }
 
    public void buyProductByVNPayWithStandardShipping(String email, String mobilePhone) {
        accountService.getAccount(email);
        paymentService.paymentByVNPay();
        shippingService.standardShipping();
        emailService.sendMail(email);
        smsService.sendSMS(mobilePhone);
        System.out.println("Done\n");
    }
    
    public void buyProductByCashWithExpressShipping(String email, String mobilePhone) {
        accountService.getAccount(email);
        paymentService.paymentByCash();
        shippingService.expressShipping();
        emailService.sendMail(email);
        smsService.sendSMS(mobilePhone);
        System.out.println("Done\n");
    }
}
