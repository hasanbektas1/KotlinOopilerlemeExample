package com.hasanbektas.oopilerleme

import android.content.Context
import android.widget.Toast

class Ship : IGoesable {

    var make: String = ""

    constructor(make: String) {
        this.make = make
    }

    override fun Go(context: Context) {
        Toast.makeText(context, "I goes with my engine", Toast.LENGTH_SHORT).show()
    }
}