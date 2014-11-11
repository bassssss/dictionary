package dictionary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class DictionaryImp implements Dictionay {
	
	private List<Sections> sections = new ArrayList<Sections>();

	private List<Groups> groups = new ArrayList<Groups>();
	private List<Term> terms = new ArrayList<Term>();

	@Override
	public String search_word(String word) {
		String tmp = "";
		for(Sections s1: sections ){ // zle, trzeba cos wymyslic
			for(Groups g1: groups){
				for(Term t1: terms){
			if (word.equals(t1.get_name()))
				tmp =  t1.get_content();
		}
			}
		}
		
		if (tmp.equals(""))
			return "This term does not exist in dictionary";
		
		else
			return tmp;
	}

	@Override
	public List<String> show_sections(){
		List<String> sections_name = new ArrayList<String>();
		
		for(Sections s: sections){
			sections_name.add(s.get_name());
		}
		
		Comparator<String> cmp = new Comparator<String>() {
			public int compare(String s0, String s1) {
				return s0.compareTo(s1);
			}
     };
     		
		sections_name.sort(cmp);
				
		return sections_name;
		
	}
	
	public String add_section(Sections s) {
		String tmp = "";
		for(Sections s1: sections ){
			if (s1.get_name().equals(s.get_name()))
				tmp = "1";
		}		
		if(tmp.equals("1"))		
				return "This section is already existing in disctionary";	
		else
				sections.add(s);
				return "Section added";
		
	}

}
