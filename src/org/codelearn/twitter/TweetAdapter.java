package org.codelearn.twitter;

import java.util.List;

import twitter4j.Status;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * A custom {@link ArrayAdapter} for Tweet objects. This implementation inflates a custom
 * LinearLayout to render the Tweet at a given position.
 */
public class TweetAdapter extends ArrayAdapter<Status> {

  private LayoutInflater inflater;
  private List<Status> tweetsLocal;

  public TweetAdapter(Activity activity, List<Status> tweets) {
    super(activity, R.layout.row_tweet, tweets);
    inflater = activity.getWindow().getLayoutInflater();
    tweetsLocal = tweets;
  }

  public TweetAdapter(Activity activity, String[] str) {
    super(activity, R.layout.row_tweet);
    inflater = activity.getWindow().getLayoutInflater();

  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    View row = inflater.inflate(R.layout.row_tweet, parent, false);
    TextView title = (TextView) row.findViewById(R.id.tweetTitle);
    Status tweet = tweetsLocal.get(position);
    title.setText(tweet.getUser().getName());
    TextView body = (TextView) row.findViewById(R.id.textView2);
    body.setText(tweet.getText());
    return row;
  }

}
