package com.boke.imiloan.utils;
import android.os.Environment;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class LogUtil {
	public static final String CACHE_DIR_NAME = "ESHOP";
	public static boolean isVerborseModel = true;
	public static boolean isSaveVerborseModel = true;
	public static boolean isInfoModel = true;
	public static boolean isSaveInfoModel = true;

	public static boolean isWarnModel = true;
	public static boolean isSaveWarnModel = true;

	public static boolean isErrorModel = true;
	public static boolean isSaveErrorModel = true;

	public static boolean isDebugModel = true;
	public static boolean isSaveDebugInfo = true;

	public static boolean isSaveCrashInfo = true;


	public static void v(final String tag, final String msg) {
		if (isVerborseModel) {
			Log.v(tag, "--> " + msg);
		}

		if (isSaveVerborseModel) {
			new Thread() {
				public void run() {
					write(time() + tag + " --> " + msg + "\n");
				};
			}.start();
		}

	}

	public static void d(final String tag, final String msg) {
		if (isDebugModel) {
			Log.d(tag, "--> " + msg);
		}

		if (isSaveDebugInfo) {
			new Thread() {
				public void run() {
					write(time() + tag + " --> " + msg + "\n");
				};
			}.start();
		}
	}

	public static void i(final String tag, final String msg) {
		if (isInfoModel) {
			Log.i(tag, "--> " + msg);
		}

		if (isSaveInfoModel) {
			new Thread() {
				public void run() {
					write(time() + tag + " --> " + msg + "\n");
				};
			}.start();

		}
	}

	public static void w(final String tag, final String msg) {
		if (isWarnModel) {
			Log.w(tag, "--> " + msg);
		}

		if (isSaveWarnModel) {
			new Thread() {
				public void run() {
					write(time() + tag + " --> " + msg + "\n");
				};
			}.start();

		}

	}

	/**
	 * error信息 logcat
	 * 
	 * @param tag
	 * @param msg
	 */
	public static void e(final String tag, final String msg) {
		if (isErrorModel) {
			Log.e(tag, "--> " + msg);
		}

		if (isSaveErrorModel) {
			new Thread() {
				public void run() {
					write(time() + tag + " --> " + msg + "\n");
				};
			}.start();
		}
	}

	/**
	 * try catch信息 控制台
	 * 
	 * @param tag
	 * @param tr
	 */
	public static void e(final String tag, final Throwable tr) {
		if (isSaveCrashInfo) {
			new Thread() {
				public void run() {
					write(time() + tag + " [CRASH] --> "
							+ getStackTraceString(tr) + "\n");
				};
			}.start();
		}
	}

	/**
	 * 获取控制台打印的信息
	 * 
	 * @param tr
	 * @return
	 */
	public static String getStackTraceString(Throwable tr) {
		if (tr == null) {
			return "";
		}

		Throwable t = tr;
		while (t != null) {
			if (t instanceof UnknownHostException) {
				return "";
			}
			t = t.getCause();
		}

		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		tr.printStackTrace(pw);
		return sw.toString();
	}

	/**
	 * 获取当前时间
	 * 
	 * @return
	 */
	private static String time() {
		return "["
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(
						System.currentTimeMillis())) + "] ";
	}

	/**
	 * @return
	 */
	private static String date() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date(System
				.currentTimeMillis()));
	}

	/**
	 * 将信息写入文件
	 * 
	 * @param content
	 */
	public static synchronized void write(String content) {
		try {
			FileWriter writer = new FileWriter(getFile(), true);
			writer.write(content);
			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取文件路径
	 * 
	 * @return
	 */
	public static String getFile() {
		File sdDir = null;

		if (Environment.getExternalStorageState().equals(
				Environment.MEDIA_MOUNTED)) {
			sdDir = Environment.getExternalStorageDirectory();
		} else {
			sdDir = Environment.getRootDirectory();
		}
		File cacheDir = new File(sdDir + File.separator + CACHE_DIR_NAME);
		if (!cacheDir.exists()){
			cacheDir.mkdir();
		}
		
		File filePath = new File(cacheDir + File.separator + date() + ".txt");		
		return filePath.toString();
	}
	public static String getLogCatstringbuffer() {
		ArrayList<String> cmdLine = new ArrayList<String>();
		cmdLine.add("logcat");
		cmdLine.add("-d");
		cmdLine.add("-s");
		cmdLine.add("-i");
		String[] strs = new String[cmdLine.size()];
		try {
			Process process = Runtime.getRuntime().exec(cmdLine.toArray(strs));
			InputStream is = process.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String str = null;
			StringBuffer sb = new StringBuffer();
			while ((str = br.readLine()) != null) {
				sb.append(str);
				sb.append("\n");
			}

			return sb.toString();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
