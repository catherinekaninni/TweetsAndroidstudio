package dev.kanini.tweets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetRvAdapter (var tweetList: List<Tweets>):
  RecyclerView.Adapter<TweetsViewHolder>(){
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
    var itemView = LayoutInflater.from(parent.context)
      .inflate(R.layout.tweet_item_list,parent,false)
    return TweetsViewHolder(itemView)
  }

  override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
    var currentTweet = tweetList.get(position)
    holder.tvName.text=currentTweet.name

  }

  override fun getItemCount(): Int {
    return tweetList.size

  }
}

class TweetsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
  var tvName =itemView.findViewById<TextView>(R.id.tvtweet)
  var imgContact =itemView.findViewById<ImageView>(R.id.imgperson)

}




