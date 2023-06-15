package com.blackcoffer.netclan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.viewpager2.widget.ViewPager2
import com.blackcoffer.netclan.databinding.ActivityHomeBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentAdapter = ExplorePagerAdapter(this)
        binding.viewpagerMain.adapter= fragmentAdapter

       // binding.tabsMain.setupWithViewPager(binding.viewpagerMain)
        TabLayoutMediator( binding.tabsMain, binding.viewpagerMain) { tab, position ->
           // binding.viewpagerMain.setCurrentItem(tab.position, true)
            if (position == 0)
                tab.text = "Personal"
            else if(position == 1)
                tab.text = "Business"
            else
                tab.text = "Merchant"
        }.attach()

        binding.imgRefine.setOnClickListener {
            val intent = Intent(this, RefineActivity::class.java)
            startActivity(intent)
        }

        binding.tabsMain.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                val position = tab.position
                binding.viewpagerMain.visibility = View.VISIBLE
                binding.framelayout.visibility = View.GONE
                binding.viewpagerMain.currentItem = position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {
                binding.viewpagerMain.visibility = View.GONE
                binding.framelayout.visibility = View.VISIBLE
            }
        })

        binding.viewpagerMain.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }

            override fun onPageSelected(position: Int) {
                when (position) {
                    0-> {

                    }
                    1-> {

                    }
                    2-> {

                    }
                }
                super.onPageSelected(position)
            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
            }
        })

        binding.bottomNavigationView.setOnItemSelectedListener {
         //   Log.e("postion:","${it.title}")
            binding.framelayout.visibility = View.VISIBLE
            binding.viewpagerMain.visibility = View.GONE
            when (it.itemId) {
                R.id.bottom_explore -> {
                    binding.framelayout.visibility = View.GONE
                    binding.viewpagerMain.visibility = View.VISIBLE
                    binding.tabsMain.visibility = View.VISIBLE
                    loadFragment(ExploreFragment())
                    true
                }
                R.id.bottom_network -> {
                    binding.tabsMain.visibility = View.GONE
                    loadFragment(NetworkFragment())
                    true
                }
                R.id.bottom_chat -> {
                    binding.tabsMain.visibility = View.GONE
                    loadFragment(ChatFragment())
                    true
                }
                R.id.bottom_contact -> {
                    binding.tabsMain.visibility = View.GONE
                    loadFragment(ContactsFragment())
                    true
                }
                else -> {
                    binding.tabsMain.visibility = View.GONE
                    loadFragment(GroupsFragment())
                    true
                }



            }
        }


    }

    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.framelayout,fragment)
        transaction.commit()
    }
}

