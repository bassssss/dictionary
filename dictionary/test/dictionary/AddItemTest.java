package dictionary;

import org.junit.Assert;
import org.junit.Test;

public class AddItemTest {
	
	DictionaryImp spa = new DictionaryImp();
	
	@Test
	public void ShouldAddSection(){
		Sections s1 = new Sections("Wibroakustyka");
		
		Assert.assertEquals("Section added",  spa.add_section(s1));
		
	}

	@Test
	public void ShouldSaySectionExists(){
		Sections s1 = new Sections("Wibroakustyka");
		Sections s2 = new Sections("Wibroakustyka");
		spa.add_section(s1);
		
		Assert.assertEquals("This section is already existing in disctionary",  spa.add_section(s2));
	}
	
	@Test
	public void ShouldAddGroup(){
		Sections s1 = new Sections("Wibroakustyka");
		Groups g1 = new Groups("Komory");
		spa.add_section(s1);
		
		Assert.assertEquals("Group added",  s1.add_group(g1));
		
	}
	
	@Test
	public void ShouldSayGroupExists(){
		Sections s1 = new Sections("Wibroakustyka");
		Groups g1 = new Groups("Komory");
		Groups g2 = new Groups("Komory");
		
		spa.add_section(s1);
		s1.add_group(g1);
		
		Assert.assertEquals("This group is already existing in discyionary",  s1.add_group(g2));
	}
	
	@Test
	public void ShouldAddTerm(){
		Sections s1 = new Sections("Wibroakustyka");
		Groups g1 = new Groups("Komory");
		Term t1 = new Term("Komora pog這sowa", "jest to komora z d逝gim czasem pog這su...");
		spa.add_section(s1);
		s1.add_group(g1);
		
		Assert.assertEquals("Term added",  g1.add_term(t1));
		
	}
	
	@Test
	public void ShouldSayTermExists(){
		Sections s1 = new Sections("Wibroakustyka");
		Groups g1 = new Groups("Komory");
		Term t1 = new Term("Komora pog這sowa", "jest to komora z d逝gim czasem pog這su...");
		Term t2 = new Term("Komora pog這sowa", "jest to komora z d逝gim czasem pog這su...");
		
		spa.add_section(s1);
		s1.add_group(g1);
		g1.add_term(t1);
		
		Assert.assertEquals("This term is already existing in discyionary",  g1.add_term(t2));
	}
	
	
	
	
	
	
}
