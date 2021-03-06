package com.example.jetpack_compose_arthur

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.FlexColumn
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }
}

@Composable
fun Greeting() {
    MaterialTheme {
        FlexColumn {
            inflexible {
                TopAppBar(
                    title = {
                        Text("ComposableCookBook")
                    }
                )
            }
            flexible(flex = 1f){
                RecipeList(defaultRecipes)
            }
        }
    }
    /*
    Column {
        Text(text = "Hello Mundo!", style = TextStyle(color = Color.Blue))
        Text(text = "Hello Cruel Mundo!", style = TextStyle(color = Color.Blue))
        Text(text = "Hello Cruel Vida!", style = TextStyle(color = Color.Blue))
    }
     */
}

@Preview
@Composable
fun DefaultPreview() {
    Greeting()
}