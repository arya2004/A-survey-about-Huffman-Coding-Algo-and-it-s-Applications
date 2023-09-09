package com.example.printer_activity;


import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Vibrator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.media.AudioManager;
import android.media.ToneGenerator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnStart;
    TextView edit, disp;
    Vibrator v;
    CameraManager cmgr;
    String cam;
    MorseCodeTask runningTask;


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected void initSystemServices() {
        v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            try {
                cmgr = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                cam = cmgr.getCameraIdList()[0];
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected void toggleTorch(boolean live) {
        if (cam != null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            try {
                cmgr.setTorchMode(cam, live);
            } catch (CameraAccessException e) {
                e.printStackTrace();
            }
        }
    }


    //
    // class MorseCodeTask - Handler for multithreading to ensure UI thread does not get
    //                       over burdened and cause system instability.  All output
    //                       is accomplished through running instances of this task.
    //
    class MorseCodeTask extends AsyncTask<MorseCharacter, MorseCharacter, Void> {

        @Override
        protected Void doInBackground(MorseCharacter... queue) {
            for (final MorseCharacter ch : queue) {
                if (isCancelled()) { break; }
                publishProgress(ch);
                if (cam != null || v.hasVibrator()) {
                    backgroundOperation(ch);
                }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(MorseCharacter... values) {
            MorseCharacter ch = values[0];
            String dispText = disp.getText() + " " + ch.series;
            disp.setText(dispText);
        }

        @Override
        protected void onCancelled() {
            postExecCleanup();
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            postExecCleanup();
        }

        protected void backgroundOperation(MorseCharacter ch) {
            boolean live = false;

            for (long dit : ch.intervals) {
                if (isCancelled()) { return; }
                if (live) {
                    toggleTorch(true);
                    if (v.hasVibrator()) {
                        v.vibrate(dit);
                    }
                }
                try {
                    Thread.sleep(dit);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    if (live) {
                        toggleTorch(false);
                    }
                }
                live = !live;
            }
        }

        protected void postExecCleanup() {
            toggleTorch(false);

            runningTask = null;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initSystemServices();

        edit = (TextView) findViewById(R.id.editText);
        disp = (TextView) findViewById(R.id.textView);
        btnStart = (Button) findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (runningTask == null) {
                    disp.setText("");
                    CharSequence chs = edit.getText().toString().trim();
                    if (chs != "") {
                        ArrayList<MorseCharacter> queue = MorseCodes.encode(chs);
                        runningTask = new MorseCodeTask();
                        runningTask.execute(queue.toArray(new MorseCharacter[queue.size()]));
                    }

                } else {
                    runningTask.cancel(true);
                }
            }
        });
    }
}