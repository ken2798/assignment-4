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
public class NguyenTienCong {
    public static void main(String[] args) {
        Bank vietcomBank = new VietcomBank(new CheckinhAccount());
        vietcomBank.openAccount();
 
        Bank tpBank = new TPBank(new CheckinhAccount());
        tpBank.openAccount();
    }
}
