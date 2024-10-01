package edu.temple.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // Extract transferred value and use for lyricsDisplayView text size
        with(findViewById<TextView>(R.id.lyricsDisplayTextView)) {
            val textSize = intent.getIntExtra("TEXT_SIZE", 20) // Default size is 20 if not found
            textSize = textSize.toFloat()
        }
    }
}
