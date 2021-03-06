package app.makino.harutiro.renda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    var tapCount = 0
    var second = 10

    var tapButton: Button? = null
    var startButton: Button? = null
    var countText: TextView? = null
    var secondLabelText: TextView? = null



    val timer : CountDownTimer = object : CountDownTimer(10000,1000){
        override fun onFinish() {
            startButton?.isVisible = true
            tapButton?.setBackgroundResource(R.drawable.background_rounded_circle_glay)
            second = 10
            tapCount = 0
        }

        override fun onTick(millisUntilFinished: Long) {
            tapButton?.setBackgroundResource(R.drawable.background_rounded_circle)
            second = second - 1
            secondLabelText?.text = second.toString()

        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tapButton = findViewById<Button>(R.id.tapButton)
        startButton = findViewById<Button>(R.id.startButton)
        countText = findViewById<TextView>(R.id.countText)
        secondLabelText = findViewById<TextView>(R.id.secondLabelText)

        startButton?.setOnClickListener {
            countText?.text = tapCount.toString()
            startButton?.isVisible = false

            timer.start()
        }

        tapButton?.setOnClickListener{
            if(second < 10){
                tapCount = tapCount + 1
                countText?.text = tapCount.toString()
            }


        }




    }
}