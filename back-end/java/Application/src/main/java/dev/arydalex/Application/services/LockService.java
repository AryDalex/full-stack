package dev.arydalex.Application.services;

import dev.arydalex.Application.modules.requests.LockRequest;
import dev.arydalex.Application.modules.responses.LockResponse;

public interface LockService {

    LockResponse SaveLock(LockRequest lockRequest);

    LockResponse getLock(String lockId);

}
