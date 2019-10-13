package th.ac.up.agr.manager_buff_smart.Firebase

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Firebase {

    companion object {
        val reference :DatabaseReference = FirebaseDatabase.getInstance().reference
    }

}