package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.domain.University;

public interface UniversityService {

	
	University save(University university);
	void deleteById(Long id);
	University findById(Long id);
	University update(University university);
	
	List<University> findAll();

	List<University> findByName(String name);
	University addUniversity(University university);


}
