package forum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("userController")
@RequestMapping("/user")
public class UserOperateController {
    @RequestMapping("login")
    public String login() {
        return "这是登录接口";
    }
}
