package kodlama.io.devs.entities.concretes;

public class ProgrammingLanguage {
	private int id;
	private String programmingLangName;
	
	
	public ProgrammingLanguage() {
		//super();
	}


	public ProgrammingLanguage(int id, String programmingLangName) {
		//super();
		this.id = id;
		this.programmingLangName = programmingLangName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProgramminLangName() {
		return programmingLangName;
	}


	public void setProgramminLangName(String programmingLangName) {
		this.programmingLangName = programmingLangName;
	}
	
	
	
	
	
	
}
