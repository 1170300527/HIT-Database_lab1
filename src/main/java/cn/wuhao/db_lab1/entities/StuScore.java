package cn.wuhao.db_lab1.entities;

public class StuScore {

    private int stuId;
    private String stuName;
    private int classId;
    private String departmentName;
    private String collegeName;
    private double score;

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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StuScore{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", classId=" + classId +
                ", departmentName='" + departmentName + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", score=" + score +
                '}';
    }
}
