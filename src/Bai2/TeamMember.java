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
public class TeamMember extends EmployeeDecorator{

    protected TeamMember(EmployeeComponent employee) {
        super(employee);
    }
    public void performTask() {
        System.out.println(this.employee.getName() + " is performing his assigned tasks.");
    }
    @Override
    public void doTask() {
        employee.doTask();
        performTask();
    }
    
}
