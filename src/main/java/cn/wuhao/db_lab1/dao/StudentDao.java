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
        List<Student> students = jdbcTemplate.query("SELECT stuId, stuName, classId, collegeName, departmentname," +
                        " gender,stuAge, entertime, grade, stuAge, stuPhone FROM student NATURAL JOIN class,department,college;",
                new BeanPropertyRowMapper<Student>(Student.class));
        return students;
    }
}
