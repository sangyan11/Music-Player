package com.example.musicplayer

import android.graphics.Color.BLUE
import android.graphics.Color.GREEN
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var b1= findViewById<Button>(R.id.button)
        var b2= findViewById<Button>(R.id.button2)
        var b3= findViewById<Button>(R.id.button3)




        b1.setOnClickListener {
           playMusic(b1 )
       }
        b2.setOnClickListener {
            playMusic(b2 )
        }
        b3.setOnClickListener {
            playMusic(b3)
        }



    }
    fun playMusic(button : View){
        var button = button as Button

        val mediaplayer = MediaPlayer.create(this,resources.getIdentifier(button.tag as String,"raw",packageName))
        mediaplayer.start()
        if(mediaplayer.isPlaying){
            button.setBackgroundColor(BLUE)
            var stop =findViewById<Button>(R.id.stop_btn)
            stop.setOnClickListener {
                mediaplayer.reset()
            }

        }

    }
}