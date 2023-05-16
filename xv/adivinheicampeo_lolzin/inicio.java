package xv.adivinheicampeo_lolzin;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class inicio extends Activity {
  private static final int MAX_VOLUME = 100;
  
  MediaPlayer emjogo;
  
  MediaPlayer music;
  
  SharedPreferences sPreferences = null;
  
  MediaPlayer todos;
  
  int vezesQueAcessou;
  
  public void mais(View paramView) {
    this.todos.start();
    startActivity(new Intent((Context)this, mais.class));
  }
  
  public void musica(View paramView) {
    ((ImageView)findViewById(2131165303)).setVisibility(4);
    ((ImageView)findViewById(2131165304)).setVisibility(0);
    this.music.pause();
  }
  
  public void musicaoff(View paramView) {
    ((ImageView)findViewById(2131165303)).setVisibility(0);
    ((ImageView)findViewById(2131165304)).setVisibility(4);
    this.music.start();
  }
  
  public void onBackPressed() {
    Intent intent = new Intent("android.intent.action.MAIN");
    intent.addCategory("android.intent.category.HOME");
    intent.setFlags(268435456);
    startActivity(intent);
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131296283);
    this.music = MediaPlayer.create((Context)this, 2131427329);
    final SharedPreferences prefs = getSharedPreferences("configuracoes", 0);
    this.todos = MediaPlayer.create((Context)this, 2131427330);
    float f = (float)(60.0D - Math.log(100.0D) / Math.log(100.0D));
    this.music.setVolume(f, f);
    this.music.start();
    this.music.setLooping(true);
    this.sPreferences = getSharedPreferences("firstRun", 0);
    this.vezesQueAcessou = sharedPreferences.getInt("vezes", 0);
    if (this.vezesQueAcessou == 3) {
      AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
      builder.setTitle("Esta gostando do Adivinhe o campeão?");
      builder.setCancelable(false).setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface param1DialogInterface, int param1Int) {
              if (inicio.this.vezesQueAcessou < 5) {
                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("vezes", inicio.this.vezesQueAcessou + 1);
                editor.commit();
              } 
              Intent intent = new Intent();
              intent.setAction("android.intent.action.VIEW");
              intent.addCategory("android.intent.category.BROWSABLE");
              intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=xv.adivinheicampeo_lolzin"));
              inicio.this.startActivity(intent);
            }
          }).setNegativeButton("Não", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface param1DialogInterface, int param1Int) {
              if (inicio.this.vezesQueAcessou < 5) {
                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("vezes", inicio.this.vezesQueAcessou + 1);
                editor.commit();
              } 
              param1DialogInterface.cancel();
            }
          });
      builder.setMessage("Poderia avaliar o aplicativo, Só no 'Dale Dele Dele Doly?'");
      builder.create().show();
      return;
    } 
    if (this.vezesQueAcessou < 3) {
      SharedPreferences.Editor editor = sharedPreferences.edit();
      editor.putInt("vezes", this.vezesQueAcessou + 1);
      editor.commit();
    } 
  }
  
  public void onDestroy() {
    super.onDestroy();
    if (this.music != null)
      this.music.release(); 
  }
  
  public void onPause() {
    super.onPause();
    if (this.music != null)
      this.music.pause(); 
    ((ImageView)findViewById(2131165303)).setVisibility(4);
    ((ImageView)findViewById(2131165304)).setVisibility(0);
  }
  
  public void vs(View paramView) {
    this.todos.start();
    startActivity(new Intent((Context)this, versus.class));
    finish();
  }
}


/* Location:              C:\Users\05013719070\Downloads\dex2jar-2.0\dex2jar-2.0\5-1-dex2jar.jar!\xv\adivinheicampeo_lolzin\inicio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */