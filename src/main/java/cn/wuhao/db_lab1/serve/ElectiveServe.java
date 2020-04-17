package cn.wuhao.db_lab1.serve;


import cn.wuhao.db_lab1.dao.ElectiveDao;
import cn.wuhao.db_lab1.entities.Elective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectiveServe {

    @Autowired
    ElectiveDao electiveDao;

    public List<Elective> getElective(Integer id) {
        List<Elective> electives = electiveDao.getElective(id);
        return electives;
    }
}
