package com.roles.roles.service;

import com.roles.roles.persistence.entity.RoleEntity;
import com.roles.roles.persistence.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<RoleEntity> getRoles() throws Exception {
        try {
            return roleRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public RoleEntity postRole(RoleEntity role) throws Exception {
        try {
            return roleRepository.save(role);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public RoleEntity putRole(RoleEntity role) throws Exception {
        try {
            return roleRepository.save(role);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Long deleteRole(Long id) throws Exception {
        try {
            roleRepository.deleteById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

        return id;
    }
}
