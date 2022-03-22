package com.zak.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zak.core.model.Setting;

@Repository("settings")
public interface SettingRepo extends JpaRepository<Setting, Integer> {

	<S extends Setting> S save(S entity);
	
}
