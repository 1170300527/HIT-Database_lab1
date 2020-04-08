package cn.wuhao.db_lab1.controller;

import cn.wuhao.db_lab1.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class LoginAndSignOutController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map, HttpSession session) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        List<User> users = jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
        if (users.contains(user)) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }
        else {
            map.put("msg", "用户名或密码错误");
            return "index";
        }
    }

    @RequestMapping("/signOut")
    public String signOut(HttpSession session) {
        session.removeAttribute("loginUser");
        return "index";
    }
}
