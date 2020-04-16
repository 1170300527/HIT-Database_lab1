package cn.wuhao.db_lab1.entities;

public class Score {

    private int stuId;
    private String stuName;
    private String teachName;
    private String courseName;
    private int score;
    private String buildingName;
    private String campus;
    private int credit;

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

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Score{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", teachName='" + teachName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", score=" + score +
                ", buildingName='" + buildingName + '\'' +
                ", campus='" + campus + '\'' +
                ", credit=" + credit +
                '}';
    }
}
