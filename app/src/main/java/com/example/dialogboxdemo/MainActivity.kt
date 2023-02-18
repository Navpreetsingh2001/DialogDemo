package com.example.dialogboxdemo

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import com.example.dialogboxdemo.databinding.ActivityMainBinding
import com.example.dialogboxdemo.databinding.DialogBoxDemoBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn.setOnClickListener {
            val dialogBox = layoutInflater.inflate(R.layout.dialog_box_demo,null)

            val myDialog =Dialog(this)
            myDialog.setContentView(dialogBox)

            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            myDialog.show()

            val close =dialogBox.findViewById<Button>(R.id.btn_ok)
            close.setOnClickListener {
                myDialog.dismiss()
            }



        }

    }
}