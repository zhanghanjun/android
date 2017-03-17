package com.boke.imiloan.utils;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class ToastUtil {
	
	private static Toast toast;
	
	public static void showToast(Context context, String text, int duration) {
		if (toast == null) {
			toast = Toast.makeText(context, text, duration);
		} else {
			toast.setText(text);
			toast.setGravity(Gravity.CENTER,0,0);
			toast.setDuration(duration);
		}
		toast.show();
	}
	
	public static void showToast(Context context, String text) {
		if (toast == null) {
			toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
		} else {
			toast.setText(text);
			toast.setGravity(Gravity.CENTER,0,0);
			toast.setDuration(Toast.LENGTH_SHORT);
		}
		toast.show();
	}
	
	public static void showToast(Context context, int text, int duration) {
		if (toast == null) {
			toast = Toast.makeText(context, text, duration);
		} else {
			toast.setText(text);
			toast.setGravity(Gravity.CENTER,0,0);
			toast.setDuration(duration);
		}
		toast.show();
	}
	
	public static void showToast(Context context, int text) {
		if (toast == null) {
			toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
		} else {
			toast.setText(text);
			toast.setGravity(Gravity.CENTER,0,0);
			toast.setDuration(Toast.LENGTH_SHORT);
		}
		toast.show();
	}
}
