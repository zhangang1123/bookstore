package org.xulinux.dao;

import org.apache.ibatis.annotations.Param;
import org.xulinux.pojo.Tag;

import java.util.List;

/**
 * //TODO add interface commment here
 *
 * @Author wfh
 * @Date 2022/1/12 下午2:34
 */
public interface TagMapper {
    public int addTag(Tag tag);
    public int updateTag(Tag tag);
    public int deteteTag(int id);
    public List<Tag> queryTag();

}
