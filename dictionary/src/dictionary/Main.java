package dictionary;

public class Main {

	public static void main(String[] args) {
		Term t1 = new Term("czas poglosu", "czas w sekundach w ktorym enegrgia....");
		Term t2 = new Term("komora pog³osowa", "komora w ktorej zastosowane sa rozpraszacze...");
		Term t3 = new Term("izolacyjnoœc", "zdolnosc materia³u do...");
		Term t4 = new Term("mikrofon", "przetwornik mecahno-elektryczny...");
		Term t5 = new Term("gloœnik", "przetwornik....");
		Term t6 = new Term("efekt zblizeniowy", "efekt podbicia niskich czestotliwosci");
		
		DictionaryImp spa = new DictionaryImp();
		Sections s1 = new Sections("Wibroakustyka");
		Sections s2 = new Sections("Akustyka  w mediach i kulturze");
		
		Groups g1 = new Groups("O g³osnikach");
		Groups g2 = new Groups("O mikrofonach");
		Groups g3 = new Groups("Pojêcia wstepne");
		Groups g4 = new Groups("Komory");
		
		spa.add_section(s1);
		System.out.println(spa.add_section(s2));
	
		s1.add_group(g1);
		s1.add_group(g2);
		
		s2.add_group(g3);
		s2.add_group(g4);
		
		g1.add_term(t5);
		g2.add_term(t4);
		g2.add_term(t6);
		g3.add_term(t1);
		g3.add_term(t3);
		System.out.println(g4.add_term(t2));
		System.out.println(g4.add_term(t2));
		
		System.out.println(spa.search_word("komora pog³osowa"));
		System.out.println(spa.search_word("mikrofon"));
		System.out.println(spa.show_sections());
		System.out.println(s1.show_groups());
		System.out.println(g1.show_terms());
		
		

	}

}
