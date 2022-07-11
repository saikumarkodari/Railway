package com.org.tcs.service;

import com.org.tcs.model.Railway;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RailwayService {
    public void createRailway( Railway railway);

    public String updateExpBasedOnId( Integer id,  double exp);
    public List<Railway> getAll();
    public String deleteById( Integer id);

}
