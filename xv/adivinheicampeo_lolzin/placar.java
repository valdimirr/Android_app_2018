package xv.adivinheicampeo_lolzin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class placar extends Activity {
  String player1;
  
  String player2;
  
  String player3;
  
  String player4;
  
  String player5;
  
  MediaPlayer todos;
  
  public void backks(View paramView) {
    this.todos.start();
    startActivity(new Intent((Context)this, inicio.class));
    jogo.placarpla1 = 0;
    jogo.placarpla2 = 0;
    jogo.placarpla3 = 0;
    jogo.placarpla4 = 0;
    jogo.placarpla5 = 0;
    finish();
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131296286);
    this.todos = MediaPlayer.create((Context)this, 2131427330);
    paramBundle = getIntent().getExtras();
    this.player1 = paramBundle.getString("player11");
    this.player2 = paramBundle.getString("player21");
    this.player3 = paramBundle.getString("player31");
    this.player4 = paramBundle.getString("player41");
    this.player5 = paramBundle.getString("player51");
    TextView textView6 = (TextView)findViewById(2131165325);
    TextView textView7 = (TextView)findViewById(2131165326);
    TextView textView8 = (TextView)findViewById(2131165327);
    TextView textView9 = (TextView)findViewById(2131165328);
    TextView textView10 = (TextView)findViewById(2131165329);
    TextView textView5 = (TextView)findViewById(2131165336);
    TextView textView4 = (TextView)findViewById(2131165337);
    TextView textView3 = (TextView)findViewById(2131165338);
    TextView textView2 = (TextView)findViewById(2131165339);
    TextView textView1 = (TextView)findViewById(2131165340);
    textView6.setText(this.player1);
    textView7.setText(this.player2);
    textView8.setText(this.player3);
    textView9.setText(this.player4);
    textView10.setText(this.player5);
    double d1 = jogo.placarpla1;
    double d2 = jogo.placarpla2;
    double d3 = jogo.placarpla3;
    double d4 = jogo.placarpla4;
    double d5 = jogo.placarpla5;
    StringBuilder stringBuilder5 = new StringBuilder();
    stringBuilder5.append("");
    stringBuilder5.append(d1);
    textView5.setText(stringBuilder5.toString());
    StringBuilder stringBuilder4 = new StringBuilder();
    stringBuilder4.append("");
    stringBuilder4.append(d2);
    textView4.setText(stringBuilder4.toString());
    StringBuilder stringBuilder3 = new StringBuilder();
    stringBuilder3.append("");
    stringBuilder3.append(d3);
    textView3.setText(stringBuilder3.toString());
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("");
    stringBuilder2.append(d4);
    textView2.setText(stringBuilder2.toString());
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("");
    stringBuilder1.append(d5);
    textView1.setText(stringBuilder1.toString());
  }
}


/* Location:              C:\Users\05013719070\Downloads\dex2jar-2.0\dex2jar-2.0\5-1-dex2jar.jar!\xv\adivinheicampeo_lolzin\placar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */