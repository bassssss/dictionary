package dictionary;

import org.junit.Assert;
import org.junit.Test;


public class SearchWordTest {

	DictionaryImp spa = new DictionaryImp();
	
	@Test
	public void ShouldSayTermDoesNotExist(){
		
		Section s1 = new Section("Wibroakustyka");
		Group g1 = new Group("Komory");
		Term t1 = new Term("Komora pog�osowa", "jest to komora z d�ugim czasem pog�osu...");
		spa.add_section(s1);
		s1.add_group(g1);
		g1.add_term(t1);
		
		Assert.assertEquals("This term does not exist in dictionary", spa.search_word("Tat"));
		
	}
	
	@Test
	public void ShouldFindContent(){
		
		Section s1 = new Section("Wibroakustyka");
		Group g1 = new Group("Komory");
		Term t1 = new Term("Komora pog�osowa", "jest to komora z d�ugim czasem pog�osu...");
		spa.add_section(s1);
		s1.add_group(g1);
		g1.add_term(t1);
		
		Assert.assertEquals("jest to komora z d�ugim czasem pog�osu...", spa.search_word("Komora pog�osowa"));
		
	}
}
