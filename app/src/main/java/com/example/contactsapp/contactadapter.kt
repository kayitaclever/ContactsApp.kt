package com.example.contactsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsapp.databinding.ContactlistBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class contactadapter(var contactsList: List<Contacts>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding =
            ContactlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact= contactsList.get(position)
        var binding=holder.binding
        binding.tvname.text= currentContact.name
        binding.tvemail.text= currentContact.email
        binding.tvnumber.text= currentContact.number
        val into = Picasso
            .get()
            .load(currentContact.person)
//            .resize(80, 80)
            .error(R.drawable.baseline_person_24)


//            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.ivContact)

    }

    override fun getItemCount(): Int {
       return contactsList.size
    }
}

class ContactViewHolder(var binding: ContactlistBinding):RecyclerView.ViewHolder(binding.root)