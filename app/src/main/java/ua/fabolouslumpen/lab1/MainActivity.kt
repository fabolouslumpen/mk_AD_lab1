package ua.fabolouslumpen.lab1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import androidx.lifecycle.Observer


class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.tx)
        val button = findViewById<Button>(R.id.bt)

        viewModel.text.observe(this, Observer { newText ->
            textView.text = newText
        })

        button.setOnClickListener {
            viewModel.changeText()
        }
    }
}

