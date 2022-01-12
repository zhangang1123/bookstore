package org.xulinux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xulinux.dao.ManagerMapper;
import org.xulinux.pojo.Manager;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/1/12 下午2:45
 */
@Service
public class ManagerServiceImpl implements ManagerService{
    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public int addManager(Manager manager) {
        return managerMapper.addManager(manager);
    }

    @Override
    public int deleteManager(String name) {
        return managerMapper.deleteManager(name);
    }

    @Override
    public int updateManager(Manager manager) {
        return managerMapper.updateManager(manager);
    }

    @Override
    public String getPassword(String name) {
        return managerMapper.queryManager(name).getPassword();
    }
}
