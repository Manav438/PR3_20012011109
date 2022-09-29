package com.example.mad_pr_3_20012011109
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
lateinit var button2: Button
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        button2=findViewById(R.id.button2)
        button2.setOnClickListener{
            intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
            val button2 = findViewById<Button>(R.id.button2);
            button2.setOnClickListener {
                Toast.makeText(this, "Successfully Sign
                        Up",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
