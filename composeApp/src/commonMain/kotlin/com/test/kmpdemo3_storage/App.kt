package com.test.kmpdemo3_storage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.test.kmpdemo3_storage.data.KMMPreference

import org.koin.compose.koinInject

@Composable
fun App() {
    // inject from Koin
    val prefs = koinInject<KMMPreference>()
    prefs.put("test_key", "test_value")
    MaterialTheme {
        //val pref = KMMPreference(context = KMMContext)

        var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = {
                println("Button clicked ${prefs.getString("test_key")}")
            }) {
                Text("Click me!")
            }

        }
    }
}