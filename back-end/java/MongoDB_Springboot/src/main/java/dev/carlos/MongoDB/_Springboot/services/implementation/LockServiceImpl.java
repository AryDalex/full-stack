package dev.carlos.MongoDB._Springboot.services.implementation;

import dev.carlos.MongoDB._Springboot.domain.Lock;
import dev.carlos.MongoDB._Springboot.domain.LockRepository;
import dev.carlos.MongoDB._Springboot.models.requests.LockRequest;
import dev.carlos.MongoDB._Springboot.models.responses.LockResponse;
import dev.carlos.MongoDB._Springboot.services.LockService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LockServiceImpl implements LockService {

    @Autowired
    private LockRepository lockRepository;

    @Override
    public LockResponse saveLock(LockRequest lockRequest) {

        ModelMapper modelMapper = new ModelMapper();

        Lock lock = modelMapper.map(lockRequest, Lock.class);

        lock.setLockId(UUID.randomUUID().toString());

        Lock lockSaved = lockRepository.save(lock);

        return modelMapper.map(lockSaved, LockResponse.class);

    }

    @Override
    public LockResponse getLock(String lockId) {

        ModelMapper modelMapper = new ModelMapper();
        Lock lock = lockRepository.findByLockId(lockId);

        return modelMapper.map(lock, LockResponse.class);
    }

}

