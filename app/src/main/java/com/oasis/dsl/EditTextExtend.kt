package com.oasis.dsl

import android.text.Editable
import android.text.TextWatcher
// typealias 类型别名
private typealias textAfterChange = (s: Editable?) -> Unit
private typealias textOnChange = (s: CharSequence?, start: Int, before: Int, count: Int) -> Unit
private typealias textBeforeChange = (s: CharSequence?, start: Int, count: Int, after: Int) -> Unit

class CustomTextWatcher : TextWatcher {

    private var textAfterChange: textAfterChange? = null
    private var textOnChange: textOnChange? = null
    private var textBeforeChange: textBeforeChange? = null

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        textBeforeChange?.invoke(p0, p1, p2, p3)
    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        textOnChange?.invoke(p0, p1, p2, p3)
    }

    override fun afterTextChanged(p0: Editable?) {
        textAfterChange?.invoke(p0)
    }

    fun textAfterChange(textAfterChange: textAfterChange) {
        this.textAfterChange = textAfterChange
    }

    fun textOnChange(textOnChange: textOnChange) {
        this.textOnChange = textOnChange
    }

    fun textBeforeChange(textBeforeChange: textBeforeChange) {
        this.textBeforeChange = textBeforeChange
    }

}

fun customTextWatcher(block: CustomTextWatcher.() -> Unit) = CustomTextWatcher().apply { block() }