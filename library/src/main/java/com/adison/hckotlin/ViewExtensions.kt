package com.adison.hckotlin

import android.view.View

/**
 * 设置view visibility属性是gone还是visible
 * <p/>
 * 如果view visibility当前属性是invisible，该方法无效
 * @param gone
 */
fun View.gone(gone:Boolean){
    when(gone){
        true -> if (visibility!=View.GONE){visibility=View.GONE }
        false -> if (visibility!=View.VISIBLE){visibility=View.VISIBLE }
    }
}

/**
 * 设置view visibility属性是invisible还是visible
 * <p/>
 * 如果view visibility当前属性是gone，该方法无效
 * @param invisible
 */
fun View.invisible(invisible:Boolean){
    when(invisible){
        true -> if (visibility!=View.INVISIBLE){visibility=View.INVISIBLE }
        false -> if (visibility!=View.VISIBLE){visibility=View.VISIBLE }
    }
}
