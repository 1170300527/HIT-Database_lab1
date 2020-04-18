package cn.wuhao.db_lab1.dao;


import cn.wuhao.db_lab1.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Student> getAll() {
        List<Student> students = jdbcTemplate.query("SELECT * FROM stuInfo;",
                new BeanPropertyRowMapper<Student>(Student.class));
        return students;
    }

    public void add(Student student) {
        jdbcTemplate.update("insert into student(stuName, classId, gender, stuAge, stuPhone, entertime)" +
                " values (?,?,?,?,?,?)",student.getStuName(), student.getClassId(), student.getGender(),
                student.getStuAge(), student.getStuPhone(), student.getEnterTime());
    }

    public Student findById(int id) {
        List<Student> students = jdbcTemplate.query("select * from student where stuId = ?",
                new BeanPropertyRowMapper<Student>(Student.class), id);
        return (students.get(0));
    }

    public void update(Student student) {
        jdbcTemplate.update("update student set stuName=?, classId=?, gender=?, stuAge=?, stuPhone=?, entertime=?" +
                " where stuId=?", student.getStuName(), student.getClassId(), student.getGender(), student.getStuAge(),
                student.getStuPhone(), student.getEnterTime(), student.getStuId());
    }

    public void delete(int id) {
        jdbcTemplate.update("delete from student where stuId=?", id);
    }
}
