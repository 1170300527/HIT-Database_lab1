package cn.wuhao.db_lab1;

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

    @Test
    void contextLoads() throws SQLException {
        List<Student> students = jdbcTemplate.query("select * from student where stuId = ?",
                new BeanPropertyRowMapper<Student>(Student.class), 1);
        System.out.println(students);
    }

}
