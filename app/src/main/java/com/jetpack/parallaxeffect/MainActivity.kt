package com.jetpack.parallaxeffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.IntOffset
import com.jetpack.parallaxeffect.ui.theme.FABColor
import com.jetpack.parallaxeffect.ui.theme.ParallaxEffectTheme
import kotlin.math.max

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scrollState = rememberScrollState()
            ParallaxEffectTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold(
                        floatingActionButton = {
                            FloatingActionButton(onClick = { /*TODO*/ },
                                modifier = Modifier
                                    .offset {
                                        IntOffset(
                                            x = 0,
                                            y = max(15, scrollState.value)
                                        )
                                    },
                                backgroundColor = FABColor,
                                contentColor = Color.White
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.Add,
                                    contentDescription = "Add",
                                    tint = Color.White
                                )
                            }
                        }
                    ) {
                        ParallaxEffect(scrollState)
                    }
                }
            }
        }
    }
}







