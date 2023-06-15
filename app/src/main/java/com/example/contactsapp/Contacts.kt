package com.example.contactsapp

import android.app.Person
import android.provider.ContactsContract.CommonDataKinds.Email

data class Contacts(
    var name:String,
    var email: String,
    var number:String,
    var person: String
)
