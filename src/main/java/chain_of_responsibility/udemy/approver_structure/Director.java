package chain_of_responsibility.udemy.approver_structure;

import chain_of_responsibility.udemy.leave_application.LeaveApplication;

public class Director extends Employee{


    public Director(LeaveApprover successor) {
        super("Director", successor);
    }

    @Override
    public boolean processRequest(LeaveApplication application) {
        if(application.getType()== LeaveApplication.Type.PTO){
            application.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
