package th.ac.up.agr.manager_buff_smart

import com.google.firebase.database.FirebaseDatabase

class OfflineClient :android.app.Application(){

    override fun onCreate() {
        super.onCreate()

        FirebaseDatabase.getInstance().setPersistenceEnabled(true)

    }

}