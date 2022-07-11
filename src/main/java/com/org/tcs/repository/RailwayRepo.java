package com.org.tcs.repository;

import com.org.tcs.model.Railway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RailwayRepo extends JpaRepository<Railway,Integer> {
}
