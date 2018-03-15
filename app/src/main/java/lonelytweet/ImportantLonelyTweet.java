package lonelytweet;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
		super();
	}

	public ImportantLonelyTweet(String text, Date date) {
		super(text, date);
	}

	public boolean isImportant() {
		return true;
	}

	// Changed to private because it is not accessed anywhere outside of the class
	private String getTweetBody() {
		return tweetBody.toUpperCase();
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody() ;
	}

}