/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1B;

import java.util.List;

/**
 *
 * @author CongNguyen
 */
public interface AccountDao {
    public List<Account> getAllAccounts();
    public Account getAccount(int id);
    public void updateAccount(Account account);
    public void deleteAccount(Account account);
}
