package th.ac.up.agr.manager_buff_smart.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_knowledge_list.view.*

import th.ac.up.agr.manager_buff_smart.R


class KnowledgeListFragment : Fragment() {

    companion object {
        fun newInstance(titleA: String,messageA: String,titleB: String,messageB: String,titleC: String,messageC: String,showC :Boolean): KnowledgeListFragment {
            val args = Bundle()
            //args.putString("TITLE", title)
            args.putString("TA", titleA)
            args.putString("MA", messageA)
            args.putString("TB", titleB)
            args.putString("MB", messageB)
            args.putString("TC", titleC)
            args.putString("MC", messageC)
            args.putString("SC", showC.toString())

            val fragment = KnowledgeListFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_knowledge_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val TA = arguments!!.getString("TA")
        val MA = arguments!!.getString("MA")
        val TB = arguments!!.getString("TB")
        val MB = arguments!!.getString("MB")
        val TC = arguments!!.getString("TC")
        val MC = arguments!!.getString("MC")
        val SC = arguments!!.getString("SC").toBoolean()


        view.apply {
            knowledge_list_title_a.text = TA
            knowledge_list_message_a.text = MA
            knowledge_list_title_b.text = TB
            knowledge_list_message_b.text = MB
            knowledge_list_title_c.text = TC
            knowledge_list_message_c.text = MC

            if(SC){
                knowledge_list_area_C.visibility = View.VISIBLE
            }else {
                knowledge_list_area_C.visibility = View.GONE
            }
        }

    }


}
