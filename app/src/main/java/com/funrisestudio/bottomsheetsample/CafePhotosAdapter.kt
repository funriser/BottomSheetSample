package com.funrisestudio.bottomsheetsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CafePhotosAdapter : RecyclerView.Adapter<CafePhotosAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cafe_photo, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = 4

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {}

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

}