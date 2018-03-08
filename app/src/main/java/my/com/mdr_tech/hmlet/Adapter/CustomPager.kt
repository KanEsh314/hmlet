package my.com.mdr_tech.hmlet.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by iTrain on 08-Mar-18.
 */

class CustomPager(fm: FragmentManager):FragmentPagerAdapter(fm){

    var mFragmentItems: ArrayList<Fragment> = ArrayList()
    var mFragmentTitle: ArrayList<String> = ArrayList()

    fun addFragments(fragment: Fragment, fragmentTitle: String){
        mFragmentItems.add(fragment)
        mFragmentTitle.add(fragmentTitle)
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentItems[position]
    }

    override fun getCount(): Int {
        return mFragmentItems.count()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitle[position]
    }
}