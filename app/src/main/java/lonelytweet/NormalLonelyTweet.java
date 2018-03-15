package lonelytweet;

import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {

	public NormalLonelyTweet() {
		super();
	}

	public NormalLonelyTweet(String text, Date date) {
		super(text, date);
	}

	public boolean isImportant() {
		return false;
	}

	public String getTweetBody() {
		return tweetBody;
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody() ;
	}

}