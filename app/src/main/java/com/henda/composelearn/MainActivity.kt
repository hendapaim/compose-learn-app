package com.henda.composelearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomAppBar
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.henda.composelearn.ui.theme.ComposeLearnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLearnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column{
        ImageTopScreen()
        TitleText()
        SubTitleText()
        ContentText()
        Box(Modifier.fillMaxHeight(),contentAlignment = Alignment.BottomStart) {
            BottomAppBar {
                Text(
                    text = stringResource(R.string.app_name),
                    Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    style = MaterialTheme.typography.h5,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun ImageTopScreen() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        Modifier
            .fillMaxWidth()
            .height(180.dp),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun TitleText() {
    Text(
        text = stringResource(R.string.title_text),
        Modifier.padding(16.dp),
        fontSize = 24.sp
    )
}

@Composable
fun SubTitleText() {
    Text(
        text = stringResource(R.string.sub_title_text),
        Modifier.padding(start = 16.dp, end = 16.dp),
        textAlign = TextAlign.Justify
    )
}

@Composable
fun ContentText() {
    Text(
        text = stringResource(R.string.content_text),
        Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeLearnTheme {
        App()
    }
}

@Preview(showBackground = true)
@Composable
fun ImageToScreen() {
    ImageTopScreen()
}