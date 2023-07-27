package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.*;
import util.TestData;

import java.util.List;

public class HrController {

    private static final int INITIAL_LEAVE_COUNT=3;
    private static final int INITIAL_WORKED_COUNT=0;

    public HrAdminEmployee getHrAdminDetails(String usrName) {
        HrAdminEmployee returnBean=null;
        for (HrAdminEmployee tst: TestData.hrUserPwd
             ) {
            if(tst.getUserName().equals(usrName)){
                returnBean=tst;
                break;
            }

        }
        return returnBean;

    }

    public ObservableList<EmployeeTable> getEmpTableDataList() {
        List<Employee>el=TestData.empUserPwd;
        ObservableList<EmployeeTable> returnList  = FXCollections.observableArrayList();
        for (Employee e:el) {
            String workdays=Integer.toString(e.getWorkedDays());
            String remLeav=Integer.toString(e.getRemainLeaveDays());
            returnList.add(new EmployeeTable(e.getEmployeeNo(),e.getName(),e.getDepartment(),e.getPost(),workdays,remLeav));
        }

        return returnList;

    }

    public ObservableList<ApplicantTable> getApplicantDataList() {
        List<Applicant>el=TestData.applicantList;
        ObservableList<ApplicantTable> returnList  = FXCollections.observableArrayList();
        for (Applicant e:el) {
            String age=Integer.toString(e.getAge());
            returnList.add(new ApplicantTable(e.getNic(),e.getName(),e.getEducationQualification(),e.getCity(), e.getDob(), age));
        }

        return returnList;

    }

    public ObservableList<LeaveRequestTable> getLeaveReqDataList() {
        List<LeaveRequest>el=TestData.tempLeaveReq;
        ObservableList<LeaveRequestTable> returnList  = FXCollections.observableArrayList();
        for (LeaveRequest e:el) {
            String lvDays=Integer.toString(e.getLeaveDayCount());
            returnList.add(new LeaveRequestTable(e.getEmployeeNo(),lvDays,e.getLeaveStartingDate(),e.getReason()));
        }

        return returnList;
    }

    public ObservableList<ConfirmedLeavesTable> getLeaveDataList() {
        List<ConfirmedLeaves>el=TestData.confirmedLeaves;
        EmployeeController ec=new EmployeeController();

        ObservableList<ConfirmedLeavesTable> returnList  = FXCollections.observableArrayList();
        for (ConfirmedLeaves e:el) {
            String lvDays=Integer.toString(e.getLeaveDayCount());
            String remLv=Integer.toString(ec.getEmployeeDetailsByEmpId(e.getEmployeeNo()).getRemainLeaveDays());
            returnList.add(new ConfirmedLeavesTable(e.getEmployeeNo(),lvDays,e.getLeaveStartingDate(),e.getReason(), e.getConfirmedOfficer(), remLv));
        }

        return returnList;
    }

    public Applicant getAppliicantDeails(String nic) {
        for (Applicant a:TestData.applicantList) {
            if(a.getNic().equals(nic))
                return a;

        }
        return null;
    }

    public boolean recruitApplicant(String name, String txtAppliEmpId, String txtEmpDept, String txtAppliUn, String txtAppliPwd, String txtAppliPost, String txtAppliNic, String city) {
        //empId | un already in err

        for (Employee e:TestData.empUserPwd) {
            if(e.getEmployeeNo().equals(txtAppliEmpId)||e.getUserName().equals(txtAppliUn)){
                return false;
            }
        }
        //Add to Employee List
        TestData.empUserPwd.add(new Employee(name,txtAppliEmpId,txtEmpDept,txtAppliUn,txtAppliPwd,txtAppliPost,INITIAL_LEAVE_COUNT,INITIAL_WORKED_COUNT,city,txtAppliNic));

        //remove from Applicant List
        TestData.applicantList.remove(this.getAppliicantDeails(txtAppliNic));

        return true;

    }

    public boolean isLeaveRequested(String txtEmpNoLeaveReq) {
        for (LeaveRequest l:TestData.tempLeaveReq) {
            if(l.getEmployeeNo().equals(txtEmpNoLeaveReq)){
                return true;
            }
        }
        return false;
    }

    public boolean confirmLeaveRequest(String txtEmpNoLeaveReq,String un) {
        LeaveRequest lr=this.getLeaveRequestByEmpId(txtEmpNoLeaveReq);
        if(lr!=null) {
            //adding to confirmed leave list
            TestData.confirmedLeaves.add(new ConfirmedLeaves(txtEmpNoLeaveReq,lr.getLeaveDayCount(),lr.getLeaveStartingDate(),un,lr.getReason()));
            //removing from temp leave list
            TestData.tempLeaveReq.remove(lr);
            return true;

        }
        return false;

    }

    private LeaveRequest getLeaveRequestByEmpId(String txtEmpNoLeaveReq) {
        for (LeaveRequest l:TestData.tempLeaveReq) {
            if(l.getEmployeeNo().equals(txtEmpNoLeaveReq)){
                return l;
            }

        }
        return null;
    }

    public boolean rejectLeaveRequest(String empId) {
        LeaveRequest lr=this.getLeaveRequestByEmpId(empId);
        if(lr!=null) {
            //removing from leave request lit
            TestData.tempLeaveReq.remove(lr);

            //adding back requested leave day count to employee
            for (Employee e:TestData.empUserPwd) {
                if(e.getEmployeeNo().equals(empId)){
                    e.setRemainLeaveDays(e.getRemainLeaveDays()+lr.getLeaveDayCount());
                    break;
                }
            }

            return true;


        }
        return false;
    }




   /* public boolean recruitApplicant(String txtAppliNic, String txtAppliUn, String txtAppliPwd, String txtEmpDept, String txtAppliEmpId, String txtAppliPost) {
    //empId | un already in err

        for (Employee e:TestData.empUserPwd) {
            if(e.getEmployeeNo().equals(txtAppliEmpId)||e.getUserName().equals(txtAppliUn)){
                return false;
            }
        }
        //default leaveCount assign
        int

        TestData.empUserPwd.add(new Employee());



    }*/
}
