package com.ruiqi.product.singhome.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class LUtils {

	protected Activity mActivity;

	public static LUtils getInstance(Activity activity) {
		return new LUtils(activity);
	}

	private LUtils(Activity activity) {
		mActivity = activity;
	}

}
