package my.com.mdr_tech.hmlet

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IdRes
import android.util.Log
import com.roughike.bottombar.OnTabSelectListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import my.com.mdr_tech.hmlet.Adapter.CustomPager
import my.com.mdr_tech.hmlet.Tab_Fragment.*
import org.jetbrains.annotations.Nullable
import java.io.File
import javax.xml.transform.Templates

class MainActivity : AppCompatActivity() {

    var pagerAdapter: CustomPager?=null

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pagerAdapter = CustomPager(supportFragmentManager)
        pagerAdapter!!.addFragments(HomeFragment(), "Home")
        pagerAdapter!!.addFragments(FlatmatesFragment(), "Flatmates")
        pagerAdapter!!.addFragments(EventFragment(), "Events")
        pagerAdapter!!.addFragments(ServiceFragment(), "Services")
        pagerAdapter!!.addFragments(YouFragment(),"You")

        viewPager.adapter = pagerAdapter
        tabs.setupWithViewPager(viewPager)
        setupTabIcons()
    }

    private fun setupTabIcons() {
        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_home)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_flatmates)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_event)
        tabs.getTabAt(3)!!.setIcon(R.drawable.ic_services)
        tabs.getTabAt(4)!!.setIcon(R.drawable.ic_you)
    }
}
