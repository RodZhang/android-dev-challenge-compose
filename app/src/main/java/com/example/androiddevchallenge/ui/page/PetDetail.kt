package com.example.androiddevchallenge.ui.page

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.getPetById
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun PetDetail(navController: NavHostController, petId: Int) {
    val pet = getPetById(petId) ?: return
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("${pet.name} Detail") },
                contentColor = Color.White,
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp, 24.dp)
                            .clickable {
                                navController.navigateUp()
                            }
                    )
                }
            )
        }
    ) {
        LazyColumn {
            item {
                Column(modifier = Modifier.padding(8.dp)) {
                    Image(
                        painter = painterResource(pet.pic),
                        contentDescription = "",
                        alignment = Alignment.Center,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(text = pet.name, style = typography.body1)

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

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = pet.desc,
                        style = typography.body2
                    )

                    Spacer(modifier = Modifier.height(8.dp))
                }
            }

            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Button(
                        modifier = Modifier.height(50.dp),
                        onClick = {  }
                    ) {
                        Text(
                            text = "Take me home",
                            color = Color.White,
                            fontSize = 18.sp
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}