package com.blackcoffer.netclan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PersonalFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_personal, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Set the LayoutManager that
        // this RecyclerView will use.
        val recyclerView: RecyclerView =view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // adapter instance is set to the
        val adapter =
            RecyclerViewAdapter(MockList.getModel() as ArrayList<Model>)
        // recyclerview to inflate the items.
        recyclerView.adapter = adapter

    }

    }