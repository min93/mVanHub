package kmutnb.rattapon.chatupon.chaturaphon.vanhub;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by JER_FAIY on 1/26/2016.
 */
public class MyAlertDialog {

    public void myDialog(Context context, int intIcon, String strTitle, String strMessage) {
        AlertDialog.Builder objBuillder = new AlertDialog.Builder(context);
        objBuillder.setIcon(intIcon);
        objBuillder.setTitle(strTitle);
        objBuillder.setMessage(strMessage); // แสดงข้อความขึ้นมา
        objBuillder.setCancelable(false);   // นี่คือการทำให้ปุ่ม undo ไม่ทำงาน
        objBuillder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        objBuillder.show();

    }   // myDialog

}   // Main Class
