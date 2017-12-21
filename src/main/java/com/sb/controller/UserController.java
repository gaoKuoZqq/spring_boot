package com.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sb.entity.User;
import com.sb.service.IUserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private IUserService userService;
	
    @RequestMapping(value = "/index")
    public String index(){
        return "user/index";
    }

    @RequestMapping(value = "/show")
    @ResponseBody
    public String show(@RequestParam(value = "name")String name){
        User user = userService.findUserByName(name);
        if(null != user)
            return user.getId()+"/"+user.getName()+"/"+user.getPassword();
        else return "null";
    }
    
    @RequestMapping(value = "/query")
    @ResponseBody
    public User query() {
    	//return "45644";
		return userService.query();
	}
    
    @RequestMapping(value = "/testThymeleaf")
    public ModelAndView testThymeleaf() {
		User user = new User();
		user.setId(23);
		user.setName("小明");
		ModelAndView modelAndView = new ModelAndView("user/index2");
		modelAndView.addObject("user",user);
		return modelAndView;
    }
		
    @RequestMapping(value = "/queryBy")
    @ResponseBody
    public User query(Integer id,String name) {
		return userService.queryBy(id,name);
	}
}
