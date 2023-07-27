package model;

public class ApplicantTable {

    private String appliNic;
    private String appliName;
    private String appliEduLvl;
    private String city;
    private String dob;
    private String age;

    public ApplicantTable(String appliNic, String appliName, String appliEduLvl, String city, String dob, String age) {
        this.appliNic = appliNic;
        this.appliName = appliName;
        this.appliEduLvl = appliEduLvl;
        this.city = city;
        this.dob = dob;
        this.age = age;
    }

    public ApplicantTable() {
    }

    public String getAppliNic() {
        return appliNic;
    }

    public void setAppliNic(String appliNic) {
        this.appliNic = appliNic;
    }

    public String getAppliName() {
        return appliName;
    }

    public void setAppliName(String appliName) {
        this.appliName = appliName;
    }

    public String getAppliEduLvl() {
        return appliEduLvl;
    }

    public void setAppliEduLvl(String appliEduLvl) {
        this.appliEduLvl = appliEduLvl;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
