package xv.adivinheicampeo_lolzin;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class mais extends Activity {
  ImageView como;
  
  private WebView mWebView;
  
  ProgressBar progressBar;
  
  MediaPlayer todos;
  
  public void comoj(View paramView) {
    this.todos.start();
    AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
    builder.setTitle("Regras e siginificados");
    builder.setMessage("Primeiro: Tenha pelo menos um adversário.\n\nSegundo: Leias as frases quando sua vez, e os participantes restantes tentam advinhar.\n\nTerceiro: Cada participante tem direito a 1 chance por frase.\n\nQuarto: Existe a 'dica', que pode ser usada caso esteja muito dificil.\n\nObs: Pode ser usado um papel na hora das respostas, para não haver roubo.\n\nSignificados de botões:\n\n'Troc.'= Trocar frases (caso tenha eventualmente repetido).\n\n'Pronto' = Após alguém acertar; Após ninguém acertar.\n\nO ponto é atribuido a quem acertar, ou caso ninguém acerte, vai para quem está lendo as frases.\n\nCaso permaneça em dúvida, assista os videos na opção abaixo, para melhor entendimento.").setCancelable(false).setPositiveButton("Entendi!", new DialogInterface.OnClickListener() {
          public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
        });
    builder.create().show();
  }
  
  public void credito(View paramView) {
    this.todos.start();
    AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
    builder.setTitle("Créditos e considerações");
    builder.setMessage("Feito por Valdimir Ferraz.\n\nEmail: valdimirferraz@hotmail.com\n\nBaseado no grande canal do 'Henrytado' (Adivinhe o campeão).\n\nA intenção do app é apenas diversão, criado por um grande fã do canal e do lolzin, a fim de, promover o entretenimento.").setCancelable(false).setPositiveButton("Beleuza!", new DialogInterface.OnClickListener() {
          public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
        });
    builder.create().show();
  }
  
  public void onBackPressed() {
    Intent intent = getIntent();
    finish();
    startActivity(intent);
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131296285);
    this.progressBar = (ProgressBar)findViewById(2131165216);
    this.todos = MediaPlayer.create((Context)this, 2131427330);
    this.mWebView = (WebView)findViewById(2131165408);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4 && this.mWebView.canGoBack()) {
      this.mWebView.goBack();
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void video(View paramView) {
    this.todos.start();
    this.mWebView.setVisibility(0);
    this.progressBar.setVisibility(0);
    this.mWebView = (WebView)findViewById(2131165408);
    this.mWebView.getSettings().setJavaScriptEnabled(true);
    this.mWebView.loadUrl("https://www.youtube.com/watch?v=aC7LSf3IIa0&list=PLUXHX9QXAj6r5WLxNqAHQEpw0TscenYmU");
    this.mWebView.setWebViewClient(new HelloWebViewClient());
  }
  
  public void voltar_inicio(View paramView) {
    this.todos.start();
    finish();
  }
  
  private class HelloWebViewClient extends WebViewClient {
    private HelloWebViewClient() {}
    
    public void onPageFinished(WebView param1WebView, String param1String) {
      super.onPageFinished(param1WebView, param1String);
      mais.this.progressBar.setVisibility(8);
    }
    
    public void onPageStarted(WebView param1WebView, String param1String, Bitmap param1Bitmap) {
      super.onPageStarted(param1WebView, param1String, param1Bitmap);
    }
    
    public boolean shouldOverrideUrlLoading(WebView param1WebView, String param1String) {
      param1WebView.loadUrl(param1String);
      return true;
    }
  }
}


/* Location:              C:\Users\05013719070\Downloads\dex2jar-2.0\dex2jar-2.0\5-1-dex2jar.jar!\xv\adivinheicampeo_lolzin\mais.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */