package dictionary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Sections extends DictionaryImp {
 protected String name;
 
 private List<Groups> groups = new ArrayList<Groups>();
 
 public Sections(String name){
	 this.name = name;
 }
 
 public String get_name(){
		return this.name;
	}

public String add_group(Groups g) {		
	String tmp = "";
	for(Groups g1: groups ){
		if (g1.get_name().equals(g.get_name()))
			tmp = "1";
	}		
	if(tmp.equals("1"))		
			return "This group is already existing in discyionary";	
	else
			groups.add(g);
			return "Group added";
	
	}

public List<String> show_groups(){
	List<String> groups_name = new ArrayList<String>();
	
	for(Groups g: groups){
		groups_name.add(g.get_name());
	}
	
	Comparator<String> cmp = new Comparator<String>() {
		public int compare(String s0, String s1) {
			return s0.compareTo(s1);
		}
 };
 		
	groups_name.sort(cmp);
			
	return groups_name;
	
}
	
}
