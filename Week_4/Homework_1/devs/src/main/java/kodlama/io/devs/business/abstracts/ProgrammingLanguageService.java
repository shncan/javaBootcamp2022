package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	
	List<ProgrammingLanguage> getAll();

	ProgrammingLanguage getById(int id);

	void add(ProgrammingLanguage programmingLanguage);
	
	void delete(int id);

	void update(ProgrammingLanguage programmingLanguage);

	
} 
