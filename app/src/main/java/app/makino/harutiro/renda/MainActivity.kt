package app.makino.harutiro.renda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var tapCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tapButton = findViewById<Button>(R.id.tapButton)
        val countText = findViewById<TextView>(R.id.countText)


        tapButton.setOnClickListener{
            tapCount = tapCount + 1
            countText.text = tapCount.toString()

        }


    }
}