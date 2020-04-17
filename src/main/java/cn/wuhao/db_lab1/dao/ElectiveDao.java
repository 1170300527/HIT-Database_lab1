package cn.wuhao.db_lab1.dao;


import cn.wuhao.db_lab1.entities.Elective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ElectiveDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Elective> getElective(Integer id) {
        List<Elective> electives = jdbcTemplate.query("SELECT stuId, stuName, classId, departmentName," +
                " collegeName,stuAge, stuPhone FROM student  NATURAL JOIN class  NATURAL JOIN department" +
                "  NATURAL JOIN college WHERE stuId in (SELECT stuId FROM score NATURAL JOIN lecture" +
                " NATURAL JOIN course WHERE courseId = ?)", new BeanPropertyRowMapper<Elective>(Elective.class), id);
        return electives;
    }
}
