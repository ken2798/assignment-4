/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3A;

/**
 *
 * @author CongNguyen
 */
public class TPBank extends Bank{

    public TPBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.print("Tài khoản của bạn mở tại TPBank là CDF");
        account.openAccount();
    }
    
}
