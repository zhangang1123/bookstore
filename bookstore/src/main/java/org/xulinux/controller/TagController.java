package org.xulinux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.xulinux.pojo.Tag;
import org.xulinux.service.TagService;
import org.xulinux.util.Util;

import java.util.List;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/1/13 下午6:56
 */
@RestController
@RequestMapping("/tags")
public class TagController {

    @Autowired
    private TagService tagService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllTag() {
        List<Tag> tags = this.tagService.getAllTag();
        return Util.getGson().toJson(tags);
    }



}
