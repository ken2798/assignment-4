/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author CongNguyen
 */
public class TeamLeader extends EmployeeDecorator{
    
    protected TeamLeader(EmployeeComponent employee) {
        super(employee);
    }
    
    public void planing() {
        System.out.println(this.employee.getName() + " is planing.");
    }
    public void monitor() {
        System.out.println(this.employee.getName() + " is monitoring his members.");
    }
    
    @Override
    public void doTask() {
        employee.doTask();
        planing();
        monitor(); 
    }
    
}
