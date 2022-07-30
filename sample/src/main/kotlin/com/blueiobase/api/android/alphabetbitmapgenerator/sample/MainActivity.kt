package com.blueiobase.api.android.alphabetbitmapgenerator.sample

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.blueiobase.api.android.alphabetbitmapgenerator.AlphabetBitmapGenerator

class MainActivity : AppCompatActivity() {

    private lateinit var alphabetBitmapGenerator: AlphabetBitmapGenerator
    private lateinit var secondAlphabetBitmapGenerator: AlphabetBitmapGenerator

    private val listOfNames = listOf(
        "*123#", "*232#", "*406*", "*556#", "*901#",
        "Adeola", "Bimbo", "Chisom", "David", "Eberechukwu",
        "Favour", "Gabriel", "Habakkuk", "Ijeoma", "Junior", "Kelechi",
        "Larry", "Mary", "Nachi", "Onyinye", "Praise", "Queen", "Rejoice",
        "Somtochukwu", "Titi", "Ugochukwu", "Vivian", "William", "Xavier",
        "Yemisi","Zainab"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alphabetBitmapGenerator = AlphabetBitmapGenerator(this)
        secondAlphabetBitmapGenerator = AlphabetBitmapGenerator(this)
        secondAlphabetBitmapGenerator.apply {
            setDimension(100)
            alphabetTextColor = Color.WHITE
        }

        val recyclerView = findViewById<RecyclerView>(R.id.main_recyclerview)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MainRecyclerViewAdapter()
        }

        val secondaryRecyclerView = findViewById<RecyclerView>(R.id.secondary_recyclerview)
        secondaryRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = SecondaryRecyclerViewAdapter()
        }

    }

    inner class MainRecyclerViewAdapter: RecyclerView.Adapter<MainRecyclerViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecyclerViewHolder {
            val view = this@MainActivity.layoutInflater.inflate(R.layout.contact_item, parent, false)
            return MainRecyclerViewHolder(view)
        }

        override fun onBindViewHolder(holder: MainRecyclerViewHolder, position: Int) {
            val name = listOfNames[position]

            holder.apply {
                nameTextView.text = name
                imageView.setImageBitmap(alphabetBitmapGenerator.generateAlphabetBitmap(name, null)
                )

            }
        }

        override fun getItemCount() = listOfNames.size


    }

    inner class SecondaryRecyclerViewAdapter: RecyclerView.Adapter<MainRecyclerViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecyclerViewHolder {
            val view = this@MainActivity.layoutInflater.inflate(R.layout.contact_item, parent, false)
            return MainRecyclerViewHolder(view)
        }

        override fun onBindViewHolder(holder: MainRecyclerViewHolder, position: Int) {
            val name = listOfNames[position]

            holder.apply {
                nameTextView.text = name
                imageView.setImageBitmap(secondAlphabetBitmapGenerator.generateCircularAlphabetBitmap(name, 0F, null))

            }
        }

        override fun getItemCount() = listOfNames.size


    }

    inner class MainRecyclerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.contact_imageview)
        val nameTextView: TextView = itemView.findViewById(R.id.contact_name_textview)
    }

}