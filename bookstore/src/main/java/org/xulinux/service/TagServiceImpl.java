package org.xulinux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xulinux.dao.TagMapper;
import org.xulinux.pojo.Tag;

import java.util.List;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/1/13 下午3:46
 */
@Service
public class TagServiceImpl implements TagService{

    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<Tag> getAllTag() {
        return this.tagMapper.queryTag();
    }

    public void setTagMapper(TagMapper tagMapper) {
        this.tagMapper = tagMapper;
    }
}
