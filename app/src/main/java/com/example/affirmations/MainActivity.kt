package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    val myDataset = Datasource.loadAffirmations()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(findViewById<RecyclerView>(R.id.recycler_view)) {
            adapter = ItemAdapter(context, myDataset)
            setHasFixedSize(true)
        }
    }
}