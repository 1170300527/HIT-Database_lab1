package cn.wuhao.db_lab1.entities;

public class Class {

    private int classId;
    private String departmentName;
    private String collegeName;
    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classId=" + classId +
                ", departmentName='" + departmentName + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
