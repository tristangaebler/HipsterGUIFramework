package model.hipster;

public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	//private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		//this.hipsterBooks = new Books[3];
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

	private void setUpBooks(){}
}
