package com.example.contactsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactsapp.databinding.ActivityMainBinding
import com.example.contactsapp.databinding.ContactlistBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ivadd.setOnClickListener { var intent= Intent(this, addContact::class.java)
        startActivity(intent)}

    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }


    fun displayContacts(){
        val contact1= Contacts("clever","kaity@gmail.com","+250783546","https://images.unsplash.com/photo-1560250097-0b93528c311a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMGltYWdlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact2= Contacts("rwiza","rwiza@gmail.com","+23445767","https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8cHJvZmlsZSUyMGltYWdlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact3= Contacts("Rebecca","Rebecca@gmail.com","2345","https://images.unsplash.com/photo-1517841905240-472988babdf9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8cHJvZmlsZSUyMGltYWdlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact4= Contacts("Mideva","Mideva@gmail.com","23456","https://images.unsplash.com/photo-1619539465730-fea9ebf950f8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fHByb2ZpbGUlMjBpbWFnZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val contact5= Contacts("Mideva","Mideva@gmail.com","23456","https://images.unsplash.com/photo-1519085360753-af0119f7cbe7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80")
        val contact6= Contacts("Mideva","Mideva@gmail.com","23456","https://images.unsplash.com/photo-1631269338881-f4b7b636222a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80")
        val contact7= Contacts("Mideva","Mideva@gmail.com","23456","https://images.unsplash.com/photo-1487412720507-e7ab37603c6f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjl8fHByb2ZpbGUlMjBpbWFnZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val contact8= Contacts("Mideva","Mideva@gmail.com","23456","https://images.unsplash.com/photo-1543610892-0b1f7e6d8ac1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80")
        val contact9= Contacts("Mideva","Mideva@gmail.com","23456","")
        val contact10= Contacts("Mideva","Mideva@gmail.com","23456","")

        val listofcontacts = listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,
        contact9,contact10)
        val contadapter= contactadapter(listofcontacts)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)
        binding.rvContacts.adapter= contadapter
    }

}