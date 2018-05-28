package app.anta40.com.bandintroapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.cuneytayyildiz.onboarder.OnboarderActivity
import com.cuneytayyildiz.onboarder.utils.OnboarderPageChangeListener
import org.jetbrains.anko.startActivity
import com.cuneytayyildiz.onboarder.OnboarderPage
import java.util.*
import java.util.Arrays.asList



class IntroActivity : OnboarderActivity(), OnboarderPageChangeListener {

    private val TIMEOUT = 1500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val pages = Arrays.asList(
                OnboarderPage.Builder()
                        .title("Cream")
                        .description("The original power trio that started it all")
                        .imageResourceId(R.drawable.cream)
                        .backgroundColor(R.color.white)
                        .titleColor(R.color.light_blue)
                        .descriptionColor(R.color.light_blue)
                        .multilineDescriptionCentered(true)
                        .build(),

                OnboarderPage.Builder()
                        .title("Led Zeppelin")
                        .description("One of the pioneers of hard rock")
                        .imageResourceId(R.drawable.zep)
                        .backgroundColor(R.color.white)
                        .titleColor(R.color.light_blue)
                        .descriptionColor(R.color.light_blue)
                        .multilineDescriptionCentered(true)
                        .build(),

                OnboarderPage.Builder()
                        .title("Pink Floyd")
                        .description("Dark Side of the Moon")
                        .imageResourceId(R.drawable.floyd)
                        .backgroundColor(R.color.white)
                        .titleColor(R.color.light_blue)
                        .descriptionColor(R.color.light_blue)
                        .multilineDescriptionCentered(true)
                        .build(),

                OnboarderPage.Builder()
                        .title("Yes")
                        .description("Close to the Edge")
                        .imageResourceId(R.drawable.yes)
                        .backgroundColor(R.color.white)
                        .titleColor(R.color.light_blue)
                        .descriptionColor(R.color.light_blue)
                        .multilineDescriptionCentered(true)
                        .build()


        )

        setOnboarderPageChangeListener(this)
        setDividerVisibility(View.GONE)

        initOnboardingPages(pages)
    }

    override fun onPageChanged(position: Int) {

    }

    override fun onFinishButtonPressed() {
        loadMainActivity()
    }

    private fun loadMainActivity() {
        Handler().postDelayed({
            startActivity<MainActivity>()
            finish()
        }, TIMEOUT.toLong())
    }
}
