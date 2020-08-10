package com.example.usingstring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TextView txtMsg3 = clearFindViewByIdCache (R.id.txtMsg3);
        txtMsg3.setText(R.id.TvMsg2);
    }
}