package com.example.countryapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.countryapp.R
import com.example.countryapp.model.Country

class CountryAdapter(val countryList: ArrayList<Country>) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>(),
    CountryClickListener
{

    class CountryViewHolder(val view:ItemC) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = DataBindingUtil.inflate<ItemCountryBinding>(LayoutInflater.from(parent.context),
            R.layout.item_country,parent,false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.view.country = countryList.get(position)

        holder.itemView.setOnClickListener {
            val selectedCountry = countryList.get(position)
            val action = FeedFragmentDirections.actionFeedFragmentToCountryFragment(selectedCountry)
            Navigation.findNavController(it).navigate(action)

        }


    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onCountryClicked(v: View) {
        println("tıklandı")

    }
}