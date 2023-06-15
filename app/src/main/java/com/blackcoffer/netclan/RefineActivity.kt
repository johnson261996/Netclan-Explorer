package com.blackcoffer.netclan



import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.google.android.material.chip.Chip


class RefineActivity: AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refine)
        val languages = resources.getStringArray(R.array.availbilities)
        val coffee_chip = findViewById<Chip>(R.id.chipCoffe)
        val business_chip = findViewById<Chip>(R.id.chipBusiness)
        val hobbies_chip = findViewById<Chip>(R.id.chipHobbies)
        val friend_chip = findViewById<Chip>(R.id.chipFriend)
        val movie_chip = findViewById<Chip>(R.id.chipMovie)
        val dining_chip = findViewById<Chip>(R.id.chipDining)
        val dating_chip = findViewById<Chip>(R.id.chipDating)
        val matrimo_chip = findViewById<Chip>(R.id.chipMatrimony)
        val ed_caption = findViewById<EditText>(R.id.etNote)
        val tv_counter = findViewById<TextView>(R.id.tv_count)
        var toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val spinner = findViewById<Spinner>(R.id.select_speaker_spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, languages
            )
            spinner.adapter = adapter
        }
        spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>,
                                        view: View, position: Int, id: Long) {

            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // write code to perform some action
            }
        }

        ed_caption.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable) {
                tv_counter.setText((0 + s.toString().length).toString() + "/250")
            }
        })

        coffee_chip.setOnClickListener(View.OnClickListener { v ->
            if ((v as Chip).chipBackgroundColor == resources.getColorStateList(
                    R.color.blue_200,
                    null
                )
            ) {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.white, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.blue_200))
            } else {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.blue_200, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.white))

            }
        })

        business_chip.setOnClickListener(View.OnClickListener { v ->
            if ((v as Chip).chipBackgroundColor == resources.getColorStateList(
                    R.color.blue_200,
                    null
                )
            ) {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.white, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.blue_200))
            } else {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.blue_200, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.white))

            }
        })

        hobbies_chip.setOnClickListener(View.OnClickListener { v ->
            if ((v as Chip).chipBackgroundColor == resources.getColorStateList(
                    R.color.blue_200,
                    null
                )
            ) {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.white, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.blue_200))
            } else {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.blue_200, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.white))

            }
        })

        friend_chip.setOnClickListener(View.OnClickListener { v ->
            if ((v as Chip).chipBackgroundColor == resources.getColorStateList(
                    R.color.blue_200,
                    null
                )
            ) {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.white, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.blue_200))
            } else {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.blue_200, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.white))

            }
        })

        movie_chip.setOnClickListener(View.OnClickListener { v ->
            if ((v as Chip).chipBackgroundColor == resources.getColorStateList(
                    R.color.blue_200,
                    null
                )
            ) {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.white, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.blue_200))
            } else {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.blue_200, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.white))

            }
        })

        dining_chip.setOnClickListener(View.OnClickListener { v ->
            if ((v as Chip).chipBackgroundColor == resources.getColorStateList(
                    R.color.blue_200,
                    null
                )
            ) {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.white, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.blue_200))
            } else {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.blue_200, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.white))

            }
        })

        dating_chip.setOnClickListener(View.OnClickListener { v ->
            if ((v as Chip).chipBackgroundColor == resources.getColorStateList(
                    R.color.blue_200,
                    null
                )
            ) {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.white, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.blue_200))
            } else {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.blue_200, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.white))

            }
        })

        matrimo_chip.setOnClickListener(View.OnClickListener { v ->
            if ((v as Chip).chipBackgroundColor == resources.getColorStateList(
                    R.color.blue_200,
                    null
                )
            ) {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.white, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.blue_200))
            } else {
                (v as Chip).chipBackgroundColor =
                    resources.getColorStateList(R.color.blue_200, null)
                (v as Chip).setTextColor(ContextCompat.getColor(applicationContext,R.color.white))

            }
        })
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Log.e("Back OnOption","clicked")
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        return super.onOptionsItemSelected(item)
    }

}