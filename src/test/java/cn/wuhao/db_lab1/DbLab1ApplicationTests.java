package cn.wuhao.db_lab1;

import cn.wuhao.db_lab1.dao.DepartmentDao;
import cn.wuhao.db_lab1.dao.ScoreDao;
import cn.wuhao.db_lab1.dao.TeacherDao;
import cn.wuhao.db_lab1.entities.Student;
import cn.wuhao.db_lab1.entities.Teacher;
import cn.wuhao.db_lab1.entities.User;
import cn.wuhao.db_lab1.serve.StuScoreServe;
import cn.wuhao.db_lab1.serve.StudentServe;
import cn.wuhao.db_lab1.serve.TeacherServe;
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
    StudentServe studentServe;

    @Test
    void contextLoads() throws SQLException {
        List<Student> students = studentServe.getAll();
        Student student = studentServe.findById(9);
        System.out.println(student);
        System.out.println(students.get(8));
        System.out.println(students.get(8).equals(student));
    }

}
