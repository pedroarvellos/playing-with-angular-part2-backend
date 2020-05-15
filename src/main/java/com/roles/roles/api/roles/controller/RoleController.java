package com.roles.roles.api.roles.controller;

import com.roles.roles.api.roles.service.RoleService;
import com.roles.roles.persistence.entity.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public List<RoleEntity> getRoles() throws Exception {
        return roleService.getRoles();
    }

    @PostMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public RoleEntity postRole(@RequestBody RoleEntity role) throws Exception {
        return roleService.postRole(role);
    }

    @PutMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public RoleEntity putRole(@RequestBody RoleEntity role) throws Exception {
        return roleService.putRole(role);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Long deleteRole(@PathVariable Long id) throws Exception {
        return roleService.deleteRole(id);
    }
}
