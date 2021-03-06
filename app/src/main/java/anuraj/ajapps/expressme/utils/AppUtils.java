package anuraj.ajapps.expressme.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import anuraj.ajapps.expressme.R;

/**
 * Created by janisharali on 24/05/17.
 */

public final class AppUtils {

    private AppUtils() {
        // This class is not publicly instantiable
    }

    public static void openPlayStoreForApp(Context context) {
        final String appPackageName = context.getPackageName();
        try {
            context.startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse(context
                            .getResources()
                            .getString(R.string.app_name) + appPackageName)));
        } catch (android.content.ActivityNotFoundException e) {
            context.startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse(context
                            .getResources()
                            .getString(R.string.app_name) + appPackageName)));
        }
    }

}
