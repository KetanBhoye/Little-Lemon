package com.example.littlelemon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.littlelemon.Data.DishRepository

@Composable
fun DishDetails(id: Int) {
    val dish = requireNotNull(DishRepository.getDish(id))

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = dish.imageResource),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = dish.name,
                style = MaterialTheme.typography.h4,
                color = MaterialTheme.colors.primary
            )
            Text(
                text = dish.description,
                style = MaterialTheme.typography.body1,
                color = Color.Gray
            )
            Text(
                text = "Price: ${dish.price}",
                style = MaterialTheme.typography.h6,
                color = MaterialTheme.colors.secondary
            )
            Counter()
        }
    }
}

@Composable
fun Counter() {
    var counter by remember {
        mutableStateOf(1)
    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        IconButton(
            onClick = {
                if (counter > 1) counter--
            }
        ) {
            Icon(
                imageVector = Icons.Default.Clear,
                contentDescription = null,
                tint = MaterialTheme.colors.secondary
            )
        }
        Text(
            text = counter.toString(),
            style = MaterialTheme.typography.h5,
            color = MaterialTheme.colors.onSurface
        )
        IconButton(
            onClick = {
                counter++
            }
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null,
                tint = MaterialTheme.colors.secondary
            )
        }
    }
}

@Preview
@Composable
fun DishDetailsPreview() {
    MaterialTheme {
        DishDetails(id = 1)
    }
}
