package com.zak.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zak.core.model.Complication;

@Repository("complications")
public interface ComplicationRepo extends JpaRepository<Complication, Integer> {
	
	<S extends Complication> S save(S entity);
	
}
