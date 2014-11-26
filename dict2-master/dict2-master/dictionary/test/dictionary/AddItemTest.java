package dictionary;

import org.junit.Assert;
import org.junit.Test;

public class AddItemTest {
	
	DictionaryImp spa = new DictionaryImp();
	
	@Test
	public void ShouldAddSection(){
		Section s1 = new Section("Wibroakustyka");
		
		Assert.assertEquals("Section added",  spa.add_section(s1));
		
	}

	@Test
	public void ShouldSaySectionExists(){
		Section s1 = new Section("Wibroakustyka");
		Section s2 = new Section("Wibroakustyka");
		spa.add_section(s1);
		
		Assert.assertEquals("This section is already existing in disctionary",  spa.add_section(s2));
	}
	
	@Test
	public void ShouldAddGroup(){
		Section s1 = new Section("Wibroakustyka");
		Group g1 = new Group("Komory");
		spa.add_section(s1);
		
		Assert.assertEquals("Group added",  s1.add_group(g1));
		
	}
	
	@Test
	public void ShouldSayGroupExists(){
		Section s1 = new Section("Wibroakustyka");
		Group g1 = new Group("Komory");
		Group g2 = new Group("Komory");
		
		spa.add_section(s1);
		s1.add_group(g1);
		
		Assert.assertEquals("This group is already existing in discyionary",  s1.add_group(g2));
	}
	
	@Test
	public void ShouldAddTerm(){
		Section s1 = new Section("Wibroakustyka");
		Group g1 = new Group("Komory");
		Term t1 = new Term("Komora pog這sowa", "jest to komora z d逝gim czasem pog這su...");
		spa.add_section(s1);
		s1.add_group(g1);
		
		Assert.assertEquals("Term added",  g1.add_term(t1));
		
	}
	
	@Test
	public void ShouldSayTermExists(){
		Section s1 = new Section("Wibroakustyka");
		Group g1 = new Group("Komory");
		Term t1 = new Term("Komora pog這sowa", "jest to komora z d逝gim czasem pog這su...");
		Term t2 = new Term("Komora pog這sowa", "jest to komora z d逝gim czasem pog這su...");
		
		spa.add_section(s1);
		s1.add_group(g1);
		g1.add_term(t1);
		
		Assert.assertEquals("This term is already existing in disctionary",  g1.add_term(t2));
	}
	
	
	
	
	
	
}
