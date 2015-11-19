package model.hipster;


public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		setUpArray();
		setUpBooks();
	}
	

	private void setUpArray()
	{
		hipsterPhrases[0] = "Sorry, I only use products that are still in beta.";
		hipsterPhrases[1] = "When I die, I'm leaving my body to art.";
		hipsterPhrases[2] = "My music doesn’t really have a genre, but if I had to define it I’d probably say Organic Garage";
		hipsterPhrases[3] = "They sound so much better on vinyl";
	}
	
	private void setUpBooks()
	{
		Book firstBook, secondBook, thirdBook; //Declaring multiple variables of the same type on the same line 
		firstBook = new Book();
		firstBook.setAuthor("Micku Kaku");
		firstBook.setTitle("Physics of the future");
		firstBook.setSubject("Science");
		firstBook.setPageCount(416);
		firstBook.setPrice(19.68);
		
		secondBook = new Book();
		secondBook.setAuthor("Walter Isaacson");
		secondBook.setTitle("Steve Jobs");
		secondBook.setSubject("Biography");
		secondBook.setPageCount(655);
		secondBook.setPrice(22.28);
		
		thirdBook = new Book(368, "Frank McCourt", "Angela's Ashes", "Memoir", 18.03);
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;		
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}
	
	public Book[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	public void setHipsterBooks(Book[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
}
