package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.PETS
import com.example.androiddevchallenge.Pet
import com.example.androiddevchallenge.ui.theme.typography


@Composable
fun Home(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Test Home") },
                contentColor = Color.White
            )
        }
    ) {
        LazyColumn {
            items(PETS) {
                PetItem(it) {
                    onPetClick(navController, it)
                }
            }
        }
    }
}

@Composable
fun PetItem(pet: Pet, onItemClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp, 8.dp, 8.dp, 0.dp)
            .clip(RoundedCornerShape(8.dp))
            .clickable { onItemClick() },
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = pet.pic),
                contentDescription = "",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
                    .clip(RoundedCornerShape(8.dp))
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column(modifier = Modifier.align(Alignment.CenterVertically)) {
                Text(
                    text = pet.name,
                    style = typography.body1
                )
                Row {
                    Text(
                        text = pet.sex,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Normal,
                        fontSize = 13.sp,
                        color = if (pet.sex == "Male") Color(0xFF90CAF9) else Color(0xFFF48FB1)
                    )
                    Text(
                        text = " | ${pet.weight} KG",
                        style = typography.body2
                    )
                }
                Text(
                    text = pet.desc,
                    style = typography.body2,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

private fun onPetClick(navController: NavHostController, pet: Pet) {
    navController.navigate("detail/${pet.id}")
}