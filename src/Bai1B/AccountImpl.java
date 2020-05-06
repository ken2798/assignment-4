/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1B;

import java.util.List;
import java.util.*;

/**
 *
 * @author CongNguyen
 */
public class AccountImpl implements AccountDao{
    private List<Account> listAccounts = new ArrayList<>();
    public AccountImpl() {
        listAccounts.add(new Account("congnguyen", "cong@gmail.com", 1));
        listAccounts.add(new Account("nguyenhi", "hihi@gmail.com", 2));
    }
    @Override
    public List<Account> getAllAccounts() {
        return listAccounts;
    }
    @Override
    public Account getAccount(int id) {
        return listAccounts.get(id);
    }
    @Override
    public void updateAccount(Account account) {
        listAccounts.get(account.getId()).setName(account.getName());
        System.out.println("Updated");
    }
    @Override
    public void deleteAccount(Account account) {
        listAccounts.remove(account.getId());
        System.out.println("Deleted");
    }
    
}
