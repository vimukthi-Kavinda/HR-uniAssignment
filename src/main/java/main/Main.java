package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;
import util.TestData;

public class Main extends Application {

    private static Stage stg;

    public static void main(String[] args) {
        System.out.println("Initializing Employee users.. ");
        TestData.empUserPwd.add(new Employee("j. doe", "a001", "a", "tst1", "1111", "manager", 2, 15,"cty1","id1"));
        TestData.empUserPwd.add(new Employee("A. perera", "a002", "a", "tst2", "2222", "SE", 1, 10,"cty2","id1"));
        TestData.empUserPwd.add(new Employee("B. peiris", "a003", "b", "tst3", "3333", "security", 2, 16,"cty1","id1"));
        TestData.empUserPwd.add(new Employee("C. fernando", "a004", "b", "tst4", "4444", "support", 3, 5,"cty1","id1"));
        TestData.empUserPwd.add(new Employee("D. rodrigo", "a023", "a", "tst23", "2222", "SE", 1, 10,"cty2","id1"));
        TestData.empUserPwd.add(new Employee("E. silva", "a024", "b", "tst24", "3333", "security", 2, 16,"cty2","id1"));
        TestData.empUserPwd.add(new Employee("F. kumar", "a025", "b", "tst25", "4444", "support", 3, 5,"cty1","id1"));

        System.out.println("Employee users initialized. ");

        System.out.println("Initializing HR admin users.. ");
        TestData.hrUserPwd.add(new HrAdminEmployee("C. silva", "hr001", "hr1", "1111", "manager"));
        TestData.hrUserPwd.add(new HrAdminEmployee("D. kumara", "hr002", "hr2", "2222", "trainee"));
        TestData.hrUserPwd.add(new HrAdminEmployee("A. Silva", "hr003", "hr3", "3333", "associate"));
        TestData.hrUserPwd.add(new HrAdminEmployee("B. perera", "hr004", "hr4", "4444", "manager"));
        System.out.println("HR admin users initialized. ");

        System.out.println("Initializing tempory leave requests.. ");
        TestData.tempLeaveReq.add(new LeaveRequest("a002", 2, "2023-8-1","sick"));
        //TestData.tempLeaveReq.add(new LeaveRequest("a005", 1, "2023-8-5","academic"));
        TestData.tempLeaveReq.add(new LeaveRequest("a004", 3, "2023-8-2","personal"));
        TestData.tempLeaveReq.add(new LeaveRequest("a001", 1, "2023-8-1","sick"));
        System.out.println("initialized. ");


        //Dates should be in yyyy-MM-dd format
        System.out.println("Initializing applicant requests.. ");
        TestData.applicantList.add(new Applicant("j. silva", "12526562","A/L","city1", "2002-08-01"));
        TestData.applicantList.add(new Applicant("K. kumara", "54556563","BSC", "city2","2001-08-02"));
        TestData.applicantList.add(new Applicant("D. perera", "18989898","MSC", "city1","1994-08-01"));
        System.out.println("initialized. ");

        System.out.println("Initializing leaves confirmed.. ");
        TestData.confirmedLeaves.add(new ConfirmedLeaves("a025", 2, "2023-8-1","hr001","sick"));
        //TestData.tempLeaveReq.add(new LeaveRequest("a005", 1, "2023-8-5","academic"));
        TestData.confirmedLeaves.add(new ConfirmedLeaves("a024", 3, "2023-8-2","hr002","personal"));
        TestData.confirmedLeaves.add(new ConfirmedLeaves("a023", 1, "2023-8-1","hr001","academic"));
        System.out.println("initialized. ");


        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stg=stage;

        Parent prnt= FXMLLoader.load(getClass().getResource("/main.fxml"));
        Scene scn=new Scene(prnt);
        stg.setScene(scn);
        stg.show();




    }
}
