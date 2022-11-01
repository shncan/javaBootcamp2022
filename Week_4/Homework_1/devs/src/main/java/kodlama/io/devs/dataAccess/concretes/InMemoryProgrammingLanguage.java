package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepository{

	
	List<ProgrammingLanguage> programmingLanguages;
	
	public InMemoryProgrammingLanguage() {
		//super();
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(2,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for(ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if(programmingLanguage.getId()==id) {
				return programmingLanguage;
			}
		}
			return null;
		
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
		
	}

	@Override
	public void delete(int id) {
	      
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if(programmingLanguage.getId()== id) {
				programmingLanguages.remove(programmingLanguage);
			}
		}
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		for (ProgrammingLanguage programmingLang : programmingLanguages) {
            if (programmingLang.getId() == programmingLanguage.getId()) {
                programmingLang.setId(programmingLanguage.getId());
                programmingLang.setProgramminLangName(programmingLanguage.getProgramminLangName());
               
            }
        }
	}

}
