package androidutils.sunjianchao.com.library;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Created by sunjianchao on 18/3/28.
 * Android Studio 中会自动生成BuildConfig.java文件
 * 可以通过此文件获得Apk的VersionCode、 VersionName、isDebug
 */
public class VersionUtil {
    /**
     * 获取版本号
     * 也可使用 BuildConfig.VERSION_NAME 替换
     *
     * @param context 上下文
     * @return 版本号
     */
    public static String getVersionName(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return "1.0.0";
    }

    /**
     * 获取版本code
     * 也可使用 BuildConfig.VERSION_CODE 替换
     *
     * @param context 上下文
     * @return 版本code
     */
    public static int getVersionCode(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return 1;
    }
}
