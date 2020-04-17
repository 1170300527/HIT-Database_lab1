package cn.wuhao.db_lab1.dao;

import cn.wuhao.db_lab1.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Course> getAll() {
        List<Course> courses = jdbcTemplate.query("select * from course", new BeanPropertyRowMapper<Course>(Course.class));
        return courses;
    }
}
