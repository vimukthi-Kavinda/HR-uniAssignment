package model;

public class HrAdminEmployee {
    private String name;
    private String employeeNo;
    private String userName;
    private String password;
    private String post;

    public HrAdminEmployee() {
    }

    public HrAdminEmployee(String name, String employeeNo, String userName, String password, String post) {
        this.name = name;
        this.employeeNo = employeeNo;
        this.userName = userName;
        this.password = password;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
