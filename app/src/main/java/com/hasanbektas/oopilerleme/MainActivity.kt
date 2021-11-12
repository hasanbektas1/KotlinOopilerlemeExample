package com.hasanbektas.oopilerleme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hasanbektas.oopilerleme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var human = Human("Hasan Bektaş", 26, "+Android Developer+")
    var bird = Bird("Papağan", 3, "Ciki")
    var ship = Ship("Mazu 82")

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun human(view: View) {

        human.Go(this)

        binding.textView.text =
            "FullName: ${human.fullName}" + "\n" + "Age: ${human.age}" + "\n" + "Occupation: ${human.occupation}"

    }

    fun bird(view: View) {

        bird.Go(this)

        binding.textView.text =
            "Type: ${bird.type}" + "\n" + "Age: ${bird.age}" + "\n" + "Name: ${bird.fullName}"

    }

    fun ship(view: View) {

        ship.Go(this)

        binding.textView.text = "Make: ${ship.make}"

    }


}