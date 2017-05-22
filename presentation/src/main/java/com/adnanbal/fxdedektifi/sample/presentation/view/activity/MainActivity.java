package com.adnanbal.fxdedektifi.sample.presentation.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.adnanbal.fxdedektifi.sample.presentation.R;

/**
 * Main application screen. This is the app entry point.
 */
public class MainActivity extends BaseActivity {

  @Bind(R.id.btn_LoadData)
  Button btn_LoadData;
  @Bind(R.id.btn_login)
  Button btn_login;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.btn_login)
  void navigateToLogin() {
    login(this);
  }

  public void login(Context context) {
    if (context != null) {

      Intent lockIntent = new Intent(this, LoginActivity.class);
      startActivity(lockIntent);
    }
  }


  /**
   * Goes to the user list screen.
   */
  @OnClick(R.id.btn_LoadData)
  void navigateToUserList() {
    this.navigator.navigateToUserList(this);
  }
}
