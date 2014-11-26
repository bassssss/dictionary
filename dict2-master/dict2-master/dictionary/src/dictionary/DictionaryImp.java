package dictionary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class DictionaryImp implements Dictionary {
	
	private List<Section> sections = new ArrayList<Section>();


	public String search_word(String word) {
		String cont = null;
		for(Section s1: sections ){
			cont = s1.search_word(word);
		}	
			return cont;
	}

	public List<String> show_sections(){
		List<String> sections_name = new ArrayList<String>();	
		for(Section s: sections){
			sections_name.add(s.get_name());
		}
		
		Comparator<String> cmp = new Comparator<String>() {
			public int compare(String s0, String s1) {
				return s0.compareTo(s1);
			}
		};
     		
		Collections.sort(sections_name, cmp);
		return sections_name;
	}
	
	public String add_section(Section s) {
		String tmp = "";
		for(Section s1: sections ){
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
