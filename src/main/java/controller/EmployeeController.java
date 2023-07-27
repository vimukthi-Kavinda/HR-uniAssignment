package controller;

import model.Employee;
import model.LeaveRequest;
import util.TestData;

public class EmployeeController {

    public int getEmployeeRemainLeaves(String un) {
        int remain = 0;

        for (Employee e : TestData.empUserPwd) {
            if (e.getUserName().equals(un)) {
                remain = e.getRemainLeaveDays();
                break;
            }
        }

        return remain;
    }


    public Employee getEmployeeDetails(String un) {

        //select from db and get empNo remainLeaves and send bck to view
        Employee e = null;
        for (Employee t : TestData.empUserPwd) {
            if (t.getUserName().equals(un)) {
                e = t;
                break;
            }
        }
        return e;


    }

    public Employee getEmployeeDetailsByEmpId(String empid) {

        //select from db and get empNo remainLeaves and send bck to view
        Employee e = null;
        for (Employee t : TestData.empUserPwd) {
            if (t.getEmployeeNo().equals(empid)) {
                e = t;
                break;
            }
        }
        return e;


    }

    public int requestLeaves(LeaveRequest lv) {
        String empNo = lv.getEmployeeNo();

        for (LeaveRequest l : TestData.tempLeaveReq) {
            if (l.getEmployeeNo().equals(empNo)) {
                //requested already
                return 0;
            }
        }

        TestData.tempLeaveReq.add(lv);
        return 1;
    }

    public int substractEmpLeaveCount(String employeeNo, int reqDays) {
        int remain=0;
        for(Employee e:TestData.empUserPwd){
            if(e.getEmployeeNo().equals(employeeNo)){
                e.setRemainLeaveDays(e.getRemainLeaveDays()-reqDays);
                remain=e.getRemainLeaveDays();
            }
        }
        return remain;

    }


    public void markEmpWorkingDay(String empNo) {
        for (Employee t : TestData.empUserPwd) {
            if (t.getEmployeeNo().equals(empNo)) {
                t.setWorkedDays(t.getWorkedDays() + 1);
                break;
            }
        }
    }
}
