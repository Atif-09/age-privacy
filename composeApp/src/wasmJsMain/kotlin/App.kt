import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradient
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        val greeting = remember { Greeting().greet() }
        val scroll = rememberScrollState(0)
        val gradient = Brush.horizontalGradient(
            colors = listOf(
                Color(0xFF155d93),
                Color(0xFF156888),
                Color(0xFF15727e),
                Color(0xFF157f71),
                Color(0xFF158867),
                Color(0xFF15935c)
            )
        )
        Column(modifier = Modifier.fillMaxSize()) {
            Box(Modifier.fillMaxWidth().fillMaxHeight(0.3f).background(gradient)) {
                Column(modifier = Modifier.align(Alignment.Center)) {
                    Text(
                        "Privacy Policy",
                        fontSize = 36.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        "Age Master - Privacy Policy",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(top = 12.dp)
                    )
                }
            }
            Box(
                modifier = Modifier.fillMaxWidth().padding(top = 12.dp).verticalScroll(
                    rememberScrollState()
                )
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(0.5f).align(Alignment.Center),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text(
                        "Privacy",
                        color = Color(0xFF606c71),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    Text(
                        "Abma Tech build the Age Calculator app as a Free app. This SERVICE is provided by Abma Tech at no cost and is intended for use as is.\n" +
                                "\n" +
                                "This page is used to inform visitors regarding our policies with the collection and disclosure of Personal Information if anyone decided to use our Service.\n" +
                                "\n" +
                                "If you choose to use our Service, then you agree to the collection and use of information in relation to this policy. The Personal Information that we collect is used for providing and improving the Service. we will not use or share your information with anyone except as described in this Privacy Policy.\n" +
                                "\n" +
                                "The terms used in this Privacy Policy have the same meanings as in our Terms and Conditions, which is accessible at Age Calculator unless otherwise defined in this Privacy Policy.",
                    color = Color(0xFF606c71)
                        )

                    Text(
                        "Information Collection and Use",
                        color = Color(0xFF606c71),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )

                    Text(
                        "For a better experience, while using our Service, we may require you to provide us with certain personally identifiable information, including but not limited to Age, Date of Birth, Calculator, App. The information that we request will not be collected nor shared with anyone."
                        , color = Color(0xFF606c71)
                    )

                    Text(
                        "Changes to This Privacy Policy",
                        color = Color(0xFF606c71),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    Text(
                        "we may update our Privacy Policy from time to time. Thus, you are advised to review this page periodically for any changes. we will notify you of any changes by posting the new Privacy Policy on this page.\n" +
                                "\n" +
                                "This policy is effective as of 2024-02-14",
                        color = Color(0xFF606c71)
                    )
                    Text("")


                }
            }


        }

    }
}