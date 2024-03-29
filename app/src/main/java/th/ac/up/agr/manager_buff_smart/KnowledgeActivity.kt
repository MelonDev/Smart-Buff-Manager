package th.ac.up.agr.manager_buff_smart

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView

import kotlinx.android.synthetic.main.activity_knowledge.*
import th.ac.up.agr.manager_buff_smart.Adapter.KnowledgeAdapter
import th.ac.up.agr.manager_buff_smart.Data.KnowledgeData
import th.ac.up.agr.manager_buff_smart.Tools.MelonTheme
import th.ac.up.agr.manager_buff_smart.Tools.QuickRecyclerView

class KnowledgeActivity : AppCompatActivity() {

    private lateinit var recyclerView :RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(MelonTheme.from(this).getStyle())

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_knowledge)

        val bundle = intent.extras
        val title = bundle.getString("TITLE")
        val ID = bundle.getString("ID")

        knowledge_back_btn.setOnClickListener {
            finish()
        }

        knowledge_title_name.text = title

        val data = ArrayList<KnowledgeData>()

        if(ID.contentEquals("0")){
            data.apply {
                add(KnowledgeData().set("โปรแกรมวัคซีนและยาถ่ายพยาธิ",R.drawable.ic_injection_icon))
                add(KnowledgeData().set("เทคนิคการเลี้ยงไก่พื้นเมือง",R.drawable.ic_technical_icon))
                add(KnowledgeData().set("วิธีการทำน้ำหมักเอนไซน์แทนการใช้สารเคมี",R.drawable.ic_molecule_icon))
                add(KnowledgeData().set("ยาถ่ายโบราณ",R.drawable.ic_mortar_icon))
                add(KnowledgeData().set("สมุนไพรที่ใช้เลี้ยงไก่",R.drawable.ic_herb_icon))

            }
        } else if(ID.contentEquals("1")){
            data.apply {
                add(KnowledgeData().set("น้ำหมักสมุนไพรแทนวัคซีน/ปฏิชีวนะ",R.drawable.ic_herb_icon))
                add(KnowledgeData().set("น้ำหมักสมุนไพรรักษาโรคทั่วไป",R.drawable.ic_herb_icon))
                add(KnowledgeData().set("น้ำหมักขึ้นฉ่าย",R.drawable.ic_herb_icon))
                add(KnowledgeData().set("กำจัดไรด้วยหางไหล",R.drawable.ic_herb_icon))
                add(KnowledgeData().set("ฮอร์โมนชีวภาพ",R.drawable.ic_herb_icon))
                add(KnowledgeData().set("น้ำหมักสมุนไพรบำรุงสุขภาพ",R.drawable.ic_herb_icon))

            }
        }

        recyclerView = QuickRecyclerView(this
                , knowledge_recycler_view
                , "linear"
                , 1
                , "vertical"
                , false
                , "alway"
                , "high")
                .recyclerView()

        val adapter = KnowledgeAdapter(this,ID,data)

        recyclerView.adapter = adapter


    }


}
