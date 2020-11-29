package chain_of_responsibility.udemy.approver_structure;

import chain_of_responsibility.udemy.leave_application.LeaveApplication;

public abstract class Employee implements LeaveApprover{

    private String role;
    private LeaveApprover successor;

    public Employee(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processLeaveApplication(LeaveApplication leaveApplication) {
        if (!processRequest(leaveApplication) && successor!=null){
            successor.processLeaveApplication(leaveApplication);
        }

    }

    public abstract boolean processRequest(LeaveApplication application);

    @Override
    public String getApproverRole() {
        return this.role;
    }
}
