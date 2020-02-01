package com.example.jetpack_compose_arthur

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.tooling.preview.Preview

@Composable
fun RecipeCard(recipe: Recipe) {
    Text(recipe.tittle)
}

@Composable
@Preview
fun DefaultRecipeCard() {
    RecipeCard(defaultRecipes[0])
}