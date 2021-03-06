package cn.wuhao.db_lab1.entities;

import java.sql.Timestamp;

public class Student {

    private int stuId;
    private String stuName;
    private int classId;
    private String gender;
    private Integer stuAge;
    private String stuPhone;
    private Timestamp enterTime;
    private int grade;
    private String collegeName;
    private String departmentName;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public Timestamp getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Timestamp enterTime) {
        this.enterTime = enterTime;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getClassId() != student.getClassId()) return false;
        if (getStuName() != null ? !getStuName().equals(student.getStuName()) : student.getStuName() != null)
            return false;
        if (getGender() != null ? !getGender().equals(student.getGender()) : student.getGender() != null) return false;
        if (getStuAge() != null ? !getStuAge().equals(student.getStuAge()) : student.getStuAge() != null) return false;
        if (getStuPhone() != null ? !getStuPhone().equals(student.getStuPhone()) : student.getStuPhone() != null)
            return false;
        return getEnterTime() != null ? getEnterTime().equals(student.getEnterTime()) : student.getEnterTime() == null;
    }

    @Override
    public int hashCode() {
        int result = getStuName() != null ? getStuName().hashCode() : 0;
        result = 31 * result + getClassId();
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        result = 31 * result + (getStuAge() != null ? getStuAge().hashCode() : 0);
        result = 31 * result + (getStuPhone() != null ? getStuPhone().hashCode() : 0);
        result = 31 * result + (getEnterTime() != null ? getEnterTime().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", classId=" + classId +
                ", gender='" + gender + '\'' +
                ", sutAge=" + stuAge +
                ", sutPhone='" + stuPhone + '\'' +
                ", enterTime=" + enterTime +
                ", grade=" + grade +
                ", collegeName='" + collegeName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
