package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;


@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		//super();
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguageRepository.getById(id);
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		if(programmingLanguage.getProgramminLangName().isEmpty()) {
			
			for (ProgrammingLanguage programmingLang : programmingLanguageRepository.getAll()){
	            if (programmingLang.getProgramminLangName() == programmingLanguage.getProgramminLangName()){
	                throw new RuntimeException("Eklemeye çalıştığınız programlama dili zaten bulunmaktadır!!");
	            }
	        }
			programmingLanguageRepository.add(programmingLanguage);
		}
		
	}

	@Override
	public void delete(int id) {
		programmingLanguageRepository.delete(id);
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		if (!programmingLanguage.getProgramminLangName().equals("")) {
			programmingLanguageRepository.update(programmingLanguage);
		} else {
			System.out.println("Programlama dili giriniz!!!!");
		}
		
	}

}
