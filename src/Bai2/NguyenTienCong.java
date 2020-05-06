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
public class NguyenTienCong {
    public static void main(String[] args) {
        System.out.println("NORMAL EMPLOYEE: ");
        EmployeeComponent employee = new EmployeeConcreteComponent("CongNguyen");
        employee.showBasicInformation();
        employee.doTask();
 
        System.out.println("\nTEAM LEADER: ");
        EmployeeComponent teamLeader = new TeamLeader(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();
 
        System.out.println("\nMANAGER: ");
        EmployeeComponent manager = new Manager(employee);
        manager.showBasicInformation();
        manager.doTask();
 
        System.out.println("\nTEAM LEADER AND MANAGER: ");
        EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();
    }
}
