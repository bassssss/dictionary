package dictionary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Section extends DictionaryImp {
	protected String name;
 
	private List<Group> groups = new ArrayList<Group>();
 
	public Section(String name){
	 this.name = name;
	}
 
	public String get_name(){
		return this.name;
	}
 
	public String search_word(String word) {
		String cont = null;
		for(Group g1: groups ){
			cont = g1.search_word(word);
		}
		return cont;
	}
	
	public List<String> show_groups(){
		List<String> groups_name = new ArrayList<String>();
		
		for(Group g: groups){
			groups_name.add(g.get_name());
		}
		
		Comparator<String> cmp = new Comparator<String>() {
			public int compare(String s0, String s1) {
				return s0.compareTo(s1);
			}
		};
	 		
		Collections.sort(groups_name, cmp);
		return groups_name;
		}

	public String add_group(Group g) {		
		String tmp = "";
		for(Group g1: groups ){
			if (g1.get_name().equals(g.get_name()))
				tmp = "1";
		}		
		if(tmp.equals("1"))		
				return "This group is already existing in discyionary";	
		else
				groups.add(g);
				return "Group added";
	
	}	
}
