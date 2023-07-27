package controller;

import model.Employee;
import model.HrAdminEmployee;
import util.TestData;

public class LoginController {

    public  boolean employeeLogin(String un,String pwd){
        boolean logged=false;
        for(Employee usr: TestData.empUserPwd){
            if(usr.getUserName().equals(un)){
                if(usr.getPassword().equals(pwd)){
                    logged=true;
                    break;
                }
            }
        }
        return logged;

    }


    public  boolean hrEmplyeeeLogin(String un, String pwd) {
        boolean logged=false;
        for(HrAdminEmployee usr: TestData.hrUserPwd){
            if(usr.getUserName().equals(un)){
                if(usr.getPassword().equals(pwd)){
                    logged=true;
                    break;
                }
            }
        }
        return logged;
    }
}
