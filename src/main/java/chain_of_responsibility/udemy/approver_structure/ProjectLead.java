package chain_of_responsibility.udemy.approver_structure;

import chain_of_responsibility.udemy.leave_application.LeaveApplication;

public class ProjectLead extends Employee{
    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }


    @Override
    public boolean processRequest(LeaveApplication application) {
//        Type is sick and duration is 2 days
        if(application.getNoOfDays()<2 && application.getType()== LeaveApplication.Type.Sick){
            application.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
