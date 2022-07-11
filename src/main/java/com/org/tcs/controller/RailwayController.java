package com.org.tcs.controller;

import com.org.tcs.model.Railway;
import com.org.tcs.service.RailwayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RailwayController {
    @Autowired
    RailwayService railwayService;

    // CRUD
    @PostMapping("/create")
    public void createRailway(@RequestBody Railway railway){
        railwayService.createRailway(railway);
    }

    @PatchMapping("/updateExpBasedOnId/{id}/{exp} ")
    public String updateExpBasedOnId(@PathVariable Integer id,@PathVariable double exp){
        String ss=   railwayService.updateExpBasedOnId(id,exp);
        return ss;
    }

    @GetMapping("/getAll")
    public List<Railway> getAll(){
        List<Railway> rr=   railwayService.getAll();
        return rr;
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
     String ee=   railwayService.deleteById(id);
     return ee;
    }

}

