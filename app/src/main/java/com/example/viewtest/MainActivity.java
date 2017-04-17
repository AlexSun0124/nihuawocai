package com.example.viewtest;

import util.DensityUtil;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import Views.MySurfaceView;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.BitmapFactory;

import android.os.Bundle;
import android.os.Handler;

import android.support.v4.widget.ViewDragHelper;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Context context;
	private Button reset_btn;
	private MySurfaceView mview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context = this;

		mview = (MySurfaceView) findViewById(R.id.MySurfaceView);

		reset_btn = (Button) findViewById(R.id.reset_btn);
		reset_btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// 清除
				mview.reset();
			}
		});

		// 第二种方式
		//  startActivity(new Intent(context, SecondActivity.class));

	}

}
