package com.example.contactsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class addContact : AppCompatActivity() {
    var etName: EditText? = null
    var etPhoneNumber: EditText? = null
    var etEmail: EditText? = null
    var btnSave:  Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_contact)
        etName = findViewById(R.id.et_name);
        etPhoneNumber = findViewById(R.id.etnumber);
        etEmail = findViewById(R.id.et_email);
        btnSave = findViewById (R.id.btn_save)

        btnSave?.setOnClickListener {
            saveContact()
        }

    }
    private fun saveContact() {
        val name = etName?.text.toString().trim()
        val phoneNumber = etPhoneNumber?.text.toString().trim()
        val email = etEmail?.text.toString().trim()

        if (name.isEmpty()) {
            Toast.makeText(this, "Please enter a name", Toast.LENGTH_SHORT).show()
            return
        }
        val contact = Contact(name, phoneNumber, email)
        val databaseHelper = DatabaseHelper(this)
        val isContactSaved = databaseHelper.saveContact(contact)
        if (isContactSaved) {
            Toast.makeText(this, "Contact saved successfully", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ContactsListActivity::class.java)
            startActivity(intent)
            finish()}
            Toast.makeText(this, "Contact saved successfully", Toast.LENGTH_SHORT).show()

        finish()
    }
}

class DatabaseHelper(addContact: addContact) {
    fun saveContact(contact: Contact): Boolean {
     return true
    }
}

class ContactsListActivity {

}

class Contact(name: String, phoneNumber: String, email: String) {

}

