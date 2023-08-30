package com.example.articulodecompose20200155

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.articulodecompose20200155.ui.theme.ArticuloDeComposeTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticuloDeComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticuloDeComposeApp()
                }
            }
        }
    }
}

@Composable
fun ArticuloDeComposeApp(){
    ArticuloCard(
        titulo = stringResource(R.string.titulo),
        intro = stringResource(R.string.intro),
        cuerpo = stringResource(R.string.cuerpo),
        imagePainter = painterResource(R.drawable.bg_compose_background)
    )
}

@Composable
private fun ArticuloCard(
    titulo: String,
    intro: String,
    cuerpo: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier){
        Image(painter = imagePainter, contentDescription = null)
        Text(
            text = titulo,
            modifier = Modifier.padding(16.dp) ,
            fontSize = 24.sp
        )
        Text(
            text = intro,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp) ,
            textAlign = TextAlign.Justify
        )
        Text(
            text = cuerpo,
            modifier = Modifier.padding(16.dp) ,
            textAlign = TextAlign.Justify
        )
    }

}

@Preview(showBackground = true)
@Composable
fun ArticuloComposePreview() {
    ArticuloDeComposeTheme {
        ArticuloDeComposeApp()
    }
}