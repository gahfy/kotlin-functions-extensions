package net.gahfy.functionsextensions

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

import net.gahfy.functionsextensions.utils.TextViewUtils

class MainActivity : AppCompatActivity() {
    private lateinit var mLblHelloWorld: TextView

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mLblHelloWorld = findViewById(R.id.lbl_hello_world)
        TextViewUtils.setTypefaceToTextView(this, mLblHelloWorld, "Roboto-Medium.ttf")
    }
}
