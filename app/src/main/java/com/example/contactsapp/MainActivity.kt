package com.example.contactsapp

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

    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }


    fun displayContacts(){
        val contact1= Contacts("clever","kaity@gmail.com","+250783546","")
        val contact2= Contacts("rwiza","rwiza@gmail.com","+23445767","")
        val contact3= Contacts("Rebecca","Rebecca@gmail.com","2345","")
        val contact4= Contacts("Mideva","Mideva@gmail.com","23456","")
        val contact5= Contacts("Mideva","Mideva@gmail.com","23456","")
        val contact6= Contacts("Mideva","Mideva@gmail.com","23456","")
        val contact7= Contacts("Mideva","Mideva@gmail.com","23456","")
        val contact8= Contacts("Mideva","Mideva@gmail.com","23456","")
        val contact9= Contacts("Mideva","Mideva@gmail.com","23456","")
        val contact10= Contacts("Mideva","Mideva@gmail.com","23456","")

        val listofcontacts = listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,
        contact9,contact10)
        val contadapter= contactadapter(listofcontacts)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)
        binding.rvContacts.adapter= contadapter
    }

}