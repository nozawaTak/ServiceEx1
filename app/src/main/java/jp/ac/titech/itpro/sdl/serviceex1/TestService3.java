package jp.ac.titech.itpro.sdl.serviceex1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;



public class TestService3 extends IntentService{
    private final static String TAG = "TestService3";
    public final static String EXTRA_MYARG = "MYARG";

    TestService3() { super(TAG); }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "onHandleIntent in " + Thread.currentThread());
        Log.d(TAG, "myarg = " + intent.getStringExtra(EXTRA_MYARG));
        try {
            Intent answerIntent = new Intent();

            String ACTION = "hogera-hogera";
            String EXTRA = "pugya-";
            boolean warosu = true;

            answerIntent.setAction(ACTION);
            answerIntent.putExtra(EXTRA, warosu);
            sendBroadcast(answerIntent);
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate in " + Thread.currentThread());
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy in " + Thread.currentThread());
        super.onDestroy();
    }


}
