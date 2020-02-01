package com.example.jetpack_compose_arthur

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.isSystemInDarkTheme
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview

@Composable
fun RecipeCard(recipe: Recipe) {
    /*
    //Text(recipe.tittle)
    val image = +imageResource(recipe.imageResource)
    Column {
        Container(expanded = true, height = 144.dp) {
            DrawImage(image = image)
        }
        Text(recipe.tittle)
        for (ingredient in recipe.ingredients) {
            Text(ingredient)
        }
    }
     */
    Surface(
        shape = RoundedCornerShape(8.dp),
        elevation = 8.dp,
         color = Color.White
    ) {
        val image = +imageResource(recipe.imageResource)
        Column {
            Container(expanded = true, height = 144.dp) {
                DrawImage(image = image)
            }
            Text(recipe.tittle)
            for (ingredient in recipe.ingredients) {
                Text("º $ingredient")
            }
        }
    }
}

@Composable
@Preview
fun DefaultRecipeCard() {
    MaterialTheme {
        RecipeCard(defaultRecipes[0])
    }
}