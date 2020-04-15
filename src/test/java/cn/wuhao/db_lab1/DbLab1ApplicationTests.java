package cn.wuhao.db_lab1;

import cn.wuhao.db_lab1.dao.DepartmentDao;
import cn.wuhao.db_lab1.dao.TeacherDao;
import cn.wuhao.db_lab1.entities.Student;
import cn.wuhao.db_lab1.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.thymeleaf.expression.Ids;

import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class DbLab1ApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DepartmentDao departmentDao;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(departmentDao.getAll());
    }

}
