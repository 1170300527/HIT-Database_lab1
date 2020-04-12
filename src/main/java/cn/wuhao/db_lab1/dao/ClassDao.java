package cn.wuhao.db_lab1.dao;

import cn.wuhao.db_lab1.entities.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClassDao {


    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Class> getAll() {
        List<Class> classes = jdbcTemplate.query("SELECT classId, departmentname, collegeName, grade" +
                " FROM class NATURAL JOIN department, college", new BeanPropertyRowMapper<Class>(Class.class));
        return classes;
    }
}
