package com.blueiobase.api.android.alphabetbitmapgenerator

import android.content.Context

/**
 * Extension function on a [Context] to create an [AlphabetBitmapGenerator] instance.
 */
fun Context.alphabetBitmapGenerator(init: AlphabetBitmapGenerator.()->Unit): AlphabetBitmapGenerator {
    val abg = AlphabetBitmapGenerator(this)
    abg.init()
    return abg
}