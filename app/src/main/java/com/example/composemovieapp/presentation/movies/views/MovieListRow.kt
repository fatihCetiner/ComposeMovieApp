package com.example.composemovieapp.presentation.movies.views

import androidx.annotation.ColorRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.composemovieapp.R
import com.example.composemovieapp.domain.model.Movie
import com.example.composemovieapp.presentation.movies.MoviesViewModel


@Composable
fun MovieListRow(
    modifier: Modifier = Modifier,
    movie: Movie,
    onItemClick: (Movie) -> Unit,
) {
    Card(
        modifier = modifier
            .height(300.dp)
            .fillMaxWidth()
            .padding(10.dp)
            .clickable { onItemClick(movie) },
        shape = RoundedCornerShape(8.dp),
        backgroundColor = colorResource(id = R.color.dark_gray)
    ) {

        Column {
            Box(
                modifier = modifier
                    .weight(1f)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = rememberImagePainter(data = movie.Poster ),
                    contentDescription = movie.Title,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(200.dp, 200.dp)
                        .clip(RectangleShape)
                )
                Surface(
                    color = Color.Black.copy(alpha = 0.6f),
                    modifier = modifier
                        .size(50.dp),
                    shape = CircleShape
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.play_button),
                        contentDescription = null,
                        modifier = modifier
                            .padding(12.dp)
                            .align(Alignment.Center)
                    )
                }
            }

            Column(
                modifier = modifier
                    .padding(10.dp)
                    .align(CenterHorizontally),

                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = movie.Title,
                    style = TextStyle(fontSize = 20.sp),
                    overflow = TextOverflow.Ellipsis,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = modifier.height(4.dp))

                Text(
                    text = movie.Year,
                    style = TextStyle(fontSize = 16.sp),
                    overflow = TextOverflow.Ellipsis,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }
        }

    }
}
