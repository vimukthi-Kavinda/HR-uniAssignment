package model;

public class EmployeeTable {
   private String empNo;
    private String empName;
    private String dept;
    private String post;
    private String workedDayCount;
    private String remainLeaves;

    public EmployeeTable(String empNo, String empName, String dept, String post, String workedDayCount, String remainLeaves) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.post = post;
        this.workedDayCount = workedDayCount;
        this.remainLeaves = remainLeaves;
    }

    public EmployeeTable() {
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getWorkedDayCount() {
        return workedDayCount;
    }

    public void setWorkedDayCount(String workedDayCount) {
        this.workedDayCount = workedDayCount;
    }

    public String getRemainLeaves() {
        return remainLeaves;
    }

    public void setRemainLeaves(String remainLeaves) {
        this.remainLeaves = remainLeaves;
    }
}
