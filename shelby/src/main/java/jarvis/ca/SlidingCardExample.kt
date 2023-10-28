package jarvis.ca

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay


@Composable
fun SlidingCardExample(
    isVisible: Boolean,
    toggleVisibility: () -> Unit,
    displayTime: DisplayTime = DisplayTime.Medium,
    backgroundColor: Color = Color.White,
    textColor: Color = Color.Black,
    fontSize: Int = 15
) {
    val offsetY by animateDpAsState(
        targetValue = if (isVisible) 0.dp else -200.dp,
        animationSpec = tween(300), label = ""
    )

    LaunchedEffect(isVisible) {
        if (isVisible) {
            delay(displayTime.time)
            toggleVisibility()
        }
    }

    AnimatedVisibility(
        visible = isVisible,
        enter = slideInVertically(initialOffsetY = { -600 }),
        exit = slideOutVertically(targetOffsetY = { -200 })
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp)
        ) {
            Card(
                modifier = Modifier
                    .offset(y = offsetY)
                    .padding(top = 8.dp)
                    .clip(shape = RoundedCornerShape(corner = CornerSize(8.dp)))
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(backgroundColor)
            ) {
                Text(
                    text = "I'm a sliding card!",
                    modifier = Modifier.padding(16.dp),
                    color = textColor,
                    style = TextStyle(
                        fontSize = fontSize.sp
                    ),
                )
            }
        }
    }
}
