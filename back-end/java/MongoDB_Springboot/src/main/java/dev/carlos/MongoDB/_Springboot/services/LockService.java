package dev.carlos.MongoDB._Springboot.services;

import dev.carlos.MongoDB._Springboot.domain.Lock;
import dev.carlos.MongoDB._Springboot.models.requests.LockRequest;
import dev.carlos.MongoDB._Springboot.models.responses.LockResponse;

public interface LockService {

    LockResponse saveLock(LockRequest lockRequest);

    LockResponse getLock(String lockId);
}
