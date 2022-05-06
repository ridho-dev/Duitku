package com.dededev.duitku.ui.addTransaction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.dededev.duitku.R
import com.dededev.duitku.databinding.ActivityAddTransactionBinding

class AddTransactionActivity : AppCompatActivity() {
    private lateinit var addTransactionBinding: ActivityAddTransactionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addTransactionBinding = ActivityAddTransactionBinding.inflate(this.layoutInflater)
        setContentView(addTransactionBinding.root)

        val toolbar: Toolbar = findViewById(R.id.tb_add_transaction)
        setSupportActionBar(toolbar)
    }
}