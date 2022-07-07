package dev.kanini.tweets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
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
        var tweets=Tweets("Catherine Kanini","nini@gmail.com","Today I had an amazing day at work.#Goodvibe,#Positivity,#Be happy","78","70","250","16.5k","")
        var tweets1=Tweets("Timothy Mutuvi","tmo@gmail.com","#100Daysofcode,Today i learnt about recycler view in Kotlin,#AkiraChix","50","58","80","90","")
        var tweets2=Tweets("Teresia Ngina","ngina@gmail.com","#spoil yourself,I went to Dubai for a vacation and am enjoying myself with different kind of foods and visiting different places.#money is good","50","58","80","90","")
        var tweets3=Tweets("Violet Mutio","mutio@gmail.com","Today I went for a biking competition in California and I was able to come number 2 out of 100.Am so proud of myself.#self love","50","58","80","90","")
        var tweets4=Tweets("Lisa Mwende","mwesh@gmail.com","#spoil yourself,I went to Dubai for a vacation and am enjoying myself with different kind of foods and visiting different places.#money is good","78","70","250","16.5k","")
        var tweets5=Tweets("Vida raph","vraph@gmail.com","#connect,Today I was so honoured to attend a cyber security conference that was held in New york.I got to connect with different people","78","70","250","16.5k","")

        var tweet_List= listOf(tweets,tweets1,tweets2,tweets3,tweets4,tweets5)
        var tweetAdapter=TweetRvAdapter(tweet_List)
        binding.rvnames.layoutManager = LinearLayoutManager(this)
        binding.rvnames.adapter = tweetAdapter





    }
}
