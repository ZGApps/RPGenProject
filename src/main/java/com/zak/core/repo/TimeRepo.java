package com.zak.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zak.core.model.TimeData;

@Repository("times")
public interface TimeRepo extends JpaRepository<TimeData, Integer>{

	<S extends TimeData> S save(S entity);
	
}
