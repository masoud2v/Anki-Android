package com.ichi2.anki.dialogs;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

import com.ichi2.anki.AnkiDroidApp;

public abstract class AsyncDialogFragment extends DialogFragment {
    /* provide methods for text to show in notification bar when the DialogFragment
       can't be shown due to the host activity being in stopped state.
       This can happen when the DialogFragment is shown from 
       the onPostExecute() method of an AsyncTask */
    
    public abstract String getNotificationMessage();
    public abstract String getNotificationTitle();

    public Bundle getNotificationIntentExtras() {
        return new Bundle();
    }

    protected Resources res() {
        return AnkiDroidApp.getAppResources();
    }
} 