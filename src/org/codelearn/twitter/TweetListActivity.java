package org.codelearn.twitter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class TweetListActivity extends Activity {

	private ListView tweetListView;

    private ArrayAdapter tweetItemArrayAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tweet_list);
		
		tweetItemArrayAdapter = new TweetAdapter(this, new String[10]);
		
		
		tweetListView = (ListView) findViewById(R.id.tweetList);
      tweetListView.setAdapter(tweetItemArrayAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tweet_list, menu);
		return true;
	}

}
