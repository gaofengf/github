package com.controller;

import com.entity.UserBean;
import com.service.UserService;
import com.utils.ResultInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/getLogin")
    public ResultInfo getLogin(@RequestBody UserBean user){
        UserBean userBean=userService.getlogin(user);
        if(userBean!=null){
            return new ResultInfo(true, "登录成功");
       }else{
            return new ResultInfo(false, "登录失败");
        }
    }
    @RequestMapping("/findAll")
    public List<UserBean> findAll(){
        return userService.findAll();
    }
}
