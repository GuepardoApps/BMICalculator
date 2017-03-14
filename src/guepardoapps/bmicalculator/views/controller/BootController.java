package guepardoapps.bmicalculator.views.controller;

import android.content.Context;

import guepardoapps.bmicalculator.common.Enables;
import guepardoapps.bmicalculator.views.Main;

import guepardoapps.toolset.common.Logger;
import guepardoapps.toolset.controller.NavigationController;

public class BootController {

	private static final String TAG = BootController.class.getSimpleName();
	private Logger _logger;

	private Context _context;
	private NavigationController _navigationController;

	public BootController() {
		_logger = new Logger(TAG, Enables.DEBUGGING);
	}

	public void onCreate(Context context) {
		_logger.Debug("onCreate");
		_context = context;
		_navigationController = new NavigationController(_context);
	}

	public void onPause() {
		_logger.Debug("onPause");
	}

	public void onResume() {
		_logger.Debug("onResume");
	}

	public void onDestroy() {
		_logger.Debug("onDestroy");
	}

	public void NavigateToMain() {
		_logger.Debug("NavigateToMain");
		_navigationController.NavigateTo(Main.class, true);
	}
}