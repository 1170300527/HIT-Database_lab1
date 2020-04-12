package cn.wuhao.db_lab1.serve;

import cn.wuhao.db_lab1.dao.ClassDao;
import cn.wuhao.db_lab1.entities.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServe {

    @Autowired
    ClassDao classDao;

    public List<Class> getAll() {
        List<Class> classes = classDao.getAll();
        return classes;
    }
}
