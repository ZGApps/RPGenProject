package com.zak.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zak.core.model.CharacterData;

@Repository("characters")
public interface CharacterRepo extends JpaRepository<CharacterData, Integer> {

	<S extends CharacterData> S save(S entity);
}
