package com.zh.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zh.entity.User;
import com.zh.service.UserService;
import com.zh.utils.spring.SpringContext;

@Controller
@RequestMapping("/ssh")
public class ContrUser {

	@Autowired
    private UserService userService;
    
    //新增操作
    @RequestMapping(value="/doAdd.do")
    public String saveUser(User user){
    	UserService userServiceNew = (UserService)SpringContext.getBean("userService");
    	userServiceNew.save(user);
        return "saveSucess";
    }
    
	//根据id查询
    @RequestMapping(value="/get")
    public String findUser(int id, Model model){
    	User user= userService.find(id);
    	model.addAttribute("user", user);
    	return "findUser";
    }
    
    //查询所有，这里暂时不做分页
    @RequestMapping(value="/findAllUser")
    public String findAllUser(Model model){
    	List<User> list = userService.getAll();
    	model.addAttribute("list", list);
    	return "query";
    }
    
    //跳转新增页面
    @RequestMapping("/add.do")
    public String add(){
    	return "add";
    }
    
    //根据id删除
    @RequestMapping(value="/del")
    public String delUser(int id,Model model){
    	System.out.println("shifou");
    	userService.del(id);
    	System.out.println("shifou"+id);
    	List<User> list = userService.getAll();
    	model.addAttribute("list", list);
    	return "query";
    }

	//更新操作
    @RequestMapping(value="/updateUser")
    public String updateUser(User user,Model model){
		User user2 = userService.update(user);
    	model.addAttribute("user", user2);
    	return "findUser";
    }
}