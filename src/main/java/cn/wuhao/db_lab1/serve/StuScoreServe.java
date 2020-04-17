package cn.wuhao.db_lab1.serve;

import cn.wuhao.db_lab1.dao.StuScoreDao;
import cn.wuhao.db_lab1.entities.StuScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuScoreServe {

    @Autowired
    StuScoreDao stuScoreDao;

    public List<StuScore> getAll() {
        List<StuScore> stuScores = stuScoreDao.getAll();
        return stuScores;
    }
}
