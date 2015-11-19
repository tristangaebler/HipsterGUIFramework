package view.hipster;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import controller.hipster.*;
import model.hipster.*;


public class HipsterPanel extends JPanel
{
	private HipsterController baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	private JLabel bookPageCountLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookTitleLabel;
	private JLabel bookPriceLabel;
	private JLabel bookSubjectLabel;
	private JButton changeBookButton;
	private int maxClicks;
	private int startClicks;
	
	public HipsterPanel(HipsterController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		phraseComboBox = new JComboBox<String>();
		bookPageCountLabel = new JLabel("The page count");
		bookAuthorLabel = new JLabel("The author");
		bookPriceLabel = new JLabel("The price");
		bookSubjectLabel = new JLabel("The subject");
		bookTitleLabel = new JLabel("The title");
		changeBookButton = new JButton("Change Books");
		maxClicks = baseController.getFirstHipster().getHipsterBooks().length;
		startClicks = 0;
		
		setUpCombo();
		setUpPanel();
		setUpLayout();
		setUpListeners();
		
	}

	private void setUpCombo()
	{
		String [] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}
	
	private void setUpPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(phraseComboBox);
		this.add(bookPageCountLabel);
		this.add(bookAuthorLabel);
		this.add(bookTitleLabel);
		this.add(bookPriceLabel);
		this.add(bookSubjectLabel);
		this.add(changeBookButton);
	}
	
	private void setUpLayout(){}
	
	private void setUpListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				setBackground(new Color(red, green, blue));
				String updatedTitle = phraseComboBox.getSelectedItem().toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
			}
		});
		
		changeBookButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Book [] tempBooks = baseController.getFirstHipster().getHipsterBooks();
				if(startClicks < maxClicks)
				{
					bookSubjectLabel.setText("Book subject: " + tempBooks[startClicks].getSubject());
					bookAuthorLabel.setText("Book author: " + tempBooks[startClicks].getAuthor());
					bookTitleLabel.setText("Book title: " + tempBooks[startClicks].getTitle());
					bookPageCountLabel.setText("Book pages: " + tempBooks[startClicks].getPageCount());
					bookPriceLabel.setText("Book price: " + tempBooks[startClicks].getPrice());
					startClicks++;
				}
				else
				{
					startClicks = 0;
					bookSubjectLabel.setText("Book subject:" );
					bookAuthorLabel.setText("Book author: ");
					bookTitleLabel.setText("Book title: ");
					bookPageCountLabel.setText("Book pages: ");
					bookPriceLabel.setText("Book price:");
				}
			}
		});
	}
}






