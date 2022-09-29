package com.example.mad_pr_3_20012011109
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
lateinit var textView2: TextView
lateinit var button: Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView2=findViewById(R.id.textView2)
        button=findViewById(R.id.button)
        textView2.setOnClickListener {
            intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
            button.setOnClickListener {
                val i1= Intent(this, welcome::class.java)
                startActivity(i1)
            }
        }
    }
}
