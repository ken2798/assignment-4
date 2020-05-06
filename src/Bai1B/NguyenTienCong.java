/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1B;

/**
 *
 * @author CongNguyen
 */
public class NguyenTienCong {
    public static void main(String[] args) {
        AccountDao accountDAO = new AccountImpl();
        
        for(Account account : accountDAO.getAllAccounts()) {
            System.out.println("Account id: " + account.getId() + "||name: "+account.getName() + "||email: " + account.getEmail());
        }
        // update account co id = 1
        Account account = accountDAO.getAllAccounts().get(0);
        account.setName("CongNguyen1");
        accountDAO.updateAccount(account);
        // lay account co id = 1
        accountDAO.getAccount(0);
        System.out.println("Account id: " + account.getId() + "||name: "+account.getName() + "||email: " + account.getEmail());
               
    }
}
