package com.example.prak5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.prak5.ui.theme.Prak5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Prak5Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FormDataDiri(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}