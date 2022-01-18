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
@ResponseBody
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @RequestMapping(method = RequestMethod.POST)
    public String isPasswordRight(@RequestParam("name") String name,@RequestParam("password") String password) {
        return Util.getGson().toJson(this.managerService.getPassword(name).equals(password));
    }

    @RequestMapping(value ="/managers/sys",method = RequestMethod.POST)
    public String isSysPasswordRight(@RequestParam("password") String password) {
        return Util.getGson().toJson(this.managerService.getPassword("系统密码").equals(password));
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String addManager(@RequestParam("name") String name,@RequestParam("password") String password) {
        if (this.managerService.getPassword(name) == null) {
            return Util.getGson().toJson(false);
        }

        Manager manager = new Manager();
        manager.setPassword(password);
        manager.setName(name);

        this.managerService.addManager(manager);

        return Util.getGson().toJson(true);
    }


}

//就是说web-inf下的东西在经过视图解析器处理后其实和web-inf外的在同一集
