package guepardoapps.bmicalculator.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;

import guepardoapps.bmicalculator.R;
import guepardoapps.bmicalculator.common.*;
import guepardoapps.bmicalculator.views.controller.ImpressumController;

import guepardoapps.toolset.common.Logger;

public class Impressum extends Activity {

	private static final String TAG = Impressum.class.getSimpleName();
	private Logger _logger;

	private Context _context;
	private ImpressumController _impressumController;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_impressum);

		_logger = new Logger(TAG, Enables.DEBUGGING);
		_logger.Debug("onCreate");

		_context = this;
		getActionBar().setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(_context, R.color.ActionBar)));

		_impressumController = new ImpressumController();
		_impressumController.onCreate(_context);
	}

	@Override
	protected void onResume() {
		super.onResume();
		_logger.Debug("onResume");
		_impressumController.onResume();
	}

	@Override
	public void onPause() {
		super.onPause();
		_logger.Debug("onPause");
		_impressumController.onPause();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		_logger.Debug("onDestroy");
		_impressumController.onDestroy();
	}

	public void SendMail(View view) {
		_logger.Debug("SendMail");
		_impressumController.SendMail();
	}

	public void GoToGithub(View view) {
		_logger.Debug("GoToGithub");
		_impressumController.GoToGithub();
	}
}