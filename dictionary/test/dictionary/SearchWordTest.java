package dictionary;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class SearchWordTest {

	DictionaryImp spa = new DictionaryImp();
	
	@Test
	public void ShouldFindContent(){
		Term t1 = new Term("Czas pog³osu", "czas w jakim enegria...");
		
		Assert.assertEquals("czas w jakim enegria...", spa.search_word("Czas pog³osu"));
		
	}
}
