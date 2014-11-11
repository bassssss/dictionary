package dictionary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Groups extends Sections {
	
	List<Term> terms = new ArrayList<Term>();
	
	
	public Groups(String name){
		super(name);
	}
	
	public String add_term(Term t) {
		String tmp = "";
		for(Term t1: terms){
			if (t1.get_name().equals(t.get_name()))
				tmp = "1";
		}		
		if(tmp.equals("1"))		
				return "This term is already existing in discyionary";	
		else
				terms.add(t);
				return "Term added";
		
	}
		

	
	public List<String> show_terms(){
		List<String> terms_name = new ArrayList<String>();
		
		Comparator<String> cmp = new Comparator<String>() {
			public int compare(String s0, String s1) {
				return s0.compareTo(s1);
			}
        };
        
		for(Term t1: terms)
			terms_name.add(t1.get_name());
		
		terms_name.sort(cmp);
				
		return terms_name;
	}
}
