package model;

public class LeaveRequestTable {
    private String empId;
    private String leaveDayCount;
    private String startDate;
    private String reason;

    public LeaveRequestTable(String empId, String leaveDayCount, String startDate, String reason) {
        this.empId = empId;
        this.leaveDayCount = leaveDayCount;
        this.startDate = startDate;
        this.reason = reason;
    }

    public LeaveRequestTable() {
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getLeaveDayCount() {
        return leaveDayCount;
    }

    public void setLeaveDayCount(String leaveDayCount) {
        this.leaveDayCount = leaveDayCount;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
