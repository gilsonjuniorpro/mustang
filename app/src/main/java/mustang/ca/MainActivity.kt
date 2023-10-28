package mustang.ca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import jarvis.ca.DisplayTime
import jarvis.ca.SlidingCardExample
import mustang.ca.ui.theme.MustangTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MustangTheme {
                var isVisible by remember { mutableStateOf(false) }

                val toggleVisibility = { isVisible = !isVisible }

                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text("App") }
                        )
                    }
                ) { innerPadding ->
                    Surface(
                        color = Color.LightGray,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        SlidingCardExample(
                            isVisible = isVisible,
                            toggleVisibility = toggleVisibility,
                            displayTime = DisplayTime.Short,
                            backgroundColor = Color.DarkGray,
                            textColor = Color.White,
                            fontSize = 17,
                            content = "This is a notification",
                        )
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Button(onClick = toggleVisibility) {
                                Text(text = "Toggle Card")
                            }
                        }
                    }
                }
            }
        }
    }
}
