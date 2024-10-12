package com.oasis.dsl

import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.addTextChangedListener
import com.oasis.mykotlinbase.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val e = EditText(this)
        e.addTextChangedListener(customTextWatcher {
            this.textAfterChange { text ->
                println(text)
            }

            textOnChange { s, start, before, count ->  }

            textBeforeChange { s, start, count, after ->  }
        })
    }
}