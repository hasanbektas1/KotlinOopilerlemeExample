package com.hasanbektas.oopilerleme

import android.content.Context
import android.widget.Toast

class Human : Bio, IGoesable {
    private var _occupation: String = ""

     var occupation: String
        get() = _occupation.replace('+', ' ')
        set(value) {
            _occupation = "+$value+"
        }

    constructor(fullName: String, age: Int, occupation: String) {
        this.fullName = fullName
        this.age = age
        this.occupation = occupation
    }

    override fun Go(context: Context) {
        Toast.makeText(context, "I am goes with my feet", Toast.LENGTH_SHORT).show()
    }

}