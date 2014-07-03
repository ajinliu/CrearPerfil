package com.simplifyme.crearperfil;

import android.app.Activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {

    private TextView tvSucursal;
    private TextView tvAplicacion;
    private TextView tvServidor;
    private TextView tvPuerto;
    private TextView tvUsuario;
    private TextView tvContra;
    private TextView tvDia;
    private TextView tvCfg;
    private TextView tvEntorno;
    private TextView tvEstructura;
    private TextView tvCartas;
    private TextView tvMovimientos;
    private TextView tvEnvasesPrec;

    private EditText etSucursal;
    private EditText etAplicacion;
    private EditText etServidor;
    private EditText etPuerto;
    private EditText etUsuario;
    private EditText etContra;
    private EditText etDia;
    private EditText etCfg;
    private EditText etEntorno;
    private EditText etEstructura;
    private EditText etCartas;
    private EditText etMovimientos;
    private EditText etEnvasesPrec;

    public static final String MyPREFERENCES = "simplify" ;
    public static final String Sucursal = "sucursalKey";
    public static final String Aplicacion = "aplicacionKey";
    public static final String Servidor = "servidorKey";
    public static final String Puerto = "puertoKey";
    public static final String Usuario = "usuarioKey";
    public static final String Contrasena = "contrasenaKey";

    public static final String Dia = "diaKey";
    public static final String Cfg = "cfgKey";
    public static final String Entorno = "entornoKey";
    public static final String Estructura = "estructuraKey";
    public static final String Cartas = "cartasKey";
    public static final String Movimiento = "movimientoKey";
    public static final String EnvasesPrec = "envasesprecKey";

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        tvSucursal = (TextView) findViewById(R.id.etSucursal);
        tvAplicacion = (TextView) findViewById(R.id.etAplicacion);
        tvServidor = (TextView) findViewById(R.id.etServidor);
        tvPuerto = (TextView) findViewById(R.id.etPuerto);
        tvUsuario = (TextView) findViewById(R.id.etUsuario);
        tvContra = (TextView) findViewById(R.id.etContra);
        tvDia = (TextView) findViewById(R.id.etDia);
        tvCfg = (TextView) findViewById(R.id.etConfiguracion);
        tvEntorno= (TextView) findViewById(R.id.etEntorno);
        tvEstructura = (TextView) findViewById(R.id.etEstructura);
        tvCartas = (TextView) findViewById(R.id.etCartas);
        tvMovimientos = (TextView) findViewById(R.id.etMovimiento);
        tvEnvasesPrec = (TextView) findViewById(R.id.etEnvasesPrec);

        etSucursal = (EditText) findViewById(R.id.etSucursal);
        etAplicacion = (EditText) findViewById(R.id.etAplicacion);
        etServidor = (EditText) findViewById(R.id.etServidor);
        etPuerto = (EditText) findViewById(R.id.etPuerto);
        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etContra = (EditText) findViewById(R.id.etContra);
        etDia = (EditText) findViewById(R.id.etDia);
        etCfg = (EditText) findViewById(R.id.etConfiguracion);
        etEntorno= (EditText) findViewById(R.id.etEntorno);
        etEstructura = (EditText) findViewById(R.id.etEstructura);
        etCartas = (EditText) findViewById(R.id.etCartas);
        etMovimientos = (EditText) findViewById(R.id.etMovimiento);
        etEnvasesPrec = (EditText) findViewById(R.id.etEnvasesPrec);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        if (sharedpreferences.contains(Sucursal)){
            tvSucursal.setText(sharedpreferences.getString(Sucursal, ""));}
        if (sharedpreferences.contains(Aplicacion)){
            tvAplicacion.setText(sharedpreferences.getString(Aplicacion, "")); }
        if (sharedpreferences.contains(Servidor)){
            tvServidor.setText(sharedpreferences.getString(Servidor, ""));}
        if (sharedpreferences.contains(Puerto)){
            tvPuerto.setText(sharedpreferences.getString(Puerto, ""));}
        if (sharedpreferences.contains(Usuario)){
            tvUsuario.setText(sharedpreferences.getString(Usuario, ""));}
        if (sharedpreferences.contains(Contrasena)){
            tvContra.setText(sharedpreferences.getString(Contrasena,""));}

        if (sharedpreferences.contains(Dia)){
            tvDia.setText(sharedpreferences.getString(Dia, ""));}
        if (sharedpreferences.contains(Cfg)){
            tvCfg.setText(sharedpreferences.getString(Cfg, "")); }
        if (sharedpreferences.contains(Entorno)){
            tvEntorno.setText(sharedpreferences.getString(Entorno, ""));}
        if (sharedpreferences.contains(Estructura)){
            tvEstructura.setText(sharedpreferences.getString(Estructura, ""));}
        if (sharedpreferences.contains(Cartas)){
            tvCartas.setText(sharedpreferences.getString(Cartas, ""));}
        if (sharedpreferences.contains(Movimiento)){
            tvMovimientos.setText(sharedpreferences.getString(Movimiento,""));}
        if (sharedpreferences.contains(EnvasesPrec)){
            tvEnvasesPrec.setText(sharedpreferences.getString(EnvasesPrec,""));}
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings1) {
            run();
            return true;
        }
        if (id == R.id.action_settings2) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void run(){


        String suc  = etSucursal.getText().toString();
        String app  = etAplicacion.getText().toString();
        String ser  = etServidor.getText().toString();
        String pue  = etPuerto.getText().toString();
        String usu  = etUsuario.getText().toString();
        String con  = etContra.getText().toString();

        String dia  = etDia.getText().toString();
        String cfg  = etCfg.getText().toString();
        String ent  = etEntorno.getText().toString();
        String est  = etEstructura.getText().toString();
        String car  = etCartas.getText().toString();
        String mov  = etMovimientos.getText().toString();
        String env  = etEnvasesPrec.getText().toString();

        Editor editor = sharedpreferences.edit();
        editor.putString(Sucursal, suc);
        editor.putString(Aplicacion, app);
        editor.putString(Servidor, ser);
        editor.putString(Puerto, pue);
        editor.putString(Usuario, usu);
        editor.putString(Contrasena, con);
        editor.putString(Dia, dia);
        editor.putString(Cfg, cfg);
        editor.putString(Entorno, ent);
        editor.putString(Estructura, est);
        editor.putString(Cartas, car);
        editor.putString(Movimiento, mov);
        editor.putString(EnvasesPrec, env);

        editor.commit();
        finish();

    }

}
