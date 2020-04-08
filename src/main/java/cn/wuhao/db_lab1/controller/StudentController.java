package cn.wuhao.db_lab1.controller;

import cn.wuhao.db_lab1.dao.StudentDao;
import cn.wuhao.db_lab1.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    StudentDao studentDao;

    @GetMapping("/stus")
    public String stuList(Map<String, List<Student>> map) {
        List<Student> students = studentDao.getAll();
        map.put("students", students);
        return "list";
    }

}
