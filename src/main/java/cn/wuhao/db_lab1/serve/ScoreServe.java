package cn.wuhao.db_lab1.serve;

import cn.wuhao.db_lab1.dao.ScoreDao;
import cn.wuhao.db_lab1.entities.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServe {

    @Autowired
    ScoreDao scoreDao;

    public List<Score> getAll() {
        List<Score> scores = scoreDao.getAll();
        return scores;
    }
}
