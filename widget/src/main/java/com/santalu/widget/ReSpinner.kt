package com.santalu.widget

import android.content.Context
import android.content.res.Resources.Theme
import android.support.v7.widget.AppCompatSpinner
import android.util.AttributeSet

class ReSpinner : AppCompatSpinner {

  var itemClickListener: OnItemClickListener? = null

  constructor(context: Context) : super(context)

  constructor(context: Context, mode: Int) : super(context, mode)

  constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

  constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
      super(context, attrs, defStyleAttr)

  constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, mode: Int) :
      super(context, attrs, defStyleAttr, mode)

  constructor(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int,
    mode: Int,
    popupTheme: Theme?
  ) : super(context, attrs, defStyleAttr, mode, popupTheme)

  override fun setOnItemClickListener(l: OnItemClickListener?) {
    this.itemClickListener = l
  }

  override fun setSelection(position: Int) {
    super.setSelection(position)
    performItemClick()
  }

  override fun setSelection(position: Int, animate: Boolean) {
    super.setSelection(position, animate)
    if (animate) {
      performItemClick()
    }
  }

  private fun performItemClick() {
    itemClickListener?.onItemClick(this, selectedView, selectedItemPosition, selectedItemId)
  }

}