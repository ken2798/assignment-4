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
public class EmployeeConcreteComponent implements EmployeeComponent{
    private String name;
    public EmployeeConcreteComponent (String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void doTask() {
        // Unassigned task
    }
    @Override
    public void join(Date joinDate) {
        System.out.println(this.getName() + " joined on " + formatDate(joinDate));
    }
}
