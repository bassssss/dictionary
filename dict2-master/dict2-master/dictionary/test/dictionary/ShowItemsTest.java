package dictionary;


import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ShowItemsTest {
	
DictionaryImp spa = new DictionaryImp();
	
	@Test
	public void ShouldShowSections(){
		Section s1 = new Section("Wibroakustyka");
		Section s2 = new Section("Media i kultura");
		
		spa.add_section(s1);
		spa.add_section(s2);
		
		List<String> actual = Arrays.asList("Media i kultura", "Wibroakustyka");
		
		Assert.assertEquals( actual, spa.show_sections());
		
	}
	
	@Test
	public void ShouldShowGroups(){
		Section s1 = new Section("Wibroakustyka");
		Group g1 = new Group("Teoria drgañ");
		Group g2 = new Group("Akustyka architektoniczna");
		
		spa.add_section(s1);
		s1.add_group(g1);
		s1.add_group(g2);
		
		List<String> actual = Arrays.asList("Akustyka architektoniczna", "Teoria drgañ");
		
		Assert.assertEquals( actual, s1.show_groups());
		
	}
	
	

}
