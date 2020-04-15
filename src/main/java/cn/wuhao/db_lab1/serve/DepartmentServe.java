package cn.wuhao.db_lab1.serve;

import cn.wuhao.db_lab1.dao.DepartmentDao;
import cn.wuhao.db_lab1.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
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
