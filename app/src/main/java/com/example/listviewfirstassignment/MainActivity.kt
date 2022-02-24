package com.example.listviewfirstassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val expenses:ListView = findViewById(R.id.lvExpenses)
        val expenseList = arrayOf("Groceries","Transportation","Rent","Cell Phone","Utility Bills","Insurance")
        val expenseAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,expenseList)

        expenses.adapter = expenseAdapter
        expenses.setOnItemClickListener { adapterView, view, i, l ->
            val expenseName:TextView = view as TextView
            Toast.makeText(this,expenseName.text,Toast.LENGTH_LONG).show()
        }

    }
}