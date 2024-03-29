package th.ac.up.agr.manager_buff_smart

import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_container.*
import th.ac.up.agr.manager_buff_smart.Fragment.KnowledgeListFragment
import th.ac.up.agr.manager_buff_smart.Fragment.KnowledgeTableFragment
import th.ac.up.agr.manager_buff_smart.Fragment.KnowledgeWebFragment
import th.ac.up.agr.manager_buff_smart.ProgramMainActivity.ProgramMainActivity
import th.ac.up.agr.manager_buff_smart.SQLite.AppTheme
import th.ac.up.agr.manager_buff_smart.Tools.MelonTheme

class ContainerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(MelonTheme.from(this).getStyle())
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        val bundle = intent.extras
        val title = bundle.getString("TITLE")

        container_title_name.text = title

        container_back_btn.setOnClickListener {
            //val intent = Intent(this,ProgramMainActivity::class.java)
            //startActivity(intent)
            finish()
        }

        when (title) {
            "โปรแกรมวัคซีนและยาถ่ายพยาธิ" -> {
                val fragment = KnowledgeTableFragment.newInstance("0")
                supportFragmentManager.beginTransaction().replace(R.id.container_frame, fragment).commit()
            }
            "เทคนิคการเลี้ยงไก่พื้นเมือง" -> {
                val fragment = KnowledgeWebFragment.newInstance("http://kaichon.dooasia.com/herb.shtml")
                supportFragmentManager.beginTransaction().replace(R.id.container_frame, fragment).commit()
            }
            "น้ำหมักสมุนไพรแทนวัคซีน/ปฏิชีวนะ" -> {
                val fragment = KnowledgeListFragment.newInstance("วัตถุดิบส่วนผสม"
                        , "- สมุนไพร (ขมิ้นชัน ฟ้าทะลายโจร ตะไคร้หอม บอระเพ็ด ) รวม 3 กิโลกรัม \n" +
                        "- กากน้ำตาลหรือน้ำตาลทรายแดง 1 กิโลกรัม \n" +
                        "- น้ำสะอาด 10 ลิตร", "ขั้นตอนและวิธีการทำ", "- นำสมุนไพรทั้ง 4 ชนิด (สดหรือแห้งก็ได้) รวมกันให้ได้ 3 กิโลกรัม โดยทุบหรือหั่นสมุนไพรให้เป็นชิ้น เล็กๆใส่ลงในถังหมัก \n" +
                        "- นำกากน้ำตาลหรือน้ำตาลทรายแดงใส่ลงไปผสมคลุกเคล้ากับสมุนไพรในถังหมัก \n" +
                        "- เติมน้ำสะอาด (ปราศจากคลอรีน) ใส่ไปให้พอท่วมสมุนไพรทั้งหมด (ไม่ต้องใส่หมดทั้ง 10 ลิตรก็ได้) แล้วคนส่วนผสมให้เข้ากันเป็นขั้นตอนสุดท้าย โดยปิดฝาถังหมักให้สนิท ตั้งเก็บไว้ในที่ร่ม หมั่นคน วัตถุดิบอย่างน้อยสัปดาห์ละ 1 ครั้ง ใช้ระยะเวลาในการหมักอย่างน้อย 3 เดือนขึ้นไป"
                        , "การนำไปใช้ประโยชน์", "กรองเอาเฉพาะน้ำหมักสมุนไพร 1 แก้ว (ประมาณ 100 - 150 ซีซี.) ผสมกับน้ำสะอาด 10 ลิตร เทใส่รางน้ำให้ไก่กินทุกวัน ซึ่งน้ำหมักสมุนไพรสูตรดังกล่าวสามารถใช้ป้องกันและ รักษาโรคหวัด รวมถึงการเสริมสร้างสุขภาพไก่พื้นเมืองให้มีภูมิต้านทานโรคต่างๆแทนการใช้ยาปฏิชีวนะ ซึ่ง สูตรดังกล่าวสามารถใช้กับเป็ด ห่าน และสัตว์ปีกขนาดเล็กได้ทุกชนิด", true)
                supportFragmentManager.beginTransaction().replace(R.id.container_frame, fragment).commit()
            }
            "น้ำหมักสมุนไพรรักษาโรคทั่วไป" -> {
                val fragment = KnowledgeListFragment.newInstance("วัตถุดิบส่วนผสม", "-ฟ้าทะลายโจร ½ กิโลกรัม\n" +
                        "- บอระเพ็ด ½ กิโลกรัม - กระเทียม ½ กิโลกรัม \n" +
                        "- น้ำตาลทรายแดง ½ กิโลกรัม", "ขั้นตอนและวิธีการทำ", "-นำฟ้าทะลายโจร บอระเพ็ด กระเทียมอย่างละ ½ กิโลกรัม ล้างน้ำให้สะอาด ผึ่งให้แห้ง จากนั้นทุบให้ พอแหลก\n" +
                        " - นำน้ำตาลทรายแดง 1 กิโลกรัม เคี่ยวน้ำตาลทรายแดงให้ได้เป็นน้ำเชื่อม รอให้เย็นเทใส่สมุนไพรหมัก ไว้ในถัง 1 เดือน รูปภาพ \n" +
                        "วิธีใช้ - หลังจากที่หมักทิ้งไว้จนครบ 1 เดือนให้กรองเอาแต่น้ำที่หมัก จากนั้นใช้น้ำหมักสมุนไพรในปริมาณ 1 ช้อนโต๊ะ ผสมกับน้ำสะอาด 1 แกลอน แล้วนำไปตั้งทิ้งไว้ให้ไก่แลละหมูกินเป็นประจำทุกๆวัน", "การนำไปใช้ประโยชน์", "-เพิ่มจุลินทรีย์ที่เป็นประโยชน์ ลดจุลินทรีย์ก่อโรค\n" +
                        " - กระตุ้นภูมิคุ้มกันโรคทำให้สัตว์แข็งแรง \n" +
                        "- ลดกลิ่นในมูลสัตว์ ลดปัญหาโรคและทางเดินหายใจและลดแมลงวันในเล้าไก่อีกด้วย", true)
                supportFragmentManager.beginTransaction().replace(R.id.container_frame, fragment).commit()
            }
            "น้ำหมักขึ้นฉ่าย" -> {
                val fragment = KnowledgeListFragment.newInstance("วัตถุดิบส่วนผสม", "- ถังขนาด 200 ลิตร 1 ถัง \n" +
                        "- ขึ้นฉ่าย 3 กิโลกรัม \n" +
                        "- กากน้ำตาล 1 กิโลกรัม \n" +
                        "- น้ำเปล่า 6 ลิตร \n" +
                        "- สารเร่ง พด.2 1 ซอง", "ขั้นตอนและวิธีการทำ", "-นำขึ้นฉ่าย 3 กิโลกรัม กากน้ำตาล 1 กิโลกรัม น้ำเปล่า 6 ลิตร สารเร่ง พด.2 1ซอง เทลงในถัง สำหรับหมัก แล้วคนส่วนผสมทั้งหมดให้เข้ากัน ปิดฝาถังหมัก โดยหมักทิ้งไว้เป็นเวลา 15 วันหลังจากหมักได้ที่ แล้วแล้วก็สามารถนำไปใช้ได้ทันที", "การนำไปใช้ประโยชน์", "-ให้กรองเอาน้ำหมักขึ้นฉ่าย จำนวน 1 ลิตร ผสมกับรำข้าว 5 กิโลกรัม ปลายข้าว 5 กิโลกรัม แล้ว คลุกเคล้าส่วนผสมให้เข้ากันจากนั้นนำไปใช้ให้ไก่กิน ในช่วงเวลาเช้า หรือเย็น\n" +
                        "-เมื่อนำน้ำหมักขึ้นฉ่าย ไปให้ไก่กินเป็นประจำ จะทำให้ไก่เจริญอาหาร สุขภาพดี น้ำหนักดีโตเร็ว เป็นที่ต้องการของตลาด", true)
                supportFragmentManager.beginTransaction().replace(R.id.container_frame, fragment).commit()
            }
            "กำจัดไรด้วยหางไหล" -> {
                val fragment = KnowledgeListFragment.newInstance("วัตถุดิบส่วนผสม", "-ใช้รากหางไหลประมาณ 0.5 กิโลกรัม นำมาทุบให้แหลก แช่น้ำประมาณ 10 ลิตร ทิ้งไว้ 1 คืน (ลักษณะน้ำที่ได้จะมี สีขาวขุ่นคล้ายน้ำซาวข้าว", "ขั้นตอนและวิธีการทำ", "-กรองเอาแต่น้ำ นำไปฉีดพ่นที่เล้า หรือตัวไก่ ทุกๆ 10 วัน", "การนำไปใช้ประโยชน์", "-รากใช้เป็นยาฆ่าแมลงตัวหนอนที่เกาะกินผัก ด้วยการนำรากมาทุบ ๆ ผสมกับน้ำ พอให้ขุ่นขาว แล้วน ามารดพืชผักในสวนผัก จะช่วยฆ่าแมลงและตัวหนอนได้ และใช้เป็นยาเบื่อปลาได้อีกด้วย รากใช้ผสมกับสบู่และน้ำสำหรับใช้ฆ่าสัตว์ เช่น หิดและเหาได้เป็นอย่างดี", true)
                supportFragmentManager.beginTransaction().replace(R.id.container_frame, fragment).commit()
            }
            "ฮอร์โมนชีวภาพ" -> {
                val fragment = KnowledgeListFragment.newInstance("วัตถุดิบส่วนผสม", "-ใช้ฮอร์โมนไข่ 1 ช้อนโต๊ะ \n" +
                        "-จุลินทรีย์หน่อกล้วย 1 ช้อนโต๊ะ ", "ขั้นตอนและวิธีการทำ", "-ใช้ฮอร์โมนไข่ 1 ช้อนโต๊ะ ผสมจุลินทรีย์หน่อกล้วย 1 ช้อนโต๊ะ ละลายกับน้ำสะอาด 10 ลิตร ใส่ภาชนะให้เป็ดและไก่กินแทนน้ำทุกวัน", "การนำไปใช้ประโยชน์", "-เป็ดไก่จะมีสุขภาพดี ไม่เครียด เพราะมีจุลินทรีย์ช่วยย่อยอาหารได้ดี กินอาหารได้มากขึ้น ออก ไข่ดกและฟองใหญ่", true)
                supportFragmentManager.beginTransaction().replace(R.id.container_frame, fragment).commit()
            }
            "น้ำหมักสมุนไพรบำรุงสุขภาพ" -> {
                val fragment = KnowledgeListFragment.newInstance("วัตถุดิบส่วนผสม", "- ใบพญาว่านวานร (ฮว่านง็อก) 1.5 กิโลกรัม \n" +
                        "- ใบเหงือกปลาหมอสด 1.5 กิโลกรัม\n" +
                        " - กากน้ำตาล 1 ลิตร \n" +
                        "- น้ำซาวข้าว 10 ลิตร", "ขั้นตอนและวิธีการทำ", "- น่าใบพญาวานรสดหรือที่เรียกว่า \"ฮว่านง็อก\" และเหงือกปลาหมอน่ามาสับให้พอละเอียด หมักรวมกับ กากน้ำตาลในถังโดยไม่ต้องเติมน้ำเปล่า หมักทิ้งไว้ 15 วัน \n" +
                        "- หลังจากครบ 15 วันแล้ว ให้เปิดฝาถังหมัก จากนั้นเติมน้ำซาวข้าวลงไป 10 ลิตร แล้วคนให้เข้ากัน หมัก ต่อไปอีก 1 เดือนจะได้น้ำหมักสมุนไพรสุขภาพไก่พื้นเมือง (ถ้าหมักนาน 1 ปีจะดีมาก)\n" +
                        "- กรองน้ำหมักสมุนไพรบำรุงสุขภาพไก่พื้นเมืองแล้วน่ามาผสมกับน้ำที่ใช้เลี้ยงไก่ โดยใช้น้ำหมักสมุนไพร 4 ช้อนโต๊ะ ผสมกับน้ำเปล่า 10 ลิตร และเติมน้ำตาลทรายแดงลงไปอีก 2 ช้อนโต๊ะ จากนั้นน่าไปเลี้ยงไก่ พื้นเมือง ได้ตามปกติแทนการใช้น้ำเปล่าเลี้ยง สามารถใช้ได้กับไก่พื้นเมืองในทุกช่วงอาย", "การนำไปใช้ประโยชน์", "- สร้างภูมิคุ้มกันโรคในไก่พื้นเมือง ป้องกันไวรัสไข้หวัดนก ลดการอักเสบและแผลต่างๆ บำรุงระบบทางเดิน อาหาร ช่วยให้ระบบย่อยอาหารของไก่พื้นเมืองดีขึ้น ท่าให้เจริญเติบโตดี น้ำหนักดีกินอาหารได้มาก ลด ความเครียดในไก่ สุขภาพไม่เป็นโรคง่าย", true)
                supportFragmentManager.beginTransaction().replace(R.id.container_frame, fragment).commit()
            }
            "ยาถ่ายโบราณ" -> {
                val fragment = KnowledgeListFragment.newInstance("วัตถุดิบส่วนผสม", "-เกลือประมาณ 1 ช้อนคาว\n" +
                        "-มะขามเปียก 1 หยิบมือ\n" +
                        "-ไพลประมาณ 5 แว่น\n" +
                        "-บอระเพ็ดยาวประมาณ 2 นิ้ว หั่นเป็นแว่นบาง ๆ\n" +
                        "-น้ำตาลปีบประมาณ 1 ช้อนคาว\n" +
                        "-ใบจากเผาไฟเอาถ่าน (ใช้ใบจากประมาณ 1 กำวงแหวน)", "ขั้นตอนและวิธีการทำ", "-ใช้ครกตำให้ละเอียดเข้า ด้วยกัน เวลาใช้ยาควรให้ไก่กินเวลาเช้าท้องว่าง ปั้นเป็นลูกกลอนขนาดหัวแม่มือ 2 เม็ด ให้น้ำกินมาก ๆ หน่อย แล้วครอบผึ่งแดดไว้รอจนกว่ายาจะออกฤทธิ์ ถ่ายเป็นน้ำ 3 ครั้ง ก็พอแล้วเอาข้าวให้กินเพื่อให้ยาหยุดเดิน"
                        , ""
                        , "", false)
                supportFragmentManager.beginTransaction().replace(R.id.container_frame, fragment).commit()
            }
            "สมุนไพรที่ใช้เลี้ยงไก่" -> {
                val fragment = KnowledgeTableFragment.newInstance("1")
                supportFragmentManager.beginTransaction().replace(R.id.container_frame, fragment).commit()
            }
        }


    }

    override fun onBackPressed() {
        //val intent = Intent(this,ProgramMainActivity::class.java)
        //startActivity(intent)
        finish()
    }

}
