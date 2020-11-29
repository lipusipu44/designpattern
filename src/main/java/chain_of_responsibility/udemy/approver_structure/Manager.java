package chain_of_responsibility.udemy.approver_structure;

import chain_of_responsibility.udemy.leave_application.LeaveApplication;

public class Manager extends Employee{


    public Manager(LeaveApprover successor) {
        super("Manager", successor);
    }

    @Override
    public boolean processRequest(LeaveApplication application) {
        switch (application.getType()){
            case Sick:
                application.approve(getApproverRole());
                return true;

            case PTO:
                if(application.getNoOfDays()<=5){
                    application.approve(getApproverRole());
                    return true;
                }
        }
        return false;
    }

}
