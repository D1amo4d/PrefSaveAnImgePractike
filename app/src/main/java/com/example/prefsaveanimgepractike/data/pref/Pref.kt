package com.example.prefsaveanimgepractike.data.pref

import android.content.Context
import android.net.Uri

class Pref(context: Context) {
    private val preferences =
        context.getSharedPreferences(PREF_SAVE_IMEGE_KEY, Context.MODE_PRIVATE)

    

    companion object {
        const val PREF_SAVE_IMEGE_KEY = "pref.save.imge.key"
    }
}