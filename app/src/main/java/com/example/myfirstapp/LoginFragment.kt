package com.example.myfirstapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_connexion).setOnClickListener {

            // Get text view values
            val emailFromTextView    = view.findViewById<TextView>(R.id.editTextTextEmailAddress)
            val passwordFromTextView = view.findViewById<TextView>(R.id.editTextTextPassword)

            // Get value of text views and convert it to strings.
            val emailString    = emailFromTextView.text.toString()
            val passwordString = passwordFromTextView.text.toString()

            var emailValue    = "j.doe@gmail.com";
            var passwordValue = "123456";

            // Condition to log in
            if(emailString == emailValue && passwordString == passwordValue) {
                println("email: ${emailString}")
                println("password: ${passwordString}")
                findNavController().navigate(R.id.action_LoginFragment_to_DashboardFragment)
            } else {
                val myToast = Toast.makeText(context, "Email ou mot de passe incorrect", Toast.LENGTH_SHORT)
                myToast.show()
            }
        }
    }

}