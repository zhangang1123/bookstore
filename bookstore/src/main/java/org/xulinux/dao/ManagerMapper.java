package org.xulinux.dao;

import org.apache.ibatis.annotations.Param;
import org.xulinux.pojo.Manager;

/**
 * //TODO add interface commment here
 *
 * @Author wfh
 * @Date 2022/1/12 下午2:33
 */
public interface ManagerMapper {
    public int addManager(Manager manager);
    public int deleteManager(@Param("name") String name);
    public int updateManager(Manager manager);
    public Manager queryManager(@Param("name") String name);
}
