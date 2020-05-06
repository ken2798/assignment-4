/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author CongNguyen
 */
public class PaymentService {
    public void paymentByVNPay() {
        System.out.println("Thanh toán qua VNPay");
    }
 
    public void paymentByCreditCard() {
        System.out.println("Thanh toán bằng thẻ tín dụng");
    }
 
    public void paymentByVisa() {
        System.out.println("Thanh toán bằng thẻ Visa");
    }
 
    public void paymentByCash() {
        System.out.println("Thanh toán bằng tiền mặt");
    }
}
