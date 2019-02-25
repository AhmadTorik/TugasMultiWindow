package com.example.asus.multiwindow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    Button btnSubmit, btnHapus;
    EditText editNama, editTahun,editAlamat,editTelepon,editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        btnHapus = (Button)findViewById(R.id.btnHapus);
        editNama = (EditText)findViewById(R.id.editNama);
        editTahun = (EditText)findViewById(R.id.editTahun);
        editAlamat = (EditText)findViewById(R.id.editAlamat);
        editTelepon = (EditText)findViewById(R.id.editTelepon);
        editEmail = (EditText)findViewById(R.id.editEmail);

        btnHapus.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {

            editNama.setText("");
            editTahun.setText("");
            editAlamat.setText("");

            editTelepon.setText("");
            editEmail.setText("");

        }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {

            String nama = editNama.getText().toString();

            //Integer tahun = Integer.parseInt(editTahun.getText().toString());

            String tahun = editTahun.getText().toString();

            String alamat= editAlamat.getText().toString();

            String telepon =editTelepon.getText().toString();

            String email = editEmail.getText().toString();
            //CEK Kondisi Menggunakan Method

            if (TextUtils.isEmpty(nama))
            {
                editNama.setError("Nama Tidak Boleh Kosong");
                return;
            }
            else if (TextUtils.isEmpty(tahun))
            {
                editTahun.setError("Tahun Tidak Boleh Kosong");
                return;
            }

            else if (TextUtils.isEmpty(alamat))
            {
                editAlamat.setError("Alamat Tidak Boleh Kosong");
                return;
            }
            else if (TextUtils.isEmpty(telepon))
            {
                editTelepon.setError("Nomor Telepon Tidak Boleh Kosong");
                return;
            }

            else if (TextUtils.isEmpty(email))
            {
                editEmail.setError("Email Tidak Boleh Kosong");
                return;
            }

            //Toast.makeText(this, "Kolom Tidak Boleh Kosong..", Toast.LENGTH_SHORT).show();



            Intent i = null;


//            if(nama.getText().toString().length()==0){
//                //jika form Email belum di isi / masih kosong
//                nama.setError("Nama diperlukan!");
//            }else if(editTahun.getText().toString().length()==0){
//                //jika form Username belum di isi / masih kosong
//                editTahun.setError("Tahun diperlukan!");
//            }else if(editAlamat.getText().toString().length()==0){
//                //jika form Passwrod belum di isi / masih kosong
//                editAlamat.setError("Alamat diperlukan!");
//            }
//            else if(editTelepon.getText().toString().length()==0){
//                //jika form Passwrod belum di isi / masih kosong
//                editAlamat.setError("Telepon diperlukan!");}
//            else if(editEmail.getText().toString().length()==0){
//                //jika form Passwrod belum di isi / masih kosong
//                editEmail.setError("Email diperlukan!");}
//            else {
//                //jika form sudah terisi semua
//                Toast.makeText(getApplicationContext(), "Registrasi Berhasil!",
//                        Toast.LENGTH_SHORT).show();

            i	= new Intent(MainActivity.this,Main2Activity.class);
            Bundle b =new Bundle();
            b.putString("parse_nama", nama);
            b.putString("parse_tahun", tahun);
            b.putString("parse_alamat",alamat);
            b.putString("parse_telepon", telepon);
            b.putString("parse_email", email);

            i.putExtras(b);
            startActivity(i);
        }

        });

    }
}
