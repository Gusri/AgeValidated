package com.gus.agevalidated

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerBtn.setOnClickListener {
            val inputName:String = nameText.text.toString()
            val age:String = ageText.text.toString()

            //convert String To Int
            if(age.toInt() < 18){
                toast("Sorry $inputName your Age not Register")
            } else {
                toast("Thank you $inputName for Register")
            }
        }
    }


}
