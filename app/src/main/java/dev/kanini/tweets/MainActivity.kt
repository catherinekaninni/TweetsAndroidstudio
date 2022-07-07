package dev.kanini.tweets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.kanini.tweets.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
        }
    fun displayTweets(){
        var tweets=Tweets("Timothy Mutuvi","","Today I had an amazing day at work.#Goodvibe,#Positivity,#Be happy")
        var tweets1=Tweets("Teresia Ngina","","#100Daysofcode,Today i learnt about recycler view in Kotlin,#AkiraChix")
        var tweet2=Tweets("Shaina Kanini","","Today was an amazing day for me because i learnt about different ways to come up with a problem and thinking through it,#Loving my career path")
        var tweet3=Tweets("Violet Mutio","","Today I went for a biking competition in California and I was able to come number 2 out of 100.Am so proud of myself.#self love")
        var tweet4=Tweets("Lisa Mwende","","#spoil yourself,I went to Dubai for a vacation and am enjoying myself with different kind of foods and visiting different places.#money is good")
        var tweet5=Tweets("Vida Mutuvi","","#connect,Today I was so honoured to attend a cyber security conference that was held in New york.I got to connect with different people")
      var tweet_List= listOf(tweets,tweets1,tweet2,tweet3,tweet4,tweet5)
        var tweetAdapter=TweetRvAdapter(tweet_List)
//        binding.rvTweet.Adapter.layoutManager=LinearLayoutManager(this)
//        binding.rvTweet.Adapter=TweetAdapter





    }
}
