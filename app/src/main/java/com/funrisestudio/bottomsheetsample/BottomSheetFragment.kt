package com.funrisestudio.bottomsheetsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_bottom_sheet.*

class BottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<View>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    private fun initView() {
        rvCafePhotos.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rvCafePhotos.adapter = CafePhotosAdapter()

        btnDown.setOnClickListener {
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }

    override fun onResume() {
        super.onResume()
        bottomSheetBehavior = BottomSheetBehavior.from(view?.parent as View).apply {
            peekHeight = dip(320)
            setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
                override fun onSlide(view: View, delta: Float) {
                    layoutMotionBar.progress = delta
                }

                override fun onStateChanged(p0: View, p1: Int) {
                }
            })
        }
    }

}