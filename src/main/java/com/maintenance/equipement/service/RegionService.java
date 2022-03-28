package com.maintenance.equipement.service;

import java.util.List;
import java.util.Optional;

import com.maintenance.equipement.model.Region;

public interface RegionService {

	Optional<Region> findOne(Long id);
	List<Region> findAll();
	void save (Region region);
	void update(Region region);
	void delete(Long id);
	void delete(Region region);
}
