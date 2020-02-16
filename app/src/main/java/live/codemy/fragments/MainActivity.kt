package live.codemy.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        "onCreate" logError MainActivity::class.java.name

        val isShowFooterFragment = intent.getBooleanExtra("isShowFooterFragment", false)

//        if(isShowFooterFragment){
//            val footerFragment = FooterFragment()
//            supportFragmentManager
//                .beginTransaction()
//                .add(R.id.footerFragmentContainer, footerFragment)
//                .commit()
//        }

        txtHeader.setOnClickListener {

            val footerFragment = FooterFragment()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.footerFragmentContainer, footerFragment)
                .commit()
        }
    }

    override fun onStart() {
        super.onStart()

        "onStart" logError MainActivity::class.java.name
    }

    override fun onResume() {
        super.onResume()

        "onResume" logError MainActivity::class.java.name
    }

    override fun onStop() {
        super.onStop()

        "onStop" logError MainActivity::class.java.name
    }

    override fun onPause() {
        super.onPause()

        "onPause" logError MainActivity::class.java.name
    }

    override fun onDestroy() {
        super.onDestroy()

        "onDestroy" logError MainActivity::class.java.name
    }

    override fun onRestart() {
        super.onRestart()

        "onRestart" logError MainActivity::class.java.name
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        "onSaveInstanceState" logError MainActivity::class.java.name
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        "onRestoreInstanceState" logError MainActivity::class.java.name
    }

    override fun onBackPressed() {
        super.onBackPressed()

        "onBackPressed" logError MainActivity::class.java.name
    }

    override fun onUserInteraction() {
        super.onUserInteraction()

        "onUserInteraction" logError MainActivity::class.java.name
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()

        "onUserLeaveHint" logError MainActivity::class.java.name
    }
}
