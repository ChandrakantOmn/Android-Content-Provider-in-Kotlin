package com.omniwyse.androidcontentproviderinkotlin

import android.net.Uri


/**
 * Created by Chandra Kant on 4/3/19.
 */
class Contract  {
    companion object {
        val AUTHORITY  =     "com.omniwyse.androidcontentproviderinkotlin.provider"
        val CONTENT_PATH = "sentence"
        val CONTENT_URI = Uri.parse("content://$AUTHORITY/$CONTENT_PATH")
        val ALL_ITEMS = -2
        val WORD_ID = "id"
    }
}