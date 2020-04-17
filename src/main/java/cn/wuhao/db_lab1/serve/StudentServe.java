package cn.wuhao.db_lab1.serve;

import cn.wuhao.db_lab1.dao.StudentDao;
import cn.wuhao.db_lab1.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServe {

    @Autowired
    StudentDao studentDao;

    public List<Student> getAll() {
        List<Student> students = studentDao.getAll();
        return students;
    }

    public void add(Student student) {
        studentDao.add(student);
    }

    public Student findById(int id) {
        Student student = studentDao.findById(id);
        return student;
    }

    public void update(Student student) {
        studentDao.update(student);
    }

    public void delete(int id) {
        studentDao.delete(id);
    }
}
