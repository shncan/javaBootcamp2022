package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@RestController //annotation
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		//super();
		this.programmingLanguageService = programmingLanguageService;
	}
	
	
	@GetMapping("/getAll")
	public List<ProgrammingLanguage> getAll(){
		return programmingLanguageService.getAll();
	}
	
	@GetMapping("/get")
    public ProgrammingLanguage get(int id){
        return programmingLanguageService.getById(id);
    }
	

    @PostMapping("/add")
    public void add(ProgrammingLanguage programmingLanguage){
    	programmingLanguageService.add(programmingLanguage);
    }

    @DeleteMapping("/delete")
    public void delete(int id){
    	programmingLanguageService.delete(id);
    }

    @PutMapping("/update")
    public void update(ProgrammingLanguage programmingLanguage){
    	programmingLanguageService.update(programmingLanguage);
    }

    
	
	
}
