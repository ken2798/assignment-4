/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Date;

/**
 *
 * @author CongNguyen
 */
public abstract class EmployeeDecorator implements EmployeeComponent{
    
    protected EmployeeComponent employee;
    
    protected EmployeeDecorator(EmployeeComponent employee) {
        this.employee = employee;
    }
    
    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public void join(Date joinDate) {
        employee.join(joinDate);
    }
    
}
