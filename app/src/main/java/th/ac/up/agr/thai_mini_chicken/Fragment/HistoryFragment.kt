package th.ac.up.agr.thai_mini_chicken.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_history.view.*
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper
import th.ac.up.agr.thai_mini_chicken.Adapter.ProgramAdapter

import th.ac.up.agr.thai_mini_chicken.R
import th.ac.up.agr.thai_mini_chicken.ViewHolder.CardVHConfig
import th.ac.up.agr.thai_nativechickenexpertsystem.Tools.QuickRecyclerView

class HistoryFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_history, container, false)

        val arr = ArrayList<String>()
        arr.apply {
            add(CardVHConfig.TITLE)
            add(CardVHConfig.CHECKED_INFORMATION)
            add(CardVHConfig.CHECKED_INJECTION)
            add(CardVHConfig.TITLE)
            add(CardVHConfig.CHECKED_PARASITE)
            add(CardVHConfig.CHECKED_INFORMATION)
            add(CardVHConfig.CHECKED_INJECTION)
            add(CardVHConfig.TITLE)
            add(CardVHConfig.CHECKED_PARASITE)
            add(CardVHConfig.CHECKED_INFORMATION)
            add(CardVHConfig.TITLE)
            add(CardVHConfig.CHECKED_INJECTION)
            add(CardVHConfig.CHECKED_PARASITE)
            add(CardVHConfig.CHECKED_PARASITE)
        }


        val recyclerView = QuickRecyclerView(context!!
                , view.history_recycler_view
                , "linear"
                , 1
                , "vertical"
                , false
                , "alway"
                , "high")
                .recyclerView()

        recyclerView.adapter = ProgramAdapter(arr)

        //OverScrollDecoratorHelper.setUpOverScroll(recyclerView, OverScrollDecoratorHelper.ORIENTATION_VERTICAL)


        return view
    }


}