package xv.adivinheicampeo_lolzin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class versus extends Activity {
  Bundle bundle = new Bundle();
  
  String check1;
  
  String check2;
  
  String check3;
  
  String check4;
  
  String check5;
  
  String cinco = "";
  
  Button confirmar;
  
  String dois = "";
  
  RadioButton rdButtonf;
  
  RadioButton rdButtonp;
  
  RadioGroup rgf;
  
  RadioGroup rgp;
  
  MediaPlayer todos;
  
  String tres = "";
  
  private void addListenerOnButton() {
    this.rgp = (RadioGroup)findViewById(2131165347);
    this.rgf = (RadioGroup)findViewById(2131165346);
    this.confirmar = (Button)findViewById(2131165243);
    this.confirmar.setOnClickListener(new View.OnClickListener() {
          public void onClick(View param1View) {
            int i = versus.this.rgf.getCheckedRadioButtonId();
            versus.this.rdButtonf = (RadioButton)versus.this.findViewById(i);
            i = versus.this.rgf.getCheckedRadioButtonId();
            if (i != -1)
              if (i == 2131165258) {
                versus.this.dois = "dois";
                versus.this.bundle.putString("dois", versus.this.dois);
                versus.this.todos.start();
                Toast.makeText((Context)versus.this, "2 frases para cada jogador!", 0).show();
              } else if (i == 2131165259) {
                versus.this.tres = "tres";
                versus.this.dois = "{}().";
                versus.this.bundle.putString("tres", versus.this.tres);
                versus.this.bundle.putString("dois", versus.this.dois);
                versus.this.todos.start();
                Toast.makeText((Context)versus.this, "3 frases para cada jogador!", 0).show();
              } else if (i == 2131165260) {
                versus.this.cinco = "cinco";
                versus.this.tres = "{}().";
                versus.this.dois = "{}().";
                versus.this.bundle.putString("cinco", versus.this.cinco);
                versus.this.bundle.putString("tres", versus.this.tres);
                versus.this.bundle.putString("dois", versus.this.dois);
                versus.this.todos.start();
                Toast.makeText((Context)versus.this, "5 frases para cada jogador!", 0).show();
              }  
            i = versus.this.rgp.getCheckedRadioButtonId();
            versus.this.rdButtonp = (RadioButton)versus.this.findViewById(i);
            i = versus.this.rgp.getCheckedRadioButtonId();
            if (i == -1)
              return; 
            if (i == 2131165313) {
              Button button1 = (Button)versus.this.findViewById(2131165243);
              Button button2 = (Button)versus.this.findViewById(2131165242);
              Button button3 = (Button)versus.this.findViewById(2131165345);
              TextView textView1 = (TextView)versus.this.findViewById(2131165312);
              TextView textView2 = (TextView)versus.this.findViewById(2131165314);
              EditText editText1 = (EditText)versus.this.findViewById(2131165331);
              EditText editText2 = (EditText)versus.this.findViewById(2131165332);
              editText1.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(12) });
              editText2.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(12) });
              button1.setVisibility(4);
              button2.setVisibility(0);
              button3.setVisibility(0);
              textView1.setVisibility(0);
              textView2.setVisibility(0);
              editText1.setVisibility(0);
              editText2.setVisibility(0);
              return;
            } 
            if (i == 2131165315) {
              Button button1 = (Button)versus.this.findViewById(2131165243);
              Button button2 = (Button)versus.this.findViewById(2131165242);
              Button button3 = (Button)versus.this.findViewById(2131165345);
              TextView textView1 = (TextView)versus.this.findViewById(2131165312);
              TextView textView2 = (TextView)versus.this.findViewById(2131165314);
              TextView textView3 = (TextView)versus.this.findViewById(2131165316);
              EditText editText1 = (EditText)versus.this.findViewById(2131165331);
              EditText editText2 = (EditText)versus.this.findViewById(2131165332);
              EditText editText3 = (EditText)versus.this.findViewById(2131165333);
              editText1.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(12) });
              editText2.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(12) });
              editText3.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(12) });
              button1.setVisibility(4);
              button2.setVisibility(0);
              button3.setVisibility(0);
              textView1.setVisibility(0);
              textView2.setVisibility(0);
              textView3.setVisibility(0);
              editText1.setVisibility(0);
              editText2.setVisibility(0);
              editText3.setVisibility(0);
              return;
            } 
            if (i == 2131165317) {
              Button button1 = (Button)versus.this.findViewById(2131165243);
              Button button2 = (Button)versus.this.findViewById(2131165242);
              Button button3 = (Button)versus.this.findViewById(2131165345);
              TextView textView1 = (TextView)versus.this.findViewById(2131165312);
              TextView textView2 = (TextView)versus.this.findViewById(2131165314);
              TextView textView3 = (TextView)versus.this.findViewById(2131165316);
              TextView textView4 = (TextView)versus.this.findViewById(2131165318);
              EditText editText1 = (EditText)versus.this.findViewById(2131165331);
              EditText editText2 = (EditText)versus.this.findViewById(2131165332);
              EditText editText3 = (EditText)versus.this.findViewById(2131165333);
              EditText editText4 = (EditText)versus.this.findViewById(2131165334);
              editText1.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(12) });
              editText2.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(12) });
              editText3.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(12) });
              editText4.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(12) });
              button1.setVisibility(4);
              button2.setVisibility(0);
              button3.setVisibility(0);
              textView1.setVisibility(0);
              textView2.setVisibility(0);
              textView3.setVisibility(0);
              textView4.setVisibility(0);
              editText1.setVisibility(0);
              editText2.setVisibility(0);
              editText3.setVisibility(0);
              editText4.setVisibility(0);
              return;
            } 
            if (i == 2131165319) {
              RadioGroup radioGroup = (RadioGroup)versus.this.findViewById(2131165346);
              TextView textView1 = (TextView)versus.this.findViewById(2131165373);
              radioGroup.setVisibility(4);
              textView1.setVisibility(4);
              Button button1 = (Button)versus.this.findViewById(2131165243);
              Button button2 = (Button)versus.this.findViewById(2131165242);
              Button button3 = (Button)versus.this.findViewById(2131165345);
              TextView textView2 = (TextView)versus.this.findViewById(2131165312);
              TextView textView3 = (TextView)versus.this.findViewById(2131165314);
              TextView textView4 = (TextView)versus.this.findViewById(2131165316);
              TextView textView5 = (TextView)versus.this.findViewById(2131165318);
              TextView textView6 = (TextView)versus.this.findViewById(2131165320);
              EditText editText1 = (EditText)versus.this.findViewById(2131165331);
              EditText editText2 = (EditText)versus.this.findViewById(2131165332);
              EditText editText3 = (EditText)versus.this.findViewById(2131165333);
              EditText editText4 = (EditText)versus.this.findViewById(2131165334);
              EditText editText5 = (EditText)versus.this.findViewById(2131165335);
              editText1.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(12) });
              editText2.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(12) });
              editText3.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(12) });
              editText4.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(12) });
              editText5.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(12) });
              button1.setVisibility(4);
              button2.setVisibility(0);
              button3.setVisibility(0);
              textView2.setVisibility(0);
              textView3.setVisibility(0);
              textView4.setVisibility(0);
              textView5.setVisibility(0);
              textView6.setVisibility(0);
              editText1.setVisibility(0);
              editText2.setVisibility(0);
              editText3.setVisibility(0);
              editText4.setVisibility(0);
              editText5.setVisibility(0);
            } 
          }
        });
  }
  
  public void concluir(View paramView) {
    this.todos.start();
    EditText editText1 = (EditText)findViewById(2131165331);
    EditText editText2 = (EditText)findViewById(2131165332);
    EditText editText3 = (EditText)findViewById(2131165333);
    EditText editText4 = (EditText)findViewById(2131165334);
    EditText editText5 = (EditText)findViewById(2131165335);
    this.check1 = editText1.getText().toString();
    this.check2 = editText2.getText().toString();
    this.check3 = editText3.getText().toString();
    this.check4 = editText4.getText().toString();
    this.check5 = editText5.getText().toString();
    if (this.check1.equalsIgnoreCase("")) {
      this.check1 = "{}().";
      this.bundle.putString("player1", this.check1);
    } else {
      this.bundle.putString("player1", this.check1);
    } 
    if (this.check2.equalsIgnoreCase("")) {
      this.check2 = "{}().";
      this.bundle.putString("player1", this.check2);
    } else {
      this.bundle.putString("player2", this.check2);
    } 
    if (this.check3.equalsIgnoreCase("")) {
      this.check3 = "{}().";
      this.bundle.putString("player3", this.check3);
    } else {
      this.bundle.putString("player3", this.check3);
    } 
    if (this.check4.equalsIgnoreCase("")) {
      this.check4 = "{}().";
      this.bundle.putString("player4", this.check4);
    } else {
      this.bundle.putString("player4", this.check4);
    } 
    if (this.check5.equalsIgnoreCase("")) {
      this.check5 = "{}().";
      this.bundle.putString("player5", this.check5);
    } else {
      this.bundle.putString("player5", this.check5);
    } 
    Intent intent = new Intent((Context)this, jogo.class);
    intent.putExtras(this.bundle);
    startActivity(intent);
    finish();
  }
  
  public void onBackPressed() {
    startActivity(new Intent((Context)this, inicio.class));
    finish();
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131296287);
    addListenerOnButton();
    this.todos = MediaPlayer.create((Context)this, 2131427330);
  }
  
  public void refazerr(View paramView) {
    this.todos.start();
    startActivity(new Intent((Context)this, versus.class));
    finish();
  }
}


/* Location:              C:\Users\05013719070\Downloads\dex2jar-2.0\dex2jar-2.0\5-1-dex2jar.jar!\xv\adivinheicampeo_lolzin\versus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */