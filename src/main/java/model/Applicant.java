package model;

import java.time.LocalDate;
import java.time.Period;

public class Applicant {


   private String name;
    private  String nic;

    //higher
    private String educationQualification;
    private String city;
    private String dob;//1998-12-9
    private int age;

    public Applicant() {
    }

    public Applicant(String name, String nic, String educationQualification, String city, String dob) {
        this.name = name;
        this.nic = nic;
        this.educationQualification = educationQualification;
        this.city = city;
        this.dob = dob;
        LocalDate birthDate = LocalDate.parse(this.dob);
        LocalDate currentDate = LocalDate.now();
        this.age = Period.between(birthDate, currentDate).getYears();


    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getEducationQualification() {
        return educationQualification;
    }

    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
