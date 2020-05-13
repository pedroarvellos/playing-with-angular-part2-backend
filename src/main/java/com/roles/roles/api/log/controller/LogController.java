package com.roles.roles.api.log.controller;

import com.roles.roles.api.log.service.LogService;
import com.roles.roles.persistence.entity.LogEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logs")
public class LogController {
    private final LogService logService;

    @Autowired
    public LogController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public List<LogEntity> getLogs() throws Exception {
        return logService.getLogs();
    }
}
