package com.example.htmlrender.view

import android.text.method.LinkMovementMethod
import android.view.ViewGroup
import android.widget.TextView
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.text.HtmlCompat

@Composable
fun HTMLDisplayScreen() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .padding(top = 160.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val context = LocalContext.current

        //Option #1
        // Get the HTML string from resources
        val bulletPointsSampleAPIHTMLRaw = """ <ul>
            <li> &nbsp;A ${'$'}50 incentive payment for enrollment </li>
            <li> &nbsp;Additional seasonal bill credits for participating</li>
            <li>&nbsp;Access to charging cost and insights</li>
       </ul>"""

        val moreInformationSampleAPIHTMLRaw = """ 
            <p>Get more information, check your eligibility&nbsp;
                <a href="https:/www.bge.com/smart-energy/innovation-technology/electric-vehicles/ev-tou-rate">
                    here
                </a>
            </p>"""

        val questionsSampleAPIHTMLRaw = """ <p>
            For any questions about your participating utility's managed charging program, please email WeaveGrid at <a href="mailto:bge-support@weavegrid.com">bge-support@weavegrid.com</a>.
    </p>"""

        HtmlText(
            html = bulletPointsSampleAPIHTMLRaw,
            modifier = Modifier.wrapContentSize(),
            color = Color.Black
        )
        HtmlText(
            html = moreInformationSampleAPIHTMLRaw,
            modifier = Modifier
                .padding(top = 30.dp)
                .width(300.dp),
            color = Color.Black
        )
        HtmlText(
            html = questionsSampleAPIHTMLRaw,
            modifier = Modifier
                .padding(top = 30.dp)
                .width(300.dp),
            color = Color.Black
        )


    }
}


@Composable
fun HtmlText(html: String, modifier: Modifier = Modifier, color: Color) {
    AndroidView(
        modifier = modifier,
        factory = { context ->
            TextView(context).apply {
                // Enable links and allow them to be clickable
                linksClickable = true
                isClickable = true
                movementMethod = LinkMovementMethod.getInstance()

                setPadding(0, 0, 0, 0)
                // Set TextView layout params for wrap content
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
            }
        },
        update = {
            it.setTextColor(color.toArgb())
            it.text = HtmlCompat.fromHtml(html, HtmlCompat.FROM_HTML_MODE_COMPACT)
            it.setLinkTextColor(Color.Blue.hashCode()) // Set hyperlink color to red
        }
    )
}


@Composable
@Preview(showBackground = true)
fun PreviewHTMLDisplayScreen() {
    HTMLDisplayScreen()
}