package com.example.testany.first

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testany.databinding.TestBinding
import com.example.testany.second.SecondActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding:TestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        this.window.statusBarColor = Color.rgb(0x87, 0x00, 0x11)

        /*  //测试dialog
        binding.btnTest.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.setMessage("this is a message")
            dialog.setCancelable(false)
            dialog.setPositiveButton("true") { _, _ ->
                val intent = Intent()
                    .setClass(this,SecondActivity::class.java)
                    //intent.setClassName(this,SecondActivity::class.java.name)
                startActivity(intent)
            }
            dialog.setNegativeButton("false") { _, _ ->
                Toast.makeText(this, "you click false button", Toast.LENGTH_SHORT).show()
            }
            dialog.create().show()
        }
         */

        val list: List<String> =
            arrayListOf("s", "c", "y", "d", "e", "w", "t", "c", "y", "d", "e", "w", "t","s", "c", "y", "d", "e", "w", "t", "c", "y", "d", "e", "w", "t")
        binding.container.layoutManager = LinearLayoutManager(this)
        val adapter = RecycleViewAdapter(this, list)
        binding.container.adapter = adapter

        binding.headBanner1.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }


    }
}