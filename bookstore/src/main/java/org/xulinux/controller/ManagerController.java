package org.xulinux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.xulinux.pojo.Manager;
import org.xulinux.service.ManagerService;
import org.xulinux.util.Util;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/1/12 下午2:51
 */
//@RestController //restController相当于responsebody 和 controller的集合
@RequestMapping("/managers")
@Controller
public class ManagerController {
    @Autowired
    private ManagerService managerService;

// delete post get update
    @RequestMapping(method = RequestMethod.POST)
    public String addManager(Manager manager) {
        System.out.println(manager);
        this.managerService.addManager(manager);
        System.out.println(Util.getGson().toJson(manager));
        return "redirect:index.jsp";
    }
}

//就是说web-inf下的东西在经过视图解析器处理后其实和web-inf外的在同一集
