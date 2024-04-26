package com.dailycodework.demo.service;

import com.dailycodework.demo.model.Role;
import com.dailycodework.demo.model.User;

import java.util.List;

public interface IRoleService {

    List<Role> getRoles();

    Role createRole(Role theRole);

    void deleteRole(Long id);

    Role findByName(String Name);

    User removeUserFromRole(Long userId, Long roleId);

    User assignRoleToUser(Long userId, Long roleId);

    Role removeAllUsersFromRole(Long roleId);
}
