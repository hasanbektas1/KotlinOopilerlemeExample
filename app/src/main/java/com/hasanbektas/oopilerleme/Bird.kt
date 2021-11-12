package com.hasanbektas.oopilerleme

import android.content.Context
import android.widget.Toast

class Bird : Bio, IGoesable {
    var type: String = ""

    constructor(type: String, age: Int, fullName: String) {
        this.type = type
        this.age = age
        this.fullName = fullName
    }

    override fun Go(context: Context) {
        Toast.makeText(context, "I goes with my wings", Toast.LENGTH_SHORT).show()
    }
}