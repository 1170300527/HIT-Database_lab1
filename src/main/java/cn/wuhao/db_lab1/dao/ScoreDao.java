package cn.wuhao.db_lab1.dao;

import cn.wuhao.db_lab1.entities.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScoreDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Score> getAll() {
        List<Score> scores = jdbcTemplate.query("SELECT stuId, stuName, teachName, courseName, score, buildingName," +
                        " campus, credit FROM score NATURAL JOIN student NATURAL JOIN lecture INNER JOIN teacher ON" +
                        " lecture.teachId = teacher.teachId NATURAL JOIN course NATURAL JOIN room NATURAL JOIN" +
                        "  building ", new BeanPropertyRowMapper<Score>(Score.class));
        return scores;
    }
}
