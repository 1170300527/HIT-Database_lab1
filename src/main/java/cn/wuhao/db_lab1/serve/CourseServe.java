package cn.wuhao.db_lab1.serve;

import cn.wuhao.db_lab1.dao.CourseDao;
import cn.wuhao.db_lab1.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServe {

    @Autowired
    CourseDao courseDao;

    public List<Course> getAll() {
        List<Course> courses = courseDao.getAll();
        return courses;
    }
}
