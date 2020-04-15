package cn.wuhao.db_lab1.entities;

import java.sql.Timestamp;

public class Teacher {

    private int teachId;
    private String teachName;
    private Integer teachAge;
    private Timestamp teachBirth;
    private Integer teachSalary;
    private String departmentName;
    private String teachPhone;
    private String collegeName;
    private String gender;
    private int departmentId;

    public int getTeachId() {
        return teachId;
    }

    public void setTeachId(int teachId) {
        this.teachId = teachId;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }


    public Integer getTeachAge() {
        return teachAge;
    }

    public void setTeachAge(Integer teachAge) {
        this.teachAge = teachAge;
    }

    public Integer getTeachSalary() {
        return teachSalary;
    }

    public void setTeachSalary(Integer teachSalary) {
        this.teachSalary = teachSalary;
    }

    public Timestamp getTeachBirth() {
        return teachBirth;
    }

    public void setTeachBirth(Timestamp teachBirth) {
        this.teachBirth = teachBirth;
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getTeachPhone() {
        return teachPhone;
    }

    public void setTeachPhone(String teachPhone) {
        this.teachPhone = teachPhone;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teachId=" + teachId +
                ", teachName='" + teachName + '\'' +
                ", teachAge=" + teachAge +
                ", teachBirth=" + teachBirth +
                ", teachSalary=" + teachSalary +
                ", departmentName='" + departmentName + '\'' +
                ", teachPhone='" + teachPhone + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", gender='" + gender + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}
