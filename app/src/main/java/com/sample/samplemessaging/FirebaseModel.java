package com.sample.samplemessaging;

import com.google.firebase.iid.FirebaseInstanceId;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class FirebaseModel {

    private static final String TAG = "FirebaseModel";

    private final ClipboardManager clipboard;

    private final Context context;

    FirebaseModel(Context context) {
        this.context = context;
        clipboard = (ClipboardManager) this.context.getSystemService(Context.CLIPBOARD_SERVICE);
    }

    public void openConsoleWithTrackingId() {
        String token = FirebaseInstanceId.getInstance().getToken();
        ClipData clip = ClipData.newPlainText("Firebase Token", token);
        clipboard.setPrimaryClip(clip);
        Toast.makeText(context, context.getString(R.string.main_screen_token_copied), LENGTH_SHORT)
                .show();
        Log.d(TAG, "token: " + token);
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://console.firebase.google.com/"));
        context.startActivity(intent);
    }
}
