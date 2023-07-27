package model;


public class Employee {
    private String name;
    private String employeeNo;
    private String department;
    private String userName;
    private String password;
    private String post;

    private int remainLeaveDays;
    private int workedDays;

    private String city;

    private String nic;

    public Employee(String name, String employeeNo, String department, String userName, String password, String post, int remainLeaveDays, int workedDays, String city, String nic) {
        this.name = name;
        this.employeeNo = employeeNo;
        this.department = department;
        this.userName = userName;
        this.password = password;
        this.post = post;
        this.remainLeaveDays = remainLeaveDays;
        this.workedDays = workedDays;
        this.city = city;
        this.nic = nic;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }



    public Employee() {
    }



    public int getRemainLeaveDays() {
        return remainLeaveDays;
    }

    public void setRemainLeaveDays(int remainLeaveDays) {
        this.remainLeaveDays = remainLeaveDays;
    }

    public int getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(int workedDays) {
        this.workedDays = workedDays;
    }



    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
