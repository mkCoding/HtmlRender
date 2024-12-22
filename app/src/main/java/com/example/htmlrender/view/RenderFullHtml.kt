package com.example.htmlrender.view

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun RenderFullHTML(){
    RenderHtmlInCompose()

}

@Composable
fun RenderHtmlInCompose() {
    val htmlContent ="""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Collapsible Text Example</title>
        <style>
            .collapsible {
                background-color: #d3d3d3;
                color: black;
                cursor: pointer;
                padding: 10px;
                width: 100%;
                border: none;
                text-align: left;
                outline: none;
                font-size: 16px;
                border-radius: 5px;
                margin-bottom: 5px;
            }
            .active,
            .collapsible:hover {
                background-color: #d3d3d3;
            }
            .content {
                padding: 0 18px;
                display: none;
                overflow: hidden;
                background-color: white;
                margin-bottom: 10px;
            }
        </style>
    </head>
    <body>
        <button class="collapsible">Potential Program Incentives</button>
        <div class="content">
            <p style="margin: 0in; font-family: Karla; font-size: 9pt; color: #343430;"><span style="font-weight: bold;">Smart Charge Management&nbsp;</span></p>
            <p style="margin: 0in; font-family: Karla; font-size: 9pt; color: #343430;">-Earn up to ${'$'}120 per year with ${'$'}10 monthly bill credits for charging during &ldquo;smart&rdquo; times!</p>
            <p style="margin: 0in; font-family: Karla; font-size: 9pt; color: #343430;"><span style="font-weight: bold;">Vehicle Charging Time of Use Rate</span></p>
            <p style="margin: 0in; font-family: Karla; font-size: 9pt; color: #343430;">-Typical participants can save over ${'$'}120 a year!</p>
        </div>
        <button class="collapsible">More Information</button>
        <div class="content">
            <p style="margin: 0in; font-family: Karla; font-size: 9pt; color: #343430;"><span style="font-weight: bold;">Smart Charge Management&nbsp;</span></p>
            <p style="margin: 0in; font-family: Karla; font-size: 9pt; color: #343430;">
                -Sign up for Automatic Smart Charging to save on charging costs and support the grid by avoiding high-demand periods for electricity. No need to remember off-peak rates and times. Learn more about Smart Charge Management.
            </p>
            <p style="margin: 0in; font-family: Karla; font-size: 9pt; color: #343430;">-Gain access to insights like your home charging costs.</p>
            <p style="margin: 0in; font-family: Karla; font-size: 9pt; color: #343430;">Register right here in your Toyota App. You&rsquo;ll receive an email to access your personalized dashboard from our partner, WeaveGrid.&nbsp;</p>
            <p style="margin: 0in; font-family: Karla; font-size: 9pt; color: #343430;"><span style="font-weight: bold;">Vehicle Charging Time of Use Rate</span></p>
            <p style="margin: 0in; font-family: Karla; font-size: 9pt; color: #343430;">-Charge your EV on a time-of-use rate while the rest of your house remains on a standard electric rate.</p>
            <p style="margin: 0in; font-family: Karla; font-size: 9pt; color: #343430;">-Gain access to cheaper EV home charging at off-peak times (nights and weekends).&nbsp;</p>
            <p style="margin: 0in; font-family: Karla; font-size: 9pt; color: #343430;">-Receive personalized insights into your home charging costs.</p>
            <p style="margin: 0in; font-family: Karla; font-size: 9pt;">
                <span style="color: #343430;">Get more information, check your eligibility&nbsp;</span>
                <a
                    href="https://urldefense.com/v3/__https:/www.bge.com/smart-energy/innovation-technology/electric-vehicles/ev-tou-rate?_ga=2.104446528.1357852953.1718663240-1245655654.1718663237__;!!B-Wf7dNC-A!5PQrPKbB-mB5B2vRRSOpOgeH3mmFoHyfy3X1dpOa0NArSfIOndCZqQAxxxwUbgzRFIl1TVDypPTidzbRE5ldNJuCMqpOfEXQeM2yAEY${'$'}"
                >
                    here
                </a>
            </p>
        </div>
        <button class="collapsible">Questions</button>
        <div class="content">
            <p style="margin: 0in; font-family: Karla; font-size: 9pt;">
                <span style="color: #343430;">For more information please visit the&nbsp;</span>
                <a href="https://urldefense.com/v3/__https:/bge-support.weavegrid.com/hc/en-us/sections/23545365504535__;!!B-Wf7dNC-A!5PQrPKbB-mB5B2vRRSOpOgeH3mmFoHyfy3X1dpOa0NArSfIOndCZqQAxxxwUbgzRFIl1TVDypPTidzbRE5ldNJuCMqpOfEXQct82FFo${'$'}">
                    Smart Charge Management FAQ
                </a>
                <span style="color: #343430;">,&nbsp;</span>
                <a
                    href="https://urldefense.com/v3/__https:/www.bge.com/smart-energy/innovation-technology/electric-vehicles/ev-tou-rate?_ga=2.104446528.1357852953.1718663240-1245655654.1718663237__;!!B-Wf7dNC-A!5PQrPKbB-mB5B2vRRSOpOgeH3mmFoHyfy3X1dpOa0NArSfIOndCZqQAxxxwUbgzRFIl1TVDypPTidzbRE5ldNJuCMqpOfEXQeM2yAEY${'$'}"
                >
                    Vehicle Charging Time of Use Rate details
                </a>
                <span style="color: #343430;">, or email&nbsp;</span><a href="mailto:bge-support@weavegrid.com">bge-support@weavegrid.com</a><span style="color: #343430;">.</span>
            </p>
        </div>
        <script>
            const coll = document.getElementsByClassName("collapsible");
            for (let i = 0; i < coll.length; i++) {
                coll[i].addEventListener("click", function () {
                    this.classList.toggle("active");
                    const content = this.nextElementSibling;
                    if (content.style.display === "block") {
                        content.style.display = "none";
                    } else {
                        content.style.display = "block";
                    }
                });
            }
        </script>
    </body>
</html>

""".trimIndent()

    // AndroidView wraps the WebView for Compose
    AndroidView(factory = { context ->
        WebView(context).apply {
            settings.javaScriptEnabled = true // Enable JavaScript
            webViewClient = WebViewClient() // Handle navigation
            loadDataWithBaseURL(null, htmlContent, "text/html", "UTF-8", null)
        }
    })
}

@Composable
@Preview(showBackground = true)
fun PreviewRenderFullHTML(){
    RenderFullHTML()
}
