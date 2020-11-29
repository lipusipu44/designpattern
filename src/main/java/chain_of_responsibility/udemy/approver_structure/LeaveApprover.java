package chain_of_responsibility.udemy.approver_structure;

import chain_of_responsibility.udemy.leave_application.LeaveApplication;

public interface LeaveApprover {
    void processLeaveApplication(LeaveApplication leaveApplication);
    String getApproverRole();
}
