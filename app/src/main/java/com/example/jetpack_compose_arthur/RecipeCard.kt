package com.example.jetpack_compose_arthur

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

@Composable
fun RecipeCard(recipe: Recipe) {
    //Text(recipe.tittle)
    val image = +imageResource(recipe.imageResource)
    Column {
        Container(expanded = true, height = 144.dp) {
            DrawImage(image = image)
        }
        Text(recipe.tittle)
    }
}

@Composable
@Preview
fun DefaultRecipeCard() {
    RecipeCard(defaultRecipes[0])
}