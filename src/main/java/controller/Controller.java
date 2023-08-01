package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    Button btnEmployee;

    @FXML
    Button btnHr;

    @FXML
    Button btnEmpLeaveReq;
    @FXML
    Button btnLeaveCount;
    @FXML
    Label lblEmpNm;
    @FXML
    Button btnEmpLogOut;
    @FXML
    TextField txtEmpUn;
    @FXML
    TextField txtEmpPwd;
    @FXML
    Button btnEmpLogin;
    @FXML
    TextField txtHrUn;
    @FXML
    TextField txtHrPwd;
    @FXML
    Button btnHrLogin;
    @FXML
    Label lblHrUn;
    @FXML
    Button btngetEmpDtail;
    @FXML
    Button btnRecruit;
    @FXML
    Button btnLeaveMgt;
    @FXML
    Button btnHrLogOut;
    @FXML
    Label lblLeaveCount;

    @FXML
    Label lblErrMsg;

    @FXML
    TextField txtNofDay;

    @FXML
    TextField txtStrtDate;
    @FXML
    TextArea txtAreaResn;
    @FXML
    Button btnReqLeave;
    @FXML
    Button btnleaveReqBackEmp;


    //applicant table

    @FXML
    TableView<ApplicantTable> tblAllApplicnt;

    @FXML
    TableColumn<ApplicantTable, String> tblColAppliNic;

    @FXML
    TableColumn<ApplicantTable, String> tblColAlliNm;
    @FXML
    TableColumn<ApplicantTable, String> tblColAppliHe;
    @FXML
    TableColumn<ApplicantTable, String> tblColAppliCty;
    @FXML
    TableColumn<ApplicantTable, String> tblColAppliDoB;
    @FXML
    TableColumn<ApplicantTable, String> tblColAppliAge;


    @FXML
    TextField txtAppliNic;
    @FXML
    TextField txtAppliUn;
    @FXML
    TextField txtEmpDept;
    @FXML
    TextField txtAppliEmpId;
    @FXML
    TextField txtAppliPost;
    @FXML
    TextField txtAppliPwd;

    @FXML
    Button btnAppliRecruit;

    @FXML
    Button btnBckFromAppliLoad;

    @FXML
    Button btnLoadApplicantData;


    //

    //Load All Employees frm

    @FXML
    TableView<EmployeeTable> tblAllEmps;
    @FXML
    TableColumn<EmployeeTable, String> tblColEmpNo;
    @FXML
    TableColumn<EmployeeTable, String> tblColEmpNm;
    @FXML
    TableColumn<EmployeeTable, String> tblColEmpDpt;
    @FXML
    TableColumn<EmployeeTable, String> tblColEmpPost;
    @FXML
    TableColumn<EmployeeTable, String> tblColEmpWrkDc;
    @FXML
    TableColumn<EmployeeTable, String> tblColEmpRemLv;

    @FXML
    Button btnLoadEmpData;

    @FXML
    Button btnBckFromEmpLoad;

    // conf or reject leave
    @FXML
    TableView<LeaveRequestTable> tblLeaveReq;
    @FXML
    TableColumn<LeaveRequestTable, String> tblColEmpId;
    @FXML
    TableColumn<LeaveRequestTable, String> tblColDayCount;
    @FXML
    TableColumn<LeaveRequestTable, String> tblColStrtDay;
    @FXML
    TableColumn<LeaveRequestTable, String> tblColReason;

    @FXML
    Button btnBckFromLeaveConf;
    @FXML
    Button btnConfEmpLeave;
    @FXML
    Button btnRejEmpLeave;

    @FXML
    TextField txtEmpNoLeaveReq;

    @FXML
    Button btnLoadAllReq;


    ///conf reqs

    @FXML
    TableView tblConfLv;

    @FXML
    TableColumn<ConfirmedLeavesTable, String> tblColConfLvEmpid;

    @FXML
    TableColumn<ConfirmedLeavesTable, String> tblColConfLvLvDc;

    @FXML
    TableColumn<ConfirmedLeavesTable, String> tblColConfLvStrtDy;
    @FXML
    TableColumn<ConfirmedLeavesTable, String> tblColConfLvResn;
    @FXML
    TableColumn<ConfirmedLeavesTable, String> tblColConfLvCofOff;//confirmed officer
    @FXML
    TableColumn<ConfirmedLeavesTable, String> tblColConfLvRemLv;
    @FXML
    Button btnLoadLeave;

    private ObservableList<ApplicantTable> appcantData;
    private ObservableList<EmployeeTable> employeeTblDataList;
    private ObservableList<LeaveRequestTable> leaveReqData;
    private ObservableList<ConfirmedLeavesTable> leaveData;


    Stage stage = new Stage();
    static String usrName, name;


    EmployeeController employeeController;

    LoginController logincontroller;

    HrController hrController;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void loadHrLogin(ActionEvent e) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("/hrlogin.fxml"));
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
        ((Node) e.getSource()).getScene().getWindow().hide();

    }

    public void loadEmpLogin(ActionEvent e) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("/emplogin.fxml"));

        Scene scene = new Scene(part);
        stage.setScene(scene);

        stage.show();
        ((Node) e.getSource()).getScene().getWindow().hide();
    }


    //employee panel.. load leave request form
    public void reqEmpLeave(ActionEvent e) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("/reqleave.fxml"));

        Scene scene = new Scene(part);
        stage.setScene(scene);

        stage.show();
        ((Node) e.getSource()).getScene().getWindow().hide();
    }

    public void getEmpLeaveCount(ActionEvent e) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("/leaveCountNotification.fxml"));

        Label l = (Label) part.lookup("#lblDayCount");
        employeeController = new EmployeeController();
        int days = employeeController.getEmployeeRemainLeaves(usrName);

        l.setText(days + " Days");
        Scene scene = new Scene(part);

        stage.setScene(scene);
        // System.out.println(s);

        stage.show();


    }

    public void empLogOut(ActionEvent e) throws IOException {
        loadEmpLogin(e);
    }

    public void employeeLogin(ActionEvent e) throws IOException {
        logincontroller = new LoginController();
        boolean isValid = logincontroller.employeeLogin(txtEmpUn.getText(), txtEmpPwd.getText());

        if (isValid) {

            Parent part = FXMLLoader.load(getClass().getResource("/empPanel.fxml"));

            //Employee logUsr = UserDetailController.getEmployeeDetails(txtEmpUn.getText());
            employeeController = new EmployeeController();
            usrName = txtEmpUn.getText();
            Employee logUsr = employeeController.getEmployeeDetails(usrName);


            //adds 1 day to current worked day count
            //update -> add a new field to employee last log date
            //if lastlogged date != today date -> increment worked day count
            // set last logged date = to day date
            employeeController.markEmpWorkingDay(logUsr.getEmployeeNo());


            Label l = (Label) part.lookup("#lblusername");
            Label l2 = (Label) part.lookup("#lblWrkDays");
            l.setText(logUsr.getName());
            l2.setText("you have worked " + logUsr.getWorkedDays() + " days");


            Scene scene = new Scene(part);
            stage.setScene(scene);


            stage.show();
            ((Node) e.getSource()).getScene().getWindow().hide();

        } else {
            loadErrorNotification("Invalid Login.. Recheck User Name and Password", e);
        }

    }

    private void loadErrorNotification(String s, ActionEvent e) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("/errNotification.fxml"));

        Label l = (Label) part.lookup("#lblErr");
        l.setText(s);
        Scene scene = new Scene(part);

        stage.setScene(scene);
        // System.out.println(s);

        stage.show();
    }

    private void loadSuccessNotification(String s, ActionEvent e) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("/successNotification.fxml"));

        Label l = (Label) part.lookup("#lblSuccssMsg");
        l.setText(s);
        Scene scene = new Scene(part);

        stage.setScene(scene);
        // System.out.println(s);

        stage.show();
    }


    public void hrLogin(ActionEvent e) throws IOException {
        logincontroller = new LoginController();
        boolean isValid = logincontroller.hrEmplyeeeLogin(txtHrUn.getText(), txtHrPwd.getText());

        if (isValid) {

            Parent part = FXMLLoader.load(getClass().getResource("/hrpanel.fxml"));

            hrController = new HrController();


            Label l = (Label) part.lookup("#lblhrusername");
            usrName = txtHrUn.getText();

            HrAdminEmployee hr = hrController.getHrAdminDetails(usrName);

            l.setText(hr.getName());

            Scene scene = new Scene(part);
            stage.setScene(scene);

            stage.show();
            ((Node) e.getSource()).getScene().getWindow().hide();

        } else {
            loadErrorNotification("Invalid Login.. Recheck User Name and Password", e);
        }

    }

    /* HR PANEL  BUTTON FUNCTIONS */
    //get emp data
    public void getEmpDtail(ActionEvent e) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("/allEmplDetails.fxml"));


        Scene scene = new Scene(part);
        stage.setScene(scene);

        stage.show();


        ((Node) e.getSource()).getScene().getWindow().hide();
    }

    public void recruitApplicant(ActionEvent e) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("/applicantRecruit.fxml"));

        Scene scene = new Scene(part);
        stage.setScene(scene);

        stage.show();
        ((Node) e.getSource()).getScene().getWindow().hide();
    }

    public void manageLeaves(ActionEvent e) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("/leaveReqs.fxml"));

        Scene scene = new Scene(part);
        stage.setScene(scene);

        stage.show();
        ((Node) e.getSource()).getScene().getWindow().hide();
    }


    public void hrLogOut(ActionEvent e) throws IOException {
        loadHrLogin(e);
    }

    //----------------
    public void requestLeave(ActionEvent e) throws IOException {
        employeeController = new EmployeeController();
        Employee em = employeeController.getEmployeeDetails(usrName);

        if (em != null) {

            try {
                int reqDays = Integer.valueOf(txtNofDay.getText()).intValue();
                if (em.getRemainLeaveDays() < reqDays) {
                    loadErrorNotification("You have only " + em.getRemainLeaveDays() + " days of leave", e);
                } else if (em.getRemainLeaveDays() == 0) {
                    loadErrorNotification("You do not have leaves", e);

                } else {

                    LeaveRequest lv = new LeaveRequest(em.getEmployeeNo(), reqDays, txtStrtDate.getText(), txtAreaResn.getText());

                    //add record to leave req table
                    int succ1 = employeeController.requestLeaves(lv);
                    int succCount = 0;
                    if (succ1 == 1) {
                        //substract current leave count
                        succCount = employeeController.substractEmpLeaveCount(em.getEmployeeNo(), reqDays);
                        loadSuccessNotification("Leave request success.. \nYou have " + succCount + " Remain Leave days", e);

                    } else if (succ1 == 0) {
                        loadErrorNotification("You have already requested a leave", e);

                    }


                }
            } catch (NumberFormatException er) {
                loadErrorNotification("Invalid number " + er.getMessage(), e);
            } catch (Exception er) {
                loadErrorNotification("Error : " + er.getMessage(), e);

            }

        } else {
            loadErrorNotification("No Employee found", e);
        }


    }

    //err right pane bcak??
    public void backFromLeaveReq(ActionEvent e) throws IOException {
        //reqEmpLeave(e);
        Parent part = FXMLLoader.load(getClass().getResource("/empPanel.fxml"));

        employeeController = new EmployeeController();
        Label l = (Label) part.lookup("#lblusername");

        Employee em = employeeController.getEmployeeDetails(usrName);
        l.setText(em.getName());

        Scene scene = new Scene(part);
        stage.setScene(scene);

        stage.show();
        ((Node) e.getSource()).getScene().getWindow().hide();
    }


    /*applicant button functions*/
    public void recruitApplicantasEmp(ActionEvent e) throws IOException {

        hrController = new HrController();
        Applicant app = hrController.getAppliicantDeails(txtAppliNic.getText());
        if (app == null) {
            loadErrorNotification("No applicant found for NIC : \n" + txtAppliNic.getText(), e);
        } else {
            boolean res = hrController.recruitApplicant(app.getName(), txtAppliEmpId.getText(), txtEmpDept.getText(), txtAppliUn.getText(), txtAppliPwd.getText(), txtAppliPost.getText(), txtAppliNic.getText(), app.getCity());
            if (res) {
                loadSuccessNotification("Employee recruiting successful", e);
            } else {
                loadErrorNotification("Unable to Recruit.. Duplicated values", e);
            }
        }

    }

    //back to hr panel
    public void hrBckFrmAppliRecrt(ActionEvent e) throws IOException {
        hrBckFrmLeavReq(e);
    }


    /*load all emp button function*/

    //back to hr panel
    public void hrBckFrmEmpDtal(ActionEvent e) throws IOException {
        hrBckFrmLeavReq(e);
    }


    /*leave mgt functions*/

    //back to hr panel
    public void hrBckFrmLeavReq(ActionEvent e) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("/hrpanel.fxml"));

        hrController = new HrController();


        Label l = (Label) part.lookup("#lblhrusername");

        HrAdminEmployee hr = hrController.getHrAdminDetails(usrName);

        l.setText(hr.getName());

        Scene scene = new Scene(part);
        stage.setScene(scene);

        stage.show();
        ((Node) e.getSource()).getScene().getWindow().hide();
    }

    public void confEmpLeave(ActionEvent e) throws IOException {
        hrController = new HrController();
        employeeController = new EmployeeController();

        Employee em = employeeController.getEmployeeDetailsByEmpId(txtEmpNoLeaveReq.getText());
        if (em == null) {
            loadErrorNotification("No Employee found", e);
        } else {
            boolean isRequested = hrController.isLeaveRequested(txtEmpNoLeaveReq.getText());
            if (isRequested) {
                boolean succ = hrController.confirmLeaveRequest(txtEmpNoLeaveReq.getText(), usrName);
                if (succ) {
                    loadSuccessNotification("Leave confirmed succesfully", e);
                } else {
                    loadErrorNotification("Leave confirmation failed", e);
                }
            } else {
                loadErrorNotification("No leaves requested by Employee : \n" + txtEmpNoLeaveReq.getText(), e);
            }
        }
    }

    public void rejectEmpLeave(ActionEvent e) throws IOException {
        hrController = new HrController();
        employeeController = new EmployeeController();

        Employee em = employeeController.getEmployeeDetailsByEmpId(txtEmpNoLeaveReq.getText());
        if (em == null) {
            loadErrorNotification("No Employee found", e);
        } else {
            boolean isRequested = hrController.isLeaveRequested(txtEmpNoLeaveReq.getText());
            if (isRequested) {
                boolean succRej = hrController.rejectLeaveRequest(txtEmpNoLeaveReq.getText());
                if (succRej) {
                    loadSuccessNotification("Leave rejected succesfully", e);
                } else {
                    loadErrorNotification("Leave rejecting failed", e);
                }
            } else {
                loadErrorNotification("No leaves requested by Employee : \n" + txtEmpNoLeaveReq.getText(), e);
            }

        }
    }

    public void loadEmpDataToTbl(ActionEvent e) {


        hrController = new HrController();
        employeeTblDataList = hrController.getEmpTableDataList();


        tblColEmpNo.setCellValueFactory(new PropertyValueFactory<EmployeeTable, String>("empNo"));
        tblColEmpNm.setCellValueFactory(new PropertyValueFactory<EmployeeTable, String>("empName"));
        tblColEmpDpt.setCellValueFactory(new PropertyValueFactory<EmployeeTable, String>("dept"));
        tblColEmpPost.setCellValueFactory(new PropertyValueFactory<EmployeeTable, String>("post"));
        tblColEmpWrkDc.setCellValueFactory(new PropertyValueFactory<EmployeeTable, String>("workedDayCount"));
        tblColEmpRemLv.setCellValueFactory(new PropertyValueFactory<EmployeeTable, String>("remainLeaves"));

        tblAllEmps.setItems(employeeTblDataList);
    }

    public void loadApplicantData(ActionEvent e) {

        hrController = new HrController();
        appcantData = hrController.getApplicantDataList();


        tblColAppliNic.setCellValueFactory(new PropertyValueFactory<ApplicantTable, String>("appliNic"));
        tblColAlliNm.setCellValueFactory(new PropertyValueFactory<ApplicantTable, String>("appliName"));
        tblColAppliAge.setCellValueFactory(new PropertyValueFactory<ApplicantTable, String>("age"));
        tblColAppliCty.setCellValueFactory(new PropertyValueFactory<ApplicantTable, String>("city"));
        tblColAppliHe.setCellValueFactory(new PropertyValueFactory<ApplicantTable, String>("appliEduLvl"));
        tblColAppliDoB.setCellValueFactory(new PropertyValueFactory<ApplicantTable, String>("dob"));

        tblAllApplicnt.setItems(appcantData);

    }

    public void loadLeaveRequests(ActionEvent e) {
        hrController = new HrController();
        leaveReqData = hrController.getLeaveReqDataList();


        tblColEmpId.setCellValueFactory(new PropertyValueFactory<LeaveRequestTable, String>("empId"));
        tblColDayCount.setCellValueFactory(new PropertyValueFactory<LeaveRequestTable, String>("leaveDayCount"));
        tblColStrtDay.setCellValueFactory(new PropertyValueFactory<LeaveRequestTable, String>("startDate"));
        tblColReason.setCellValueFactory(new PropertyValueFactory<LeaveRequestTable, String>("reason"));

        tblLeaveReq.setItems(leaveReqData);

    }

    public void loadAllLeaves(ActionEvent e) {

        hrController = new HrController();
        leaveData = hrController.getLeaveDataList();


        tblColConfLvEmpid.setCellValueFactory(new PropertyValueFactory<ConfirmedLeavesTable, String>("employeeNo"));
        tblColConfLvLvDc.setCellValueFactory(new PropertyValueFactory<ConfirmedLeavesTable, String>("leaveDayCount"));
        tblColConfLvStrtDy.setCellValueFactory(new PropertyValueFactory<ConfirmedLeavesTable, String>("leaveStartingDate"));
        tblColConfLvResn.setCellValueFactory(new PropertyValueFactory<ConfirmedLeavesTable, String>("confirmedOfficer"));
        tblColConfLvCofOff.setCellValueFactory(new PropertyValueFactory<ConfirmedLeavesTable, String>("reason"));
        tblColConfLvRemLv.setCellValueFactory(new PropertyValueFactory<ConfirmedLeavesTable, String>("remainLeaves"));

        tblConfLv.setItems(leaveData);


    }
}
