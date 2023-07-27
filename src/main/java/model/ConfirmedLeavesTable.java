package model;

public class ConfirmedLeavesTable {

    private String employeeNo;
    private String leaveDayCount;
    private String leaveStartingDate;
    private String confirmedOfficer;
    private String reason;
    private  String remainLeaves;

    public ConfirmedLeavesTable(String employeeNo, String leaveDayCount, String leaveStartingDate, String confirmedOfficer, String reason, String remainLeaves) {
        this.employeeNo = employeeNo;
        this.leaveDayCount = leaveDayCount;
        this.leaveStartingDate = leaveStartingDate;
        this.confirmedOfficer = confirmedOfficer;
        this.reason = reason;
        this.remainLeaves = remainLeaves;
    }

    public ConfirmedLeavesTable() {
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getLeaveDayCount() {
        return leaveDayCount;
    }

    public void setLeaveDayCount(String leaveDayCount) {
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRemainLeaves() {
        return remainLeaves;
    }

    public void setRemainLeaves(String remainLeaves) {
        this.remainLeaves = remainLeaves;
    }
}
