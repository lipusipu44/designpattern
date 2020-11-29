package chain_of_responsibility.udemy.client;

import chain_of_responsibility.udemy.approver_structure.Director;
import chain_of_responsibility.udemy.approver_structure.LeaveApprover;
import chain_of_responsibility.udemy.approver_structure.Manager;
import chain_of_responsibility.udemy.approver_structure.ProjectLead;
import chain_of_responsibility.udemy.leave_application.LeaveApplication;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        LeaveApplication leaveApplication=LeaveApplication.getBuilder().withType(LeaveApplication.Type.Sick).from(LocalDate.now())
                .to(LocalDate.of(2020,12,2))
                .build();
        System.out.println(leaveApplication);
        System.out.println("******************************************");
        LeaveApprover approver=createChain();
        approver.processLeaveApplication(leaveApplication);
        System.out.println(leaveApplication);
    }

    public static LeaveApprover createChain(){
        Director director=new Director(null);
        Manager manager=new Manager(director);
        ProjectLead projectLead=new ProjectLead(manager);
        return projectLead;
    }
}
