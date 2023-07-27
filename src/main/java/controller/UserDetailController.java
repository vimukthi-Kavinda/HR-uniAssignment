package controller;

import model.Employee;
import model.HrAdminEmployee;
import util.TestData;

public class UserDetailController {

    /*public static Employee getEmployeeDetails(String un){
        Employee e=null;
        for(Employee t: TestData.empUserPwd){
            if(t.getUserName().equals(un)){
                e=t;
                break;
            }
        }
        return e;

    }*/
    public static HrAdminEmployee getHrDetails(String un){
        HrAdminEmployee e=null;
        for(HrAdminEmployee t: TestData.hrUserPwd){
            if(t.getUserName().equals(un)){
                e=t;
                break;
            }
        }
        return e;

    }
}
