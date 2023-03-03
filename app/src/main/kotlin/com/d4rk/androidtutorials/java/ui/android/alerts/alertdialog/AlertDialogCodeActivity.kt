@file:Suppress("DEPRECATION")
package com.d4rk.androidtutorials.java.ui.android.alerts.alertdialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.d4rk.androidtutorials.java.R
import com.d4rk.androidtutorials.java.ui.android.alerts.alertdialog.tabs.AlertDialogTabCodeFragment
import com.d4rk.androidtutorials.java.ui.android.alerts.alertdialog.tabs.AlertDialogTabLayoutFragment
import com.google.android.material.tabs.TabLayout
class AlertDialogCodeActivity: AppCompatActivity() {
    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)
        tabLayout = findViewById(R.id.tabs)
        viewPager = findViewById(R.id.viewpager)
        setupViewPager()
        tabLayout.setupWithViewPager(viewPager)
    }
    private fun setupViewPager() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(AlertDialogTabCodeFragment(), getString(R.string.code_java))
        adapter.addFragment(AlertDialogTabLayoutFragment(), getString(R.string.layout_xml))
        viewPager.adapter = adapter
    }
    internal inner class ViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        private val mFragmentList = ArrayList<Fragment>()
        private val mFragmentTitleList = ArrayList<String>()
        override fun getItem(position: Int): Fragment {
            return mFragmentList[position]
        }
        override fun getCount(): Int {
            return mFragmentList.size
        }
        fun addFragment(fragment: Fragment, title: String) {
            mFragmentList.add(fragment)
            mFragmentTitleList.add(title)
        }
        override fun getPageTitle(position: Int): CharSequence {
            return mFragmentTitleList[position]
        }
    }
}
