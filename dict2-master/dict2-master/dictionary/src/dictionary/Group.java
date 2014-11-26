package dictionary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Group extends Section {
	
	List<Term> terms = new ArrayList<Term>();
	
	
	public Group(String name){
		super(name);
	}
	
	public String search_word(String word) {
		String tmp = "";
		for(Term t1: terms){			
			if (word.equals(t1.get_name()))
				tmp =  t1.get_content();	
		}		
		if (tmp.equals("")){
			tmp = "This term does not exist in dictionary";
		}		
		return tmp;
	}
	
	public List<String> show_terms(){
		ArrayList<String> terms_name = new ArrayList<String>();
		
		Comparator<String> cmp = new Comparator<String>() {
			public int compare(String s0, String s1) {
				return s0.compareTo(s1);
			}
        };
        
		for(Term t1: terms)
			terms_name.add(t1.get_name());
		
		Collections.sort(terms_name, cmp);
		return terms_name;
	}
	
	public String add_term(Term t) {
		String tmp = "";
		for(Term t1: terms){
			if (t1.get_name().equals(t.get_name()))
				tmp = "1";
		}		
		if(tmp.equals("1"))		
				return "This term is already existing in disctionary";	
		else
				terms.add(t);
				return "Term added";		
	}
}
