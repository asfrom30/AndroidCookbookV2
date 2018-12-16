package com.doyoon.androidcookbookv2.utils.android;

/**
 * ref: https://stackoverflow.com/questions/4817933/what-is-the-equivalent-to-a-javascript-setinterval-settimeout-in-android-java
 */
// cf
// new android.os.Handler().postDelayed(new Runnable() {
//      public void run() {
//        Log.i("tag", "This'll run 300 milliseconds later");
//      }
// }, 300);


public class SetTimeout {

    public static void run(Runnable runnable, int delayed_ms) {
        new android.os.Handler().postDelayed(runnable, delayed_ms);
    }


}
