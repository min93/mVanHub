package kmutnb.rattapon.chatupon.chaturaphon.vanhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
    public void clickLogin(View view){
    startActivity(new Intent(SignInActivity.this,EditData.class));

    }
}
