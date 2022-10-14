package dev.arydalex.Application.controller;

import dev.arydalex.Application.modules.requests.LockRequest;
import dev.arydalex.Application.modules.responses.LockResponse;
import dev.arydalex.Application.services.implementation.LockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/")
public class LockController {

    @Autowired
    private LockServiceImpl lockService;

    @PostMapping
    public LockResponse saveLock(@RequestBody LockRequest lockRequest) {

        return lockService.saveLock(lockRequest);

    }

    @GetMapping("/{lockId}")
    public LockResponse getLock(@PathVariable String lockId) {

        return lockService.getLock(lockId);

    }

}
