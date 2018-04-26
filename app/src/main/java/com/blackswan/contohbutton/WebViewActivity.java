package com.blackswan.contohbutton;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends Activity {

	private WebView webView;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);

		webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		//webView.loadUrl("http://www.google.com");

		String customHtml = "<html><body><h1>Hello, WebView</h1>" +
				"<del>Delete this text.</del>" +
				"<center>\n" +
				" <font size=\"25px\">\n" +
				" BIODATAKU\n" +
				" </font>\n" +
				" </center>\n" +
				" \n" +
				" <table>\n" +
				" <tr>\n" +
				" <td>Nama :</td>\n" +
				" <td>Kevin Moses Kenap</td>\n" +
				" </tr>\n" +
				" <tr>\n" +
				" <td>Tempat/Tanggal Lahir :</td>\n" +
				" <td>Jakarta, 18 Desember 1994</td>\n" +
				" </tr>\n" +
				" <tr>\n" +
				" <td>Alamat :</td>\n" +
				" <td>Jalan Menuju surgawi no.10, UnNamed Place</td>\n" +
				" </tr>\n" +
				" <tr>\n" +
				" <td>Hobby :</td>\n" +
				" <td>Basket, Blogging, Olahraga, DotA</td>\n" +
				" </tr>\n" +
				" <tr>\n" +
				" <td>Pendidikan Terakhir :</td>\n" +
				" <td>SMKN 1 Jakarta Pusat</td>\n" +
				" </tr>\n" +
				" <tr>\n</body></html>";
		webView.loadData(customHtml, "text/html", "UTF-8");

	}

}