package cn.wuhao.db_lab1.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostMapping("/login")
    public String login(@RequestParam("user") User user,
                        Map<String, Object> map) {
        System.out.println(user);
        return "dashboard";
    }
}
