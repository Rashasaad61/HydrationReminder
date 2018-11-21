package com.example.toshiba.hydration_reminder.sync;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by TOSHIBA on 27/04/2018.
 */

public class WaterReminderIntentService extends IntentService {

    public WaterReminderIntentService() {
        super("WaterReminderIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        ReminderTasks.executeTask(this, action);
    }
}