package model;

public class ConfirmedLeaves {
    private String employeeNo;
    private int leaveDayCount;
    private String leaveStartingDate;
    private String confirmedOfficer;
    private String reason;

    public ConfirmedLeaves(String employeeNo, int leaveDayCount, String leaveStartingDate, String confirmedOfficer, String reason) {
        this.employeeNo = employeeNo;
        this.leaveDayCount = leaveDayCount;
        this.leaveStartingDate = leaveStartingDate;
        this.confirmedOfficer = confirmedOfficer;
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ConfirmedLeaves() {
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

    public String getConfirmedOfficer() {
        return confirmedOfficer;
    }

    public void setConfirmedOfficer(String confirmedOfficer) {
        this.confirmedOfficer = confirmedOfficer;
    }
}
