package com.zsgj.foodsecurity.activity;

import android.view.View;
import android.view.View.OnClickListener;

import com.videogo.widget.TitleBar;
import com.zsgj.foodsecurity.R;

public class Regist2Activity extends BaseActivity {
	private TitleBar mTitleBar = null;

	@Override
	protected void initView() {
		setContentView(R.layout.activity_regist2);
		mTitleBar = (TitleBar) findViewById(R.id.title_bar);
		mTitleBar.setTitle(R.string.register2);
		mTitleBar.addBackButton(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
	@Override
	protected void initData() {
	}
	public void onClick(View v){
		switch (v.getId()) {
		case R.id.ll_kindengartenselect:
			
			break;
		case R.id.ll_classselect:
			
			break;
		case R.id.ll_studentselect:
			
			break;
		case R.id.btn_submit:
			
			break;

		default:
			break;
		}
	}
	
}
