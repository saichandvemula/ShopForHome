package com.saichand.shopforhome.service;

import com.saichand.shopforhome.dao.RoleDao;
import com.saichand.shopforhome.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
