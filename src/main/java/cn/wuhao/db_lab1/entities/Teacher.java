package cn.wuhao.db_lab1.entities;

import java.sql.Timestamp;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (getDepartmentId() != teacher.getDepartmentId()) return false;
        if (getTeachName() != null ? !getTeachName().equals(teacher.getTeachName()) : teacher.getTeachName() != null)
            return false;
        if (getTeachAge() != null ? !getTeachAge().equals(teacher.getTeachAge()) : teacher.getTeachAge() != null)
            return false;
        if (getTeachBirth() != null ? !getTeachBirth().equals(teacher.getTeachBirth()) : teacher.getTeachBirth() != null)
            return false;
        if (getTeachSalary() != null ? !getTeachSalary().equals(teacher.getTeachSalary()) : teacher.getTeachSalary() != null)
            return false;
        if (getTeachPhone() != null ? !getTeachPhone().equals(teacher.getTeachPhone()) : teacher.getTeachPhone() != null)
            return false;
        return getGender() != null ? getGender().equals(teacher.getGender()) : teacher.getGender() == null;
    }

    @Override
    public int hashCode() {
        int result = getTeachName() != null ? getTeachName().hashCode() : 0;
        result = 31 * result + (getTeachAge() != null ? getTeachAge().hashCode() : 0);
        result = 31 * result + (getTeachBirth() != null ? getTeachBirth().hashCode() : 0);
        result = 31 * result + (getTeachSalary() != null ? getTeachSalary().hashCode() : 0);
        result = 31 * result + (getTeachPhone() != null ? getTeachPhone().hashCode() : 0);
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        result = 31 * result + getDepartmentId();
        return result;
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
