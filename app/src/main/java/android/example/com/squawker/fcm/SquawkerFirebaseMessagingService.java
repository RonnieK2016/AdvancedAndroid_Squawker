package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessagingService;

/**
 * Created by angelov on 9/4/2018.
 */

public class SquawkerFirebaseMessagingService extends FirebaseMessagingService {

    private static final String LOG_TAG = SquawkerFirebaseMessagingService.class.getSimpleName();

    @Override
    public void onNewToken(String token) {
        Log.d(LOG_TAG, "Refreshed token: " + token);
        //super.onNewToken(s);
    }
}
