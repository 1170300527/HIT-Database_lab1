package cn.wuhao.db_lab1.dao;

import cn.wuhao.db_lab1.entities.StuScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StuScoreDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<StuScore> getAll() {
        List<StuScore> stuScores = jdbcTemplate.query("SELECT stuId, stuName, classId, departmentName," +
                " collegeName,  AVG(score)  AS score FROM score NATURAL JOIN student NATURAL JOIN class NATURAL JOIN" +
                " department  NATURAL JOIN college GROUP BY stuId ORDER BY AVG(score) DESC",
                new BeanPropertyRowMapper<StuScore>(StuScore.class));
        return stuScores;
    }
}
