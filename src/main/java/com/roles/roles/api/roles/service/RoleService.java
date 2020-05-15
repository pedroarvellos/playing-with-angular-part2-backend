package com.roles.roles.api.roles.service;

import com.roles.roles.api.roles.exception.RoleNotFoundException;
import com.roles.roles.exception.ErrorCodes;
import com.roles.roles.persistence.entity.LogEntity;
import com.roles.roles.persistence.entity.RoleEntity;
import com.roles.roles.persistence.repository.LogRepository;
import com.roles.roles.persistence.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    private final RoleRepository roleRepository;
    private final LogRepository logRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository, LogRepository logRepository) {
        this.roleRepository = roleRepository;
        this.logRepository = logRepository;
    }

    public List<RoleEntity> getRoles() throws Exception {
        try {
            List<RoleEntity> rolesList = roleRepository.findAll();
            logRepository.save(new LogEntity("Roles fetched."));
            return rolesList;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public RoleEntity postRole(RoleEntity role) throws Exception {
        try {
            RoleEntity pRole = roleRepository.save(role);
            logRepository.save(new LogEntity("Role with name " + role.getName() + " and id " + role.getId() +" created."));
            return pRole;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public RoleEntity putRole(RoleEntity role) throws Exception {
        try {
            RoleEntity pRole = roleRepository.save(role);
            logRepository.save(new LogEntity("Role with name " + role.getName() + " and id " + role.getId() +" updated."));
            return pRole;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Long deleteRole(Long id) throws Exception {
        roleRepository.findById(id).orElseThrow(() -> new RoleNotFoundException(ErrorCodes.ROLE_DOES_NOT_EXIST));

        try {
            roleRepository.deleteById(id);
            logRepository.save(new LogEntity("Role with id " + id + " deleted."));
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

        return id;
    }
}
