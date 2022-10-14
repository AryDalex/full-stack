package dev.carlos.MongoDB._Springboot.controller;

import dev.carlos.MongoDB._Springboot.domain.Lock;
import dev.carlos.MongoDB._Springboot.models.requests.LockRequest;
import dev.carlos.MongoDB._Springboot.models.responses.LockResponse;
import dev.carlos.MongoDB._Springboot.services.LockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController(value = "/")

public class LockController {

    @Autowired
    private LockService lockService;

    @PostMapping
    public LockResponse saveLock(@RequestBody LockRequest lockRequest) {

        return lockService.saveLock(lockRequest);
    }

    @GetMapping("/{lockId}")
    public LockResponse getLock(@PathVariable String lockId) {
        return lockService.getLock(lockId);
    }

}
