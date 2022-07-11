package com.org.tcs.service;

import com.org.tcs.model.Railway;
import com.org.tcs.repository.RailwayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RailwayServiceImpl implements RailwayService{
    @Autowired
    RailwayRepo railwayRepo;

    @Override
    public void createRailway(Railway railway) {
        railwayRepo.save(railway);
    }

    @Override
    public String updateExpBasedOnId(Integer id, double exp) {
       Optional<Railway> rr= railwayRepo.findById(id);
        Railway rrr =  rr.get();
        rrr.setExp(exp);
        railwayRepo.save(rrr);
        return "successfully changed";
    }

    @Override
    public List<Railway> getAll() {
        List<Railway> ee=   railwayRepo.findAll();
        return ee;
    }

    @Override
    public String deleteById(Integer id) {
        railwayRepo.deleteById(id);
       return "success";
    }
}
