package cn.wuhao.db_lab1.entities;

public class Elective {

    private int stuId;
    private String stuName;
    private int classId;
    private String departmentName;
    private String collegeName;
    private int stuAge;
    private String stuPhone;

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

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    @Override
    public String toString() {
        return "Elective{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", classId=" + classId +
                ", departmentName='" + departmentName + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", stuAge=" + stuAge +
                ", stuPhone='" + stuPhone + '\'' +
                '}';
    }
}
