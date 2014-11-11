package dictionary;

public class Term extends Groups {
	private String content;
	
	
	public Term(String name, String content){
		super(name);
		this.content = content;
	}
	
	public String get_content(){
		return this.content;		
	}
	
	public String get_term(){
		return this.name;
	}


}
