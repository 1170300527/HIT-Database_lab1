package cn.wuhao.db_lab1.dao;

import cn.wuhao.db_lab1.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Teacher> getAll() {
        List<Teacher> teachers = jdbcTemplate.query("SELECT teachId, teachName, collegeName," +
                        " departmentName, teachSalary, teachAge, teachBirth, teachPhone, gender FROM teacher" +
                        " NATURAL JOIN department NATURAL JOIN college;",
                new BeanPropertyRowMapper<Teacher>(Teacher.class));
        return teachers;
    }

    public void add(Teacher teacher) {
        jdbcTemplate.update("insert into teacher(teachName, teachAge, teachBirth, teachSalary, departmentId," +
                        " teachPhone, gender) values (?,?,?,?,?,?,?)",teacher.getTeachName(), teacher.getTeachAge(),
                teacher.getTeachBirth(), teacher.getTeachSalary(), teacher.getDepartmentId(), teacher.getTeachPhone(),
                teacher.getGender());
    }

    public Teacher findById(int id) {
        List<Teacher> teachers = jdbcTemplate.query("select * from teacher where teachId = ?",
                new BeanPropertyRowMapper<Teacher>(Teacher.class), id);
        return (teachers.get(0));
    }

    public void update(Teacher teacher) {
        jdbcTemplate.update("update teacher set teachName=?, teachAge=?, teachBirth=?, teachSalary=?, departmentId=?," +
                        " teachPhone=?, gender=?  where teachId=?", teacher.getTeachName(), teacher.getTeachAge(),
                teacher.getTeachBirth(), teacher.getTeachSalary(), teacher.getDepartmentId(), teacher.getTeachPhone(),
                teacher.getGender(), teacher.getTeachId());
    }

    public void delete(int id) {
        jdbcTemplate.update("delete from teacher where teachId=?", id);
    }
}
