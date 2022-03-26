package com.example.currency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btCalc)
        val editText:EditText= findViewById(R.id.ednum)
        val resultTV:TextView= findViewById(R.id.textResult)
        var flag = "JD to Dollar"
        val spinnerVal : Spinner = findViewById(R.id.spSelect)
        val options = arrayOf("JD to Dollar","Dollar to JD")
        spinnerVal.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,options )

        button.setOnClickListener {
            val x:Float= editText.text.toString().toFloat()

            if(flag == "JD to Dollar")
                resultTV.text = jDDollar(x).toString()
            else
                resultTV.text = dollarJD(x).toString()
        }
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options[p2]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }
}

fun jDDollar(a:Float): Double {
    return a/0.7
}

fun dollarJD(b:Float): Double{
    return b*0.7
}

