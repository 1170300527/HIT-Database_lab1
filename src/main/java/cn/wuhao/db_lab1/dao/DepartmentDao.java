package cn.wuhao.db_lab1.dao;

import cn.wuhao.db_lab1.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Department> getAll() {
        List<Department> departments = jdbcTemplate.query("select departmentId, departmentName, collegeName from " +
                "department natural join college", new BeanPropertyRowMapper<Department>(Department.class));
        return departments;
    }
}
