package net.openvpn.openvpn;

import android.content.Context;
import android.content.SharedPreferences;

public class CacheUtil {

    public static void saveToCache(Context context, String key, String data) {
        SharedPreferences prefs = context.getSharedPreferences(LoginActivity.PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, data);
        editor.apply();
    }

    public static String loadFromCache(Context context, String key) {
        SharedPreferences prefs = context.getSharedPreferences(LoginActivity.PREFS_NAME, Context.MODE_PRIVATE);
        return prefs.getString(key, null);
    }
}
