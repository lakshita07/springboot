package com.day7_ex3.day7_ex3.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.day7_ex3.day7_ex3.model.Door;
import com.day7_ex3.day7_ex3.repository.DoorRepo;

@Service
public class DoorService {
    public DoorRepo doorRepo;

    public DoorService(DoorRepo doorRepo) {
        this.doorRepo = doorRepo;
    }
    public Door postDetail(Door door)
    {
       return doorRepo.save(door);
    }
    public List<Door> getAll()
    {
        return doorRepo.findAll();
    }
    public List<Door> getByAccessType(String accessType)
    {
        return doorRepo.findByAccessType(accessType);
    }
    public Door getByDoorId(int doorId)
    {
        return doorRepo.findById(doorId).orElse(null);
    }
}