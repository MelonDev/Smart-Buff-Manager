package th.ac.up.agr.manager_buff_smart

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_noti_detail.*
import th.ac.up.agr.manager_buff_smart.Tools.MelonTheme

class NotiDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(MelonTheme.from(this).getStyle())
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noti_detail)

        window.statusBarColor = resources.getColor(MelonTheme.from(this).getStatusBarOverlay())





    }

}
