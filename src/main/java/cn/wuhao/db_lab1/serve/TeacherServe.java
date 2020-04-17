package cn.wuhao.db_lab1.serve;

import cn.wuhao.db_lab1.dao.TeacherDao;
import cn.wuhao.db_lab1.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServe {

    @Autowired
    TeacherDao teacherDao;

    public List<Teacher> getAll() {
        List<Teacher> teachers = teacherDao.getAll();
        return teachers;
    }

    public void add(Teacher teacher) {
        teacherDao.add(teacher);
    }

    public Teacher findById(int id) {
        Teacher teacher = teacherDao.findById(id);
        return (teacher);
    }

    public void update(Teacher teacher) {
        teacherDao.update(teacher);
    }

    public void delete(int id) {
        teacherDao.delete(id);
    }
}
