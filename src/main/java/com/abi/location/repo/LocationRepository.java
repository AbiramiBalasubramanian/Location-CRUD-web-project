package com.abi.location.repo;

import com.abi.location.entities.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends JpaRepository<Location,Integer> {
	

}
