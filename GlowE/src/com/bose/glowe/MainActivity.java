package com.bose.glowe;

import android.R;
import android.app.ActionBar;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;

public class MainActivity extends ActionBar {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

	@Override
	public void addOnMenuVisibilityListener(OnMenuVisibilityListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTab(Tab tab) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTab(Tab tab, boolean setSelected) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTab(Tab tab, int position) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTab(Tab tab, int position, boolean setSelected) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public View getCustomView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDisplayOptions() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNavigationItemCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNavigationMode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSelectedNavigationIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Tab getSelectedTab() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CharSequence getSubtitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tab getTabAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTabCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CharSequence getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isShowing() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Tab newTab() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAllTabs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeOnMenuVisibilityListener(OnMenuVisibilityListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTab(Tab tab) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTabAt(int position) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectTab(Tab tab) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBackgroundDrawable(Drawable d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCustomView(View view) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCustomView(int resId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCustomView(View view, LayoutParams layoutParams) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDisplayHomeAsUpEnabled(boolean showHomeAsUp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDisplayOptions(int options) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDisplayOptions(int options, int mask) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDisplayShowCustomEnabled(boolean showCustom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDisplayShowHomeEnabled(boolean showHome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDisplayShowTitleEnabled(boolean showTitle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDisplayUseLogoEnabled(boolean useLogo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setIcon(int resId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setIcon(Drawable icon) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setListNavigationCallbacks(SpinnerAdapter adapter,
			OnNavigationListener callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLogo(int resId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLogo(Drawable logo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNavigationMode(int mode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelectedNavigationItem(int position) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSubtitle(CharSequence subtitle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSubtitle(int resId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTitle(CharSequence title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTitle(int resId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
