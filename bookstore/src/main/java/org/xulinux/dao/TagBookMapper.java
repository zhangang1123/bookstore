package org.xulinux.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * //TODO add interface commment here
 *
 * @Author wfh
 * @Date 2022/1/13 下午10:58
 */
public interface TagBookMapper {
    public int createRelation(@Param("bookId") int bookId,@Param("tagsId") List<Integer> tagsId);
    public int destroyRelation(@Param("bookId") int bookId,@Param("tagId") int tagId);
}
