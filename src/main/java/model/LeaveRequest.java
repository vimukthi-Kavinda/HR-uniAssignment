package model;

public class LeaveRequest {
    private String employeeNo;
    private int leaveDayCount;
    private String leaveStartingDate;
    private String reason;

    public LeaveRequest(String employeeNo, int leaveDayCount, String leaveStartingDate, String reason) {
        this.employeeNo = employeeNo;
        this.leaveDayCount = leaveDayCount;
        this.leaveStartingDate = leaveStartingDate;
        this.reason = reason;
    }

    public LeaveRequest() {
    }


    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public int getLeaveDayCount() {
        return leaveDayCount;
    }

    public void setLeaveDayCount(int leaveDayCount) {
        this.leaveDayCount = leaveDayCount;
    }

    public String getLeaveStartingDate() {
        return leaveStartingDate;
    }

    public void setLeaveStartingDate(String leaveStartingDate) {
        this.leaveStartingDate = leaveStartingDate;
    }
}
