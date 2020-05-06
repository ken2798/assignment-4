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
public abstract class Bank {
    protected Account account;
 
    public Bank(Account account) {
        this.account = account;
    }
 
    public abstract void openAccount();
}
