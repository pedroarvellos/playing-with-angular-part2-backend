package com.roles.roles.controller;

import com.roles.roles.persistence.entity.RoleEntity;
import com.roles.roles.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public List<RoleEntity> getRoles() throws Exception {
        return roleService.getRoles();
    }

    @PostMapping
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public RoleEntity postRole(@RequestBody RoleEntity role) throws Exception {
        return roleService.postRole(role);
    }

    @PutMapping
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public RoleEntity putRole(@RequestBody RoleEntity role) throws Exception {
        return roleService.putRole(role);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public Long deleteRole(@PathVariable Long id) throws Exception {
        return roleService.deleteRole(id);
    }
}
