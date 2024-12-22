package com.example.htmlrender.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MarkdownDisplayScreen(){
    Column(
        modifier = Modifier
            .padding(top = 100.dp)
    ) {

        val markdownText = """
        # Title
        ## Subtitle
        **Bold Text**  
        _Italic Text_
        - Item 1
        - Item 2
    """.trimIndent()

    }
}

@Composable
@Preview(showBackground = true)
fun PreviewMarkdownDisplayScreen(){
    MarkdownDisplayScreen()
}