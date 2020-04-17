package cn.wuhao.db_lab1.serve;

import cn.wuhao.db_lab1.dao.DepartmentDao;
import cn.wuhao.db_lab1.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServe {

    @Autowired
    DepartmentDao departmentDao;

    public List<Department> getAll() {
        List<Department> departments = departmentDao.getAll();
        return departments;
    }
}
