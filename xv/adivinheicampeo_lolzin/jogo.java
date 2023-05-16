package xv.adivinheicampeo_lolzin;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;

public class jogo extends Activity {
  public static int placarpla1;
  
  public static int placarpla2;
  
  public static int placarpla3;
  
  public static int placarpla4;
  
  public static int placarpla5;
  
  Bundle bundles = new Bundle();
  
  String cinco;
  
  String dicas;
  
  String dois;
  
  MediaPlayer emjogo;
  
  int f = 0;
  
  ArrayList<Integer> list = new ArrayList<Integer>();
  
  String player1;
  
  String player2;
  
  String player3;
  
  String player4;
  
  String player5;
  
  int sorte = 0;
  
  String tempor;
  
  String titulo;
  
  MediaPlayer todos;
  
  String tres;
  
  public void backk(View paramView) {
    this.todos.start();
    AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
    builder.setTitle("Deseja realmente sair?");
    builder.setCancelable(false).setPositiveButton("Sim", new DialogInterface.OnClickListener() {
          public void onClick(DialogInterface param1DialogInterface, int param1Int) {
            Intent intent = new Intent((Context)jogo.this, inicio.class);
            jogo.this.startActivity(intent);
            jogo.placarpla1 = 0;
            jogo.placarpla2 = 0;
            jogo.placarpla3 = 0;
            jogo.placarpla4 = 0;
            jogo.placarpla5 = 0;
            jogo.this.finish();
          }
        }).setNegativeButton("Não", new DialogInterface.OnClickListener() {
          public void onClick(DialogInterface param1DialogInterface, int param1Int) {
            param1DialogInterface.cancel();
          }
        });
    builder.create().show();
  }
  
  public void chance1(View paramView) {
    this.emjogo.start();
    ((ImageView)findViewById(2131165228)).setVisibility(4);
    ((TextView)findViewById(2131165265)).setVisibility(0);
  }
  
  public void chance2(View paramView) {
    this.emjogo.start();
    TextView textView = (TextView)findViewById(2131165266);
    ((ImageView)findViewById(2131165229)).setVisibility(4);
    textView.setVisibility(0);
  }
  
  public void chance3(View paramView) {
    this.emjogo.start();
    ((ImageView)findViewById(2131165230)).setVisibility(4);
    ((TextView)findViewById(2131165267)).setVisibility(0);
  }
  
  public void chance4(View paramView) {
    this.emjogo.start();
    ((ImageView)findViewById(2131165231)).setVisibility(4);
    ((TextView)findViewById(2131165268)).setVisibility(0);
  }
  
  public void dica(View paramView) {
    this.emjogo.start();
    AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
    builder.setTitle("Dica");
    builder.setMessage(this.dicas).setCancelable(false).setNegativeButton("Ok", new DialogInterface.OnClickListener() {
          public void onClick(DialogInterface param1DialogInterface, int param1Int) {
            param1DialogInterface.cancel();
          }
        });
    builder.create().show();
  }
  
  public void efeito(View paramView) {
    ObjectAnimator.ofFloat(findViewById(2131165391), "alpha", new float[] { 1.0F, 0.0F }).start();
  }
  
  public void finrodada(View paramView) {
    this.emjogo.start();
    ((Button)findViewById(2131165306)).setVisibility(0);
    if (this.player5.equalsIgnoreCase("Vazio")) {
      if (this.player4.equalsIgnoreCase("Vazio")) {
        if (this.player3.equalsIgnoreCase("Vazio")) {
          Toast.makeText((Context)this, "Quem pontuou??", 1).show();
          ImageView imageView3 = (ImageView)findViewById(2131165391);
          CheckBox checkBox13 = (CheckBox)findViewById(2131165232);
          CheckBox checkBox14 = (CheckBox)findViewById(2131165233);
          checkBox13.setText(this.player1);
          checkBox14.setText(this.player2);
          ((ImageView)findViewById(2131165297)).setVisibility(4);
          imageView3.setVisibility(0);
          ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(imageView3, "alpha", new float[] { 0.0F, 1.0F });
          objectAnimator.setDuration(500L);
          objectAnimator.start();
          checkBox13.setVisibility(0);
          checkBox14.setVisibility(0);
          return;
        } 
        Toast.makeText((Context)this, "Quem pontuou??", 1).show();
        ImageView imageView2 = (ImageView)findViewById(2131165391);
        CheckBox checkBox10 = (CheckBox)findViewById(2131165232);
        CheckBox checkBox11 = (CheckBox)findViewById(2131165233);
        CheckBox checkBox12 = (CheckBox)findViewById(2131165234);
        ((ImageView)findViewById(2131165297)).setVisibility(4);
        checkBox10.setText(this.player1);
        checkBox11.setText(this.player2);
        checkBox12.setText(this.player3);
        imageView2.setVisibility(0);
        checkBox10.setVisibility(0);
        checkBox11.setVisibility(0);
        checkBox12.setVisibility(0);
        return;
      } 
      Toast.makeText((Context)this, "Quem pontuou??", 1).show();
      ImageView imageView1 = (ImageView)findViewById(2131165391);
      CheckBox checkBox6 = (CheckBox)findViewById(2131165232);
      CheckBox checkBox7 = (CheckBox)findViewById(2131165233);
      CheckBox checkBox8 = (CheckBox)findViewById(2131165234);
      CheckBox checkBox9 = (CheckBox)findViewById(2131165235);
      ((ImageView)findViewById(2131165297)).setVisibility(4);
      checkBox6.setText(this.player1);
      checkBox7.setText(this.player2);
      checkBox8.setText(this.player3);
      checkBox9.setText(this.player4);
      imageView1.setVisibility(0);
      checkBox6.setVisibility(0);
      checkBox7.setVisibility(0);
      checkBox8.setVisibility(0);
      checkBox9.setVisibility(0);
      return;
    } 
    Toast.makeText((Context)this, "Quem pontuou??", 1).show();
    ImageView imageView = (ImageView)findViewById(2131165391);
    CheckBox checkBox1 = (CheckBox)findViewById(2131165232);
    CheckBox checkBox2 = (CheckBox)findViewById(2131165233);
    CheckBox checkBox3 = (CheckBox)findViewById(2131165234);
    CheckBox checkBox4 = (CheckBox)findViewById(2131165235);
    CheckBox checkBox5 = (CheckBox)findViewById(2131165236);
    ((ImageView)findViewById(2131165297)).setVisibility(4);
    checkBox1.setText(this.player1);
    checkBox2.setText(this.player2);
    checkBox3.setText(this.player3);
    checkBox4.setText(this.player4);
    checkBox5.setText(this.player5);
    imageView.setVisibility(0);
    checkBox1.setVisibility(0);
    checkBox2.setVisibility(0);
    checkBox3.setVisibility(0);
    checkBox4.setVisibility(0);
    checkBox5.setVisibility(0);
  }
  
  public void finrodada2(View paramView) {
    this.emjogo.start();
    ((Button)findViewById(2131165330)).setVisibility(0);
    if (this.player5.equalsIgnoreCase("Vazio")) {
      if (this.player4.equalsIgnoreCase("Vazio")) {
        if (this.player3.equalsIgnoreCase("Vazio")) {
          ImageView imageView3 = (ImageView)findViewById(2131165391);
          CheckBox checkBox13 = (CheckBox)findViewById(2131165232);
          CheckBox checkBox14 = (CheckBox)findViewById(2131165233);
          checkBox13.setText(this.player1);
          checkBox14.setText(this.player2);
          ((ImageView)findViewById(2131165297)).setVisibility(4);
          imageView3.setVisibility(0);
          ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(imageView3, "alpha", new float[] { 0.0F, 1.0F });
          objectAnimator.setDuration(500L);
          objectAnimator.start();
          checkBox13.setVisibility(0);
          checkBox14.setVisibility(0);
          return;
        } 
        ImageView imageView2 = (ImageView)findViewById(2131165391);
        CheckBox checkBox10 = (CheckBox)findViewById(2131165232);
        CheckBox checkBox11 = (CheckBox)findViewById(2131165233);
        CheckBox checkBox12 = (CheckBox)findViewById(2131165234);
        ((ImageView)findViewById(2131165297)).setVisibility(4);
        checkBox10.setText(this.player1);
        checkBox11.setText(this.player2);
        checkBox12.setText(this.player3);
        imageView2.setVisibility(0);
        checkBox10.setVisibility(0);
        checkBox11.setVisibility(0);
        checkBox12.setVisibility(0);
        return;
      } 
      ImageView imageView1 = (ImageView)findViewById(2131165391);
      CheckBox checkBox6 = (CheckBox)findViewById(2131165232);
      CheckBox checkBox7 = (CheckBox)findViewById(2131165233);
      CheckBox checkBox8 = (CheckBox)findViewById(2131165234);
      CheckBox checkBox9 = (CheckBox)findViewById(2131165235);
      ((ImageView)findViewById(2131165297)).setVisibility(4);
      checkBox6.setText(this.player1);
      checkBox7.setText(this.player2);
      checkBox8.setText(this.player3);
      checkBox9.setText(this.player4);
      imageView1.setVisibility(0);
      checkBox6.setVisibility(0);
      checkBox7.setVisibility(0);
      checkBox8.setVisibility(0);
      checkBox9.setVisibility(0);
      return;
    } 
    ImageView imageView = (ImageView)findViewById(2131165391);
    CheckBox checkBox1 = (CheckBox)findViewById(2131165232);
    CheckBox checkBox2 = (CheckBox)findViewById(2131165233);
    CheckBox checkBox3 = (CheckBox)findViewById(2131165234);
    CheckBox checkBox4 = (CheckBox)findViewById(2131165235);
    CheckBox checkBox5 = (CheckBox)findViewById(2131165236);
    ((ImageView)findViewById(2131165297)).setVisibility(4);
    checkBox1.setText(this.player1);
    checkBox2.setText(this.player2);
    checkBox3.setText(this.player3);
    checkBox4.setText(this.player4);
    checkBox5.setText(this.player5);
    imageView.setVisibility(0);
    checkBox1.setVisibility(0);
    checkBox2.setVisibility(0);
    checkBox3.setVisibility(0);
    checkBox4.setVisibility(0);
    checkBox5.setVisibility(0);
  }
  
  public void next2(View paramView) {
    this.emjogo.start();
    ((Button)findViewById(2131165306)).setVisibility(4);
    TextView textView3 = (TextView)findViewById(2131165385);
    TextView textView5 = (TextView)findViewById(2131165386);
    TextView textView7 = (TextView)findViewById(2131165387);
    TextView textView9 = (TextView)findViewById(2131165388);
    textView3.setVisibility(4);
    textView5.setVisibility(4);
    textView7.setVisibility(4);
    textView9.setVisibility(4);
    ((ImageView)findViewById(2131165228)).setVisibility(0);
    ((ImageView)findViewById(2131165229)).setVisibility(0);
    ((ImageView)findViewById(2131165230)).setVisibility(0);
    ((ImageView)findViewById(2131165231)).setVisibility(0);
    ((TextView)findViewById(2131165265)).setVisibility(4);
    ((TextView)findViewById(2131165266)).setVisibility(4);
    ((TextView)findViewById(2131165267)).setVisibility(4);
    ((TextView)findViewById(2131165268)).setVisibility(4);
    ImageView imageView = (ImageView)findViewById(2131165391);
    CheckBox checkBox2 = (CheckBox)findViewById(2131165232);
    CheckBox checkBox3 = (CheckBox)findViewById(2131165233);
    CheckBox checkBox4 = (CheckBox)findViewById(2131165234);
    CheckBox checkBox5 = (CheckBox)findViewById(2131165235);
    CheckBox checkBox6 = (CheckBox)findViewById(2131165236);
    ((ImageView)findViewById(2131165297)).setVisibility(0);
    imageView.setVisibility(4);
    checkBox2.setVisibility(4);
    checkBox3.setVisibility(4);
    checkBox4.setVisibility(4);
    checkBox5.setVisibility(4);
    checkBox6.setVisibility(4);
    TextView textView2 = (TextView)findViewById(2131165265);
    TextView textView4 = (TextView)findViewById(2131165266);
    TextView textView6 = (TextView)findViewById(2131165267);
    TextView textView8 = (TextView)findViewById(2131165268);
    switch (((Integer)this.list.get(this.sorte)).intValue()) {
      case 60:
        textView2.setText("Se perguntarem, diga que essa pele é falsa.");
        textView4.setText("Nunca teremos piedade, nem mesmo para você.");
        textView6.setText("Nossos extintos são extremamente afiados.");
        textView8.setText("Este é o nosso caminho.");
        this.titulo = "Udry";
        this.dicas = "Esquecido...";
        break;
      case 59:
        textView2.setText("Que comece o banho de sangue.");
        textView4.setText("Seria medo, esse cheiro que sinto?");
        textView6.setText("Suas escolhas me agradam, por enquanto.");
        textView8.setText("A violência resolve tudo.");
        this.titulo = "Katarina";
        this.dicas = "Otaku que manja dos Shinpo";
        break;
      case 58:
        textView2.setText("Hora de dar as caras.");
        textView4.setText("Observe atentamente.");
        textView6.setText("Estão exatamente onde eu queria.");
        textView8.setText("Mas que trapaceiro você é.");
        this.titulo = "Leblanc";
        this.dicas = "Dibrado forever";
        break;
      case 57:
        textView2.setText("Meu machado está com sede!");
        textView4.setText("Finalmente,um pouco de diversão!");
        textView6.setText("Vamos lá, não vou machucar você. Eu prometo.");
        textView8.setText("O desejo de matar está crescendo!");
        this.titulo = "Olaf";
        this.dicas = "Um viking";
        break;
      case 56:
        textView2.setText("A mortalidade é uma fraqueza.");
        textView4.setText("Precisamos de um sacrifício.");
        textView6.setText("Não desafie a vontade do destino.");
        textView8.setText("Conforme mostra a clarividência.");
        this.titulo = "Malzahar";
        this.dicas = "Te passa AIDS.";
        break;
      case 55:
        textView2.setText("Mantenha distância!");
        textView4.setText("Criadores, me guiem!");
        textView6.setText("O tempo se esgota.");
        textView8.setText("Você não sabe nada sobre perdas.");
        this.titulo = "Ryze";
        this.dicas = "RIP Faker.";
        break;
      case 54:
        textView2.setText("Saiba qual é teu lugar.");
        textView4.setText("Tuas limitações será sua ruina.");
        textView6.setText("Teus esforços fúteis são... Desepcionantes.");
        textView8.setText("Isso é o melhor que podes fazer?");
        this.titulo = "Camille";
        this.dicas = "Coração da veia, chega a bater e forte.";
        break;
      case 53:
        textView2.setText("Traga o martelo, carga completa!");
        textView4.setText("Eu te assustei?");
        textView6.setText("Nosso futuro será brilhante.");
        textView8.setText("Transformação completa.");
        this.titulo = "Jayce";
        this.dicas = "Thor do LOL";
        break;
      case 52:
        textView2.setText("Talvez você deva reconsiderar esse pequeno encontro.");
        textView4.setText("Podem até me ver, não podem me deter mesmo.");
        textView6.setText("Quanto mais kunais, melhor!");
        textView8.setText("chega de meditações e de mestres.");
        this.titulo = "Akali";
        this.dicas = "Continua Broken.";
        break;
      case 51:
        textView2.setText("Mais um passo em direção ao fim.");
        textView4.setText("A cova que abro, é para você.");
        textView6.setText("O além aguarda por você.");
        textView8.setText("Eu lamentarei por ti.");
        this.titulo = "Yorick";
        this.dicas = "Servente de obra.";
        break;
      case 50:
        textView2.setText("A fúria consumiu tudo o que havia de bom de você irmão.");
        textView4.setText("Logo, não hávera nada.");
        textView6.setText("Sua alma sera avaliada.");
        textView8.setText("A morte, é uma amante cruel.");
        this.titulo = "Nasus";
        this.dicas = "Cachorro filósofo";
        break;
      case 49:
        textView2.setText("Massacre-os.");
        textView4.setText("Vou acabar com todos vocês.");
        textView6.setText("Deixarei o mundo em pedaços.");
        textView8.setText("Todos sofrerão o quanto eu sofri.");
        this.titulo = "Renekton";
        this.dicas = "O calor no deserto deve ter o deixado louco.";
        break;
      case 48:
        textView2.setText("Vamos logo com isso.");
        textView4.setText("Acerte onde dói.");
        textView6.setText("Derramo sangue por onde eu passo.");
        textView8.setText("Sutileza? Não é comigo.");
        this.titulo = "Draven";
        this.dicas = "Carrasco de Noxus.";
        break;
      case 47:
        textView2.setText("Vão se arrepender por se oporem a mim.");
        textView4.setText("Com uma força esmagadora.");
        textView6.setText("Testemunhem a verdadeira força!");
        textView8.setText("Um poder inigualável.");
        this.titulo = "Darius";
        this.dicas = "Irmão do estuprador compulsivo.";
        break;
      case 46:
        textView2.setText("Botar um ovo não é tao fácil como parece.");
        textView4.setText("Pobres criaturas, confinadas a uma única vida.");
        textView6.setText("Tão jovem, tão ingênuo.");
        textView8.setText("Pense além de uma vida.");
        this.titulo = "Anivia";
        this.dicas = "Parente das galinha";
        break;
      case 45:
        textView2.setText("Não me faça machucar você.");
        textView4.setText("Hora de brincar.");
        textView6.setText("Cinzas... Cinzas.. Todas elas cai.");
        textView8.setText("Você ta com cheiro de... Queimado.");
        this.titulo = "Annie";
        this.dicas = "NA madrasta";
        break;
      case 44:
        textView2.setText("Por que não ir beber leite quente então? ");
        textView4.setText("Pense com calma amizade.");
        textView6.setText("Você bate igual carneirinho, sem chifres.");
        textView8.setText("Estes sapatos, são apertados demais!");
        this.titulo = "Braum";
        this.dicas = "Ama os Poros";
        break;
      case 43:
        textView2.setText("Eu adoro um desafio.");
        textView4.setText("A todos só o que resta, é a morte.");
        textView6.setText("Quem se atreve a desobedecer minha vontade?");
        textView8.setText("Hoje é um bom dia para morrer.");
        this.titulo = "Jarvan IV";
        this.dicas = "Puto com o Sion";
        break;
      case 42:
        textView2.setText("Hora de lutar!");
        textView4.setText("Estão ao alcance de minhas garras.");
        textView6.setText("Sintam minha ferroaja.");
        textView8.setText("Nós pensamos da mesma forma invocador.");
        this.titulo = "Skarner";
        this.dicas = "Tem nojo de incetos.";
        break;
      case 41:
        textView2.setText("Os humanos acertaram em algumas coisas, como cerveja, cerveja escura.");
        textView4.setText("Isso não significa que somos amigos.");
        textView6.setText("Você parece merecer isso, não me desepcione.");
        textView8.setText("Forjando nervos de aço!");
        this.titulo = "ORN";
        this.dicas = "Cabrito passa reto";
        break;
      case 40:
        textView2.setText("Há algo podre, em você.");
        textView4.setText("A vida se alimenta da morte.");
        textView6.setText("É tão bom esticar os galhos.");
        textView8.setText("As árvores aprenderam a violência.");
        this.titulo = "Maokai";
        this.dicas = "Carvão vegetal jaja";
        break;
      case 39:
        textView2.setText("Eu terei minha vingança.");
        textView4.setText("Afundarei todos vocês.");
        textView6.setText("Todos se afogarão.");
        textView8.setText("Abandonado, para morrer.");
        this.titulo = "Nautilos";
        this.dicas = "Tank Raiz";
        break;
      case 38:
        textView2.setText("Descanse em paz.\n");
        textView4.setText("Levante-se e lute, custe o que custar.");
        textView6.setText("Comida de verme achando que pode.");
        textView8.setText("Tiro de sorte? Sorte é não tomar um tiro meu.\n");
        this.titulo = "Lucian";
        this.dicas = "Talaricado ao live";
        break;
      case 37:
        textView2.setText("Continue, adoro alvos em movimento.");
        textView4.setText("Como tirar doce de criança.");
        textView6.setText("É o fim da linha.");
        textView8.setText("Gosto dos meus inimigos de duas formas: Mortos ou de pé na cova.");
        this.titulo = "Graves";
        this.dicas = "Censurado";
        break;
      case 36:
        textView2.setText("Pessoas ricas, não passam de mentirosos... e mentirosos... morrem.\n");
        textView4.setText("Vou dar um mergulho para respirar, não me espere.");
        textView6.setText("Você nos deve sangue!");
        textView8.setText("Trabalhe duro, e morra cedo. A outra alternativa é pior.");
        this.titulo = "Pyke";
        this.dicas = "Expectativa/Realidade";
        break;
      case 35:
        textView2.setText("Lágrimas, parecem não ter qualquer função.");
        textView4.setText("Órgãos não podem ser removidos com segurança?");
        textView6.setText("Hum... Está é uma criatura frágil.");
        textView8.setText("Suas extermidades parecem ser desnecessárias.");
        this.titulo = "Vel'koz";
        this.dicas = "Maicon wasalski!";
        break;
      case 34:
        textView2.setText("Eles são absoletos.");
        textView4.setText("Destruir, e depois aprimorar.");
        textView6.setText("Eu sou o primeiro de muitos.");
        textView8.setText("O metal é a perfeição.");
        this.titulo = "Viktor";
        this.dicas = "Criador de skins";
        break;
      case 33:
        textView2.setText("Uma morte silênciosa.");
        textView4.setText("Preparar, vamos lá!");
        textView6.setText("Equilibrio em todas as coisas.\n");
        textView8.setText("Alvos grandes são os melhores, tem mais espaço para acertar.");
        this.titulo = "Kennen";
        this.dicas = "Mini flash";
        break;
      case 32:
        textView2.setText("Isso deve doer.");
        textView4.setText("Já era hora!");
        textView6.setText("Mexer, ou não mexer...");
        textView8.setText("Batido, não misturado.\n");
        this.titulo = "Singed";
        this.dicas = "Muita mecânica";
        break;
      case 31:
        textView2.setText("Quando você tem talento, não tem essa história de tiro de sorte.\n");
        textView4.setText("Eu quase nunca sei o que estou procurando, mas eu sempre acho.\n");
        textView6.setText("Exploradores de verdade, seguem a bússula do seu instinto.");
        textView8.setText("Parece que o mundo enlouqueceu... Bem na hora.");
        this.titulo = "Ezreal";
        this.dicas = "Largou o museu de mão";
        break;
      case 30:
        textView2.setText("Da para parar? To tentando acertar você!");
        textView4.setText("Últimas palavras? Há! Só morre.");
        textView6.setText("Fiz isso acidentalmente de propósito.");
        textView8.setText("Estou tentando me importar... Mas não consigo.");
        this.titulo = "Jinx";
        this.dicas = "Crackuda";
        break;
      case 29:
        textView2.setText("Um pouqinho de agarra e esmaga!");
        textView4.setText("Grupo de demolição: Uma garota.");
        textView6.setText("Adoro seu sorriso, ele me parece um alvo.");
        textView8.setText("Uma rodada de soco para a galera!");
        this.titulo = "Vi";
        this.dicas = "Seria um bom goleiro(a)";
        break;
      case 28:
        textView2.setText("Éh.. Rum...");
        textView4.setText("Ta.. Legal..");
        textView6.setText("Ok.");
        textView8.setText("Ta.. Rum...");
        this.titulo = "Rammus";
        this.dicas = "Mascote da copa de 2014";
        break;
      case 27:
        textView2.setText("Morte? Hum.. Nada simples assim.");
        textView4.setText("A carne é uma prisão.");
        textView6.setText("últimas palavras?");
        textView8.setText("Ah... Os doces sons da mizéria.");
        this.titulo = "Tresh";
        this.dicas = "Talarico de almas";
        break;
      case 26:
        textView2.setText("A era do homem, chegou ao fim.");
        textView4.setText("A magia me chama.");
        textView6.setText("Metal é mais rígido do que carne.");
        textView8.setText("Um golem em movimento não enferruja.");
        this.titulo = "Blitzcrank";
        this.dicas = "Bumblebee do LOL";
        break;
      case 25:
        textView2.setText("Nimguém questionará nossa determinação.");
        textView4.setText("Existe sabedoria na guerra.");
        textView6.setText("A indecição é um fracasso.");
        textView8.setText("Você sabe o que dizem, não se pode fugir de karma.");
        this.titulo = "Karma";
        this.dicas = "Precisa mesmo de dica?";
        break;
      case 24:
        textView2.setText("A ordem através da música.");
        textView4.setText("A fanfarra se eleva.");
        textView6.setText("Continue no ritmo.");
        textView8.setText("Acelerar em movimento, concordo.");
        this.titulo = "Sona";
        this.dicas = "Não fala muito.";
        break;
      case 23:
        textView2.setText("Pronto para a segunda rodada!");
        textView4.setText("Quanto maior eles forem, mais forte acerto eles.");
        textView6.setText("Ativar turbo!");
        textView8.setText("Éh... só precisa de um empurrãozinho.");
        this.titulo = "Rumble";
        this.dicas = "Ta pegando fogo bixo!";
        break;
      case 22:
        textView2.setText("Silêncio, sua magia é inútil contra mim!");
        textView4.setText("Você é inútil, e vazio.");
        textView6.setText("Eu tentei silenciar minha mãe uma vez, cara... Como me arrependo.");
        textView8.setText("A justiça, será feita.");
        this.titulo = "Kassadin";
        this.dicas = "Foi comprar cigarro.";
        break;
      case 21:
        textView2.setText("Eu só to tentando aproveitar a vida.");
        textView4.setText("Eu não preciso de nada, á não ser agora.");
        textView6.setText("Não faz corpo mole não! Vem com tudo!");
        textView8.setText("É total nojento e perigoso, é por isso que eu gosto!");
        this.titulo = "Rakan";
        this.dicas = "Ele é lindo!";
        break;
      case 20:
        textView2.setText("Dizem que eu não sei quando desistir, como se isso fosse uma ofença.");
        textView4.setText("Falar com qualquer pessoa sobre qualquer coisa, nunca esta na minha lista.");
        textView6.setText("As brigas de taverna, parece me perseguir.");
        textView8.setText("Humanos... São tão cegos.");
        this.titulo = "Xayah";
        this.dicas = "Que PENA de seus adversários.";
        break;
      case 19:
        textView2.setText("A pior parte de se perder uma lâmina, é procurar dentro de todas minhas vítimas.");
        textView4.setText("Aprecie o sabor do aço.");
        textView6.setText("Patético.");
        textView8.setText("Não há lugar para se esconder.");
        this.titulo = "Talon";
        this.dicas = "Assassin's cred";
        break;
      case 18:
        textView2.setText("Eu sou... Glacinata.");
        textView4.setText("Carne congela tão facilmente...");
        textView6.setText("Criança tola.");
        textView8.setText("O frio adormecerá sua dor.");
        this.titulo = "Lissandra";
        this.dicas = "Teve seu rosto rasgado por garras ursinas.";
        break;
      case 17:
        textView2.setText("Seus pilantras. Se preparem!");
        textView4.setText("Por que não existe nenhum dragão das neves? (Sons) Verdade! a gente poderia fazer um!");
        textView6.setText("A voz da fada estava vindo daqui, aposto que o gromp engoliu ela.");
        textView8.setText("Tombar, rolar e... Tombarolar! (Sons)");
        this.titulo = "Nunu";
        this.dicas = "Anda em uma montaria.";
        break;
      case 16:
        textView2.setText("Viva cada dia, como se fosse o primeiro.");
        textView4.setText("Que dia maravilhoso! O tipo preferido da groselheira.");
        textView6.setText("Nem todo errante esta perdido.");
        textView8.setText("É tão bom poder esticar os galhos.");
        this.titulo = "Ivern";
        this.dicas = "Adora um verde";
        break;
      case 15:
        textView2.setText("Tem certeza de que não está na liga errada?");
        textView4.setText("Vamos a luta!");
        textView6.setText("Olho por olho.");
        textView8.setText("A sua hora chegou.");
        this.titulo = "Kayle";
        this.dicas = "Um anjo.";
        break;
      case 14:
        textView2.setText("\nCriaturas inteligentes... Elas me temem.");
        textView4.setText("Consumir até os ossos!");
        textView6.setText("Minhas asas estão inquietas..");
        textView8.setText("Pronto para ceifar!");
        this.titulo = "Kha'zix";
        this.dicas = "Metamorfose ambulante.";
        break;
      case 13:
        textView2.setText("Só eu posso fugir do vazio!");
        textView4.setText("Seu tiro saiu pela culatra!");
        textView6.setText("o que levamos conosco, deve nos elevar, não nos derrubar.");
        textView8.setText("Memórias, amores, esperança, são meram necessidades.");
        this.titulo = "Kai'sa";
        this.dicas = "Seu vestimento não está morto.";
        break;
      case 12:
        textView2.setText("Retalhe a coragem deles.");
        textView4.setText("Verdadeiros guerreiros nascem em sangue.");
        textView6.setText("Isso não é um mero massacre, é a minha obra prima!");
        textView8.setText("Eles lhe saudarão como heróis.");
        this.titulo = "Aatrox";
        this.dicas = "Um destruidor de... Mundos?";
        break;
      case 11:
        textView2.setText("\"Eu, sou o oásis!");
        textView4.setText("Imperadores estufam o peito e caregam!");
        textView6.setText("Pruu.. Pruu...Pru...");
        textView8.setText("Meus soldados, marcham!");
        this.titulo = "Azir";
        this.dicas = "Um imperador em ascenção";
        break;
      case 10:
        textView2.setText("Até mesmo a menor das pedras pode balançar os seus.");
        textView4.setText("Toda lição é uma dadiva.");
        textView6.setText("A confiança de um passaro não está no galho!");
        textView8.setText("O trabalho árduo é capaz de polir as pedas mais ásperas.");
        this.titulo = "Taliyah";
        this.dicas = "Sua passiva, a faz parecer o Gabriel Medina.";
        break;
      case 9:
        textView2.setText("É assim que as estrelas caem... Se apaixonando.");
        textView4.setText("A noite mais escura tem as estrelas mais brilhantes.");
        textView6.setText("A misericórdia não é um luxo humano.. E também, uma responsabilidade.");
        textView8.setText("Se achou esperto não é mesmo?");
        this.titulo = "Ahri";
        this.dicas = "Referência a Naruto!";
        break;
      case 8:
        textView2.setText("Adversidade é o primeiro caminho para a verdade.");
        textView4.setText("A luz é definida... Pela escuridão.");
        textView6.setText("Meu espirito não está perdido!");
        textView8.setText("Uma espada quebrada, é o bastante para tipos como você!");
        this.titulo = "Riven";
        this.dicas = "Sua espada esta fora da garantia.";
        break;
      case 7:
        textView2.setText("Você não me pega! HUA-HUA!");
        textView4.setText("Nascente e poente, o fim também é um começo");
        textView6.setText("Eu nem sabia que meninos existiam! Eu quero um!");
        textView8.setText("Quando os seres daqui olham para cima será que acham que estamos olhando para baixo? Porque a gente não tá não.");
        this.titulo = "Zoe";
        this.dicas = "Olhos de cores distintas.";
        break;
      case 6:
        textView2.setText("A criança se foi, mas o assassino vive.");
        textView4.setText("Não precisava acabar assim.");
        textView6.setText("Fui forjado pela inclemente provicência da guerra.");
        textView8.setText("Você provará seu valor? Provavelmente, não...");
        this.titulo = "Kayn";
        this.dicas = "Luta para não se deixar ser controlado.";
        break;
      case 5:
        textView2.setText("Simetria é tão entediante.");
        textView4.setText("A tempestade esta nos corações deles. Eu os acalmo.");
        textView6.setText("A essência de algo é encontrada em sua ausência.");
        textView8.setText("Vivo pelo aplauso! Você vai morrer por ele.");
        this.titulo = "Jhin";
        this.dicas = "Um verdadeiro artista!";
        break;
      case 4:
        textView2.setText("As trevas vem de dentro.");
        textView4.setText("Despreze limitações.");
        textView6.setText("Segredos guardados, armas disperdiçadas.");
        textView8.setText("Tradição é o cadáver da sabedoria.");
        this.titulo = "Zed";
        this.dicas = "Sombrio!";
        break;
      case 3:
        textView2.setText("O amanhã não é garantido há ninguém.");
        textView4.setText("O caminho para ruina é mais curto do que pensa.");
        textView6.setText("Estou só procurando um caminho para casa.");
        textView8.setText("Seria o único propósito da folha o de cair?");
        this.titulo = "Yasuo";
        this.dicas = "x1 lixo?";
        break;
      case 2:
        textView2.setText("O único verdadeiro pecado é negar o desejo.");
        textView4.setText("Minha vontade é o que importa. A fome é o que nos guia.");
        textView6.setText("Uma vontade compartilhada é uma coisa poderosa.");
        textView8.setText("É do coranção que flue a água mais turva.");
        this.titulo = "Tahm Khench";
        this.dicas = "É um rei!";
        break;
      case 1:
        textView2.setText("O segredo para a imortalidade? Não morra.");
        textView4.setText("Raiva da motivação sem propósito.");
        textView6.setText("Olhe para seu interior");
        textView8.setText("A mente concentrada pode perfurar rochas.");
        this.titulo = "Master yi";
        this.dicas = "Mestre em uma arte marcial!";
        break;
      case 0:
        this.titulo = "Kindred";
        textView2.setText("Abraçar a vida significa aceitar a morte.");
        textView4.setText("Todas as coisas grandes e pequenas morrem.");
        textView6.setText("Retorne ao nada.");
        textView8.setText("Toda vida é temporária.");
        this.dicas = "Usa máscara!";
        break;
    } 
    CheckBox checkBox1 = (CheckBox)findViewById(2131165232);
    if (checkBox1.isChecked()) {
      placarpla1++;
      checkBox1.setChecked(false);
    } 
    checkBox1 = (CheckBox)findViewById(2131165233);
    if (checkBox1.isChecked()) {
      placarpla2++;
      checkBox1.setChecked(false);
    } 
    checkBox1 = (CheckBox)findViewById(2131165234);
    if (checkBox1.isChecked()) {
      placarpla3++;
      checkBox1.setChecked(false);
    } 
    checkBox1 = (CheckBox)findViewById(2131165235);
    if (checkBox1.isChecked()) {
      placarpla4++;
      checkBox1.setChecked(false);
    } 
    checkBox1 = (CheckBox)findViewById(2131165236);
    if (checkBox1.isChecked()) {
      placarpla5++;
      checkBox1.setChecked(false);
    } 
    if (placarpla1 + placarpla2 + placarpla3 + placarpla4 + placarpla5 == 0) {
      Toast.makeText((Context)this, "Por favor, Pontue alguém.", 0).show();
      return;
    } 
    this.sorte++;
    TextView textView1 = (TextView)findViewById(2131165401);
    if (this.f == 4) {
      if (this.sorte == 1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player1);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player1);
      } 
      if (this.sorte == 2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player2);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player2);
      } 
      if (this.sorte == 3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player1);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player1);
      } 
      if (this.sorte == 4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player2);
        stringBuilder.append(" e última rodada!");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player2);
        ((Button)findViewById(2131165306)).setVisibility(4);
        ((Button)findViewById(2131165215)).setVisibility(4);
        ((Button)findViewById(2131165300)).setVisibility(4);
        ((Button)findViewById(2131165301)).setVisibility(0);
        this.bundles.putString("player11", this.player1);
        this.bundles.putString("player21", this.player2);
        this.bundles.putString("player31", this.player3);
        this.bundles.putString("player41", this.player4);
        this.bundles.putString("player51", this.player5);
        return;
      } 
    } else if (this.f == 6) {
      if (this.sorte == 1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player1);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player1);
      } 
      if (this.sorte == 2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player2);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player2);
      } 
      if (this.sorte == 3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player3);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player3);
      } 
      if (this.sorte == 4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player1);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player1);
      } 
      if (this.sorte == 5) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player2);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player2);
      } 
      if (this.sorte == 6) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player3);
        stringBuilder.append(" e última rodada!");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player3);
        ((Button)findViewById(2131165306)).setVisibility(4);
        ((Button)findViewById(2131165215)).setVisibility(4);
        ((Button)findViewById(2131165300)).setVisibility(4);
        ((Button)findViewById(2131165301)).setVisibility(0);
        this.bundles.putString("player11", this.player1);
        this.bundles.putString("player21", this.player2);
        this.bundles.putString("player31", this.player3);
        this.bundles.putString("player41", this.player4);
        this.bundles.putString("player51", this.player5);
        return;
      } 
    } else {
      StringBuilder stringBuilder;
      if (this.f == 8) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          textView1.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          textView1.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          textView1.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          textView1.setText(this.player4);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          textView1.setText(this.player1);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          textView1.setText(this.player2);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          textView1.setText(this.player3);
        } 
        if (this.sorte == 8) {
          textView1.setText(this.player4);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player4);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 10) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player5);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player5);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 9) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 10) {
          stringBuilder.setText(this.player5);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player5);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 63) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 6) {
          stringBuilder.setText(this.player2);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player2);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 9) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 9) {
          stringBuilder.setText(this.player3);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player3);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 9) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 9) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 10) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 11) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 12) {
          stringBuilder.setText(this.player4);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player4);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 15) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player5);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player5);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 9) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 10) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player5);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player5);
        } 
        if (this.sorte == 11) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 12) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 13) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 14) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 15) {
          stringBuilder.setText(this.player5);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player5);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 105) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 9) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 10) {
          stringBuilder.setText(this.player2);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player2);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 155) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 9) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 10) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 11) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 12) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 13) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 14) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 15) {
          stringBuilder.setText(this.player3);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player3);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 20) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 9) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 10) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 11) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 12) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 13) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 14) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 15) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 16) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 17) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 18) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 19) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 20) {
          stringBuilder.setText(this.player4);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player4);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 20) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player5);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player5);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 9) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 10) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player5);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player5);
        } 
        if (this.sorte == 11) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 12) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 13) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 14) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 15) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player5);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player5);
        } 
        if (this.sorte == 16) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 17) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 18) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 19) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 20) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player5);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player5);
        } 
        if (this.sorte == 21) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 22) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 23) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 24) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 25) {
          stringBuilder.setText(this.player5);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player5);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
        } 
      } 
    } 
  }
  
  public void onBackPressed() {}
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131296284);
    int i;
    for (i = 0; i < 61; i++)
      this.list.add(new Integer(i)); 
    Collections.shuffle(this.list);
    for (i = 0; i < 60; i++);
    this.emjogo = MediaPlayer.create((Context)this, 2131427328);
    this.todos = MediaPlayer.create((Context)this, 2131427330);
    paramBundle = getIntent().getExtras();
    this.dois = paramBundle.getString("dois");
    this.tres = paramBundle.getString("tres");
    this.cinco = paramBundle.getString("cinco");
    this.tempor = paramBundle.getString("tempo");
    this.player1 = paramBundle.getString("player1");
    this.player2 = paramBundle.getString("player2");
    this.player3 = paramBundle.getString("player3");
    this.player4 = paramBundle.getString("player4");
    this.player5 = paramBundle.getString("player5");
    if (this.dois.equalsIgnoreCase("{}().")) {
      if (this.tres.equalsIgnoreCase("{}().")) {
        if (!this.cinco.equalsIgnoreCase("{}()."))
          if (this.player5.equalsIgnoreCase("{}().")) {
            this.player5 = "Vazio";
            if (this.player4.equalsIgnoreCase("{}().")) {
              this.player4 = "Vazio";
              if (this.player3.equalsIgnoreCase("{}().")) {
                this.player3 = "Vazio";
                this.f = 105;
              } else {
                this.f = 155;
              } 
            } else {
              this.f = 20;
            } 
          } else {
            this.f = 25;
          }  
      } else if (this.player5.equalsIgnoreCase("{}().")) {
        this.player5 = "Vazio";
        if (this.player4.equalsIgnoreCase("{}().")) {
          this.player4 = "Vazio";
          if (this.player3.equalsIgnoreCase("{}().")) {
            this.player3 = "Vazio";
            this.f = 63;
          } else {
            this.f = 9;
          } 
        } else {
          this.f = 12;
        } 
      } else {
        this.f = 15;
      } 
    } else if (this.player5.equalsIgnoreCase("{}().")) {
      this.player5 = "Vazio";
      if (this.player4.equalsIgnoreCase("{}().")) {
        this.player4 = "Vazio";
        if (this.player3.equalsIgnoreCase("{}().")) {
          this.player3 = "Vazio";
          this.f = 4;
        } else {
          this.f = 6;
        } 
      } else {
        this.f = 8;
      } 
    } else {
      this.f = 10;
    } 
    ((Button)findViewById(2131165306)).setVisibility(4);
    ImageView imageView = (ImageView)findViewById(2131165391);
    CheckBox checkBox2 = (CheckBox)findViewById(2131165232);
    CheckBox checkBox3 = (CheckBox)findViewById(2131165233);
    CheckBox checkBox4 = (CheckBox)findViewById(2131165234);
    CheckBox checkBox5 = (CheckBox)findViewById(2131165235);
    CheckBox checkBox6 = (CheckBox)findViewById(2131165236);
    imageView.setVisibility(4);
    checkBox2.setVisibility(4);
    checkBox3.setVisibility(4);
    checkBox4.setVisibility(4);
    checkBox5.setVisibility(4);
    checkBox6.setVisibility(4);
    TextView textView2 = (TextView)findViewById(2131165265);
    TextView textView3 = (TextView)findViewById(2131165266);
    TextView textView4 = (TextView)findViewById(2131165267);
    TextView textView5 = (TextView)findViewById(2131165268);
    switch (((Integer)this.list.get(this.sorte)).intValue()) {
      case 60:
        textView2.setText("Se perguntarem, diga que essa pele é falsa.");
        textView3.setText("Nunca teremos piedade, nem mesmo para você.");
        textView4.setText("Nossos extintos são extremamente afiados.");
        textView5.setText("Este é o nosso caminho.");
        this.titulo = "Udry";
        this.dicas = "Esquecido...";
        break;
      case 59:
        textView2.setText("Que comece o banho de sangue.");
        textView3.setText("Seria medo, esse cheiro que sinto?");
        textView4.setText("Suas escolhas me agradam, por enquanto.");
        textView5.setText("A violência resolve tudo.");
        this.titulo = "Katarina";
        this.dicas = "Otaku que manja dos Shinpo";
        break;
      case 58:
        textView2.setText("Hora de dar as caras.");
        textView3.setText("Observe atentamente.");
        textView4.setText("Estão exatamente onde eu queria.");
        textView5.setText("Mas que trapaceiro você é.");
        this.titulo = "Leblanc";
        this.dicas = "Dibrado forever";
        break;
      case 57:
        textView2.setText("Meu machado está com sede!");
        textView3.setText("Finalmente,um pouco de diversão!");
        textView4.setText("Vamos lá, não vou machucar você. Eu prometo.");
        textView5.setText("O desejo de matar está crescendo!");
        this.titulo = "Olaf";
        this.dicas = "Um viking";
        break;
      case 56:
        textView2.setText("A mortalidade é uma fraqueza.");
        textView3.setText("Precisamos de um sacrifício.");
        textView4.setText("Não desafie a vontade do destino.");
        textView5.setText("Conforme mostra a clarividência.");
        this.titulo = "Malzahar";
        this.dicas = "Te passa AIDS.";
        break;
      case 55:
        textView2.setText("Mantenha distância!");
        textView3.setText("Criadores, me guiem!");
        textView4.setText("O tempo se esgota.");
        textView5.setText("Você não sabe nada sobre perdas.");
        this.titulo = "Ryze";
        this.dicas = "RIP Faker.";
        break;
      case 54:
        textView2.setText("Saiba qual é teu lugar.");
        textView3.setText("Tuas limitações será sua ruina.");
        textView4.setText("Teus esforços fúteis são... Desepcionantes.");
        textView5.setText("Isso é o melhor que podes fazer?");
        this.titulo = "Camille";
        this.dicas = "Coração da veia, chega a bater e forte.";
        break;
      case 53:
        textView2.setText("Traga o martelo, carga completa!");
        textView3.setText("Eu te assustei?");
        textView4.setText("Nosso futuro será brilhante.");
        textView5.setText("Transformação completa.");
        this.titulo = "Jayce";
        this.dicas = "Thor do LOL";
        break;
      case 52:
        textView2.setText("Talvez você deva reconsiderar esse pequeno encontro.");
        textView3.setText("Podem até me ver, não podem me deter mesmo.");
        textView4.setText("Quanto mais kunais, melhor!");
        textView5.setText("chega de meditações e de mestres.");
        this.titulo = "Akali";
        this.dicas = "Continua Broken.";
        break;
      case 51:
        textView2.setText("Mais um passo em direção ao fim.");
        textView3.setText("A cova que abro, é para você.");
        textView4.setText("O além aguarda por você.");
        textView5.setText("Eu lamentarei por ti.");
        this.titulo = "Yorick";
        this.dicas = "Servente de obra.";
        break;
      case 50:
        textView2.setText("A fúria consumiu tudo o que havia de bom de você irmão.");
        textView3.setText("Logo, não hávera nada.");
        textView4.setText("Sua alma sera avaliada.");
        textView5.setText("A morte, é uma amante cruel.");
        this.titulo = "Nasus";
        this.dicas = "Cachorro filósofo";
        break;
      case 49:
        textView2.setText("Massacre-os.");
        textView3.setText("Vou acabar com todos vocês.");
        textView4.setText("Deixarei o mundo em pedaços.");
        textView5.setText("Todos sofrerão o quanto eu sofri.");
        this.titulo = "Renekton";
        this.dicas = "O calor no deserto deve ter o deixado louco.";
        break;
      case 48:
        textView2.setText("Vamos logo com isso.");
        textView3.setText("Acerte onde dói.");
        textView4.setText("Derramo sangue por onde eu passo.");
        textView5.setText("Sutileza? Não é comigo.");
        this.titulo = "Draven";
        this.dicas = "Carrasco de Noxus.";
        break;
      case 47:
        textView2.setText("Vão se arrepender por se oporem a mim.");
        textView3.setText("Com uma força esmagadora.");
        textView4.setText("Testemunhem a verdadeira força!");
        textView5.setText("Um poder inigualável.");
        this.titulo = "Darius";
        this.dicas = "Irmão do estuprador compulsivo.";
        break;
      case 46:
        textView2.setText("Botar um ovo não é tao fácil como parece.");
        textView3.setText("Pobres criaturas, confinadas a uma única vida.");
        textView4.setText("Tão jovem, tão ingênuo.");
        textView5.setText("Pense além de uma vida.");
        this.titulo = "Anivia";
        this.dicas = "Parente das galinha";
        break;
      case 45:
        textView2.setText("Não me faça machucar você.");
        textView3.setText("Hora de brincar.");
        textView4.setText("Cinzas... Cinzas.. Todas elas cai.");
        textView5.setText("Você ta com cheiro de... Queimado.");
        this.titulo = "Annie";
        this.dicas = "NA madrasta";
        break;
      case 44:
        textView2.setText("Por que não ir beber leite quente então? ");
        textView3.setText("Pense com calma amizade.");
        textView4.setText("Você bate igual carneirinho, sem chifres.");
        textView5.setText("Estes sapatos, são apertados demais!");
        this.titulo = "Braum";
        this.dicas = "Ama os Poros";
        break;
      case 43:
        textView2.setText("Eu adoro um desafio.");
        textView3.setText("A todos só o que resta, é a morte.");
        textView4.setText("Quem se atreve a desobedecer minha vontade?");
        textView5.setText("Hoje é um bom dia para morrer.");
        this.titulo = "Jarvan IV";
        this.dicas = "Puto com o Sion";
        break;
      case 42:
        textView2.setText("Hora de lutar!");
        textView3.setText("Estão ao alcance de minhas garras.");
        textView4.setText("Sintam minha ferroaja.");
        textView5.setText("Nós pensamos da mesma forma invocador.");
        this.titulo = "Skarner";
        this.dicas = "Tem nojo de incetos.";
        break;
      case 41:
        textView2.setText("Os humanos acertaram em algumas coisas, como cerveja, cerveja escura.");
        textView3.setText("Isso não significa que somos amigos.");
        textView4.setText("Você parece merecer isso, não me desepcione.");
        textView5.setText("Forjando nervos de aço!");
        this.titulo = "ORN";
        this.dicas = "Cabrito passa reto";
        break;
      case 40:
        textView2.setText("Há algo podre, em você.");
        textView3.setText("A vida se alimenta da morte.");
        textView4.setText("É tão bom esticar os galhos.");
        textView5.setText("As árvores aprenderam a violência.");
        this.titulo = "Maokai";
        this.dicas = "Carvão vegetal jaja";
        break;
      case 39:
        textView2.setText("Eu terei minha vingança.");
        textView3.setText("Afundarei todos vocês.");
        textView4.setText("Todos se afogarão.");
        textView5.setText("Abandonado, para morrer.");
        this.titulo = "Nautilos";
        this.dicas = "Tank Raiz";
        break;
      case 38:
        textView2.setText("Descanse em paz.\n");
        textView3.setText("Levante-se e lute, custe o que custar.");
        textView4.setText("Comida de verme achando que pode.");
        textView5.setText("Tiro de sorte? Sorte é não tomar um tiro meu.\n");
        this.titulo = "Lucian";
        this.dicas = "Talaricado ao live";
        break;
      case 37:
        textView2.setText("Continue, adoro alvos em movimento.");
        textView3.setText("Como tirar doce de criança.");
        textView4.setText("É o fim da linha.");
        textView5.setText("Gosto dos meus inimigos de duas formas: Mortos ou de pé na cova.");
        this.titulo = "Graves";
        this.dicas = "Censurado";
        break;
      case 36:
        textView2.setText("Pessoas ricas, não passam de mentirosos... e mentirosos... morrem.\n");
        textView3.setText("Vou dar um mergulho para respirar, não me espere.");
        textView4.setText("Você nos deve sangue!");
        textView5.setText("Trabalhe duro, e morra cedo. A outra alternativa é pior.");
        this.titulo = "Pyke";
        this.dicas = "Expectativa/Realidade";
        break;
      case 35:
        textView2.setText("Lágrimas, parecem não ter qualquer função.");
        textView3.setText("Órgãos não podem ser removidos com segurança?");
        textView4.setText("Hum... Está é uma criatura frágil.");
        textView5.setText("Suas extermidades parecem ser desnecessárias.");
        this.titulo = "Vel'koz";
        this.dicas = "Maicon wasalski!";
        break;
      case 34:
        textView2.setText("Eles são absoletos.");
        textView3.setText("Destruir, e depois aprimorar.");
        textView4.setText("Eu sou o primeiro de muitos.");
        textView5.setText("O metal é a perfeição.");
        this.titulo = "Viktor";
        this.dicas = "Criador de skins";
        break;
      case 33:
        textView2.setText("Uma morte silênciosa.");
        textView3.setText("Preparar, vamos lá!");
        textView4.setText("Equilibrio em todas as coisas.\n");
        textView5.setText("Alvos grandes são os melhores, tem mais espaço para acertar.");
        this.titulo = "Kennen";
        this.dicas = "Mini flash";
        break;
      case 32:
        textView2.setText("Isso deve doer.");
        textView3.setText("Já era hora!");
        textView4.setText("Mexer, ou não mexer...");
        textView5.setText("Batido, não misturado.\n");
        this.titulo = "Singed";
        this.dicas = "Muita mecânica";
        break;
      case 31:
        textView2.setText("Quando você tem talento, não tem essa história de tiro de sorte.\n");
        textView3.setText("Eu quase nunca sei o que estou procurando, mas eu sempre acho.\n");
        textView4.setText("Exploradores de verdade, seguem a bússula do seu instinto.");
        textView5.setText("Parece que o mundo enlouqueceu... Bem na hora.");
        this.titulo = "Ezreal";
        this.dicas = "Largou o museu de mão";
        break;
      case 30:
        textView2.setText("Da para parar? To tentando acertar você!");
        textView3.setText("Últimas palavras? Há! Só morre.");
        textView4.setText("Fiz isso acidentalmente de propósito.");
        textView5.setText("Estou tentando me importar... Mas não consigo.");
        this.titulo = "Jinx";
        this.dicas = "Crackuda";
        break;
      case 29:
        textView2.setText("Um pouqinho de agarra e esmaga!");
        textView3.setText("Grupo de demolição: Uma garota.");
        textView4.setText("Adoro seu sorriso, ele me parece um alvo.");
        textView5.setText("Uma rodada de soco para a galera!");
        this.titulo = "Vi";
        this.dicas = "Seria um bom goleiro(a)";
        break;
      case 28:
        textView2.setText("Éh.. Rum...");
        textView3.setText("Ta.. Legal..");
        textView4.setText("Ok.");
        textView5.setText("Ta.. Rum...");
        this.titulo = "Rammus";
        this.dicas = "Mascote da copa de 2014";
        break;
      case 27:
        textView2.setText("Morte? Hum.. Nada simples assim.");
        textView3.setText("A carne é uma prisão.");
        textView4.setText("últimas palavras?");
        textView5.setText("Ah... Os doces sons da mizéria.");
        this.titulo = "Tresh";
        this.dicas = "Talarico de almas";
        break;
      case 26:
        textView2.setText("A era do homem, chegou ao fim.");
        textView3.setText("A magia me chama.");
        textView4.setText("Metal é mais rígido do que carne.");
        textView5.setText("Um golem em movimento não enferruja.");
        this.titulo = "Blitzcrank";
        this.dicas = "Bumblebee do LOL";
        break;
      case 25:
        textView2.setText("Nimguém questionará nossa determinação.");
        textView3.setText("Existe sabedoria na guerra.");
        textView4.setText("A indecição é um fracasso.");
        textView5.setText("Você sabe o que dizem, não se pode fugir de karma.");
        this.titulo = "Karma";
        this.dicas = "Precisa mesmo de dica?";
        break;
      case 24:
        textView2.setText("A ordem através da música.");
        textView3.setText("A fanfarra se eleva.");
        textView4.setText("Continue no ritmo.");
        textView5.setText("Acelerar em movimento, concordo.");
        this.titulo = "Sona";
        this.dicas = "Não fala muito.";
        break;
      case 23:
        textView2.setText("Pronto para a segunda rodada!");
        textView3.setText("Quanto maior eles forem, mais forte acerto eles.");
        textView4.setText("Ativar turbo!");
        textView5.setText("Éh... só precisa de um empurrãozinho.");
        this.titulo = "Rumble";
        this.dicas = "Ta pegando fogo bixo!";
        break;
      case 22:
        textView2.setText("Silêncio, sua magia é inútil contra mim!");
        textView3.setText("Você é inútil, e vazio.");
        textView4.setText("Eu tentei silenciar minha mãe uma vez, cara... Como me arrependo.");
        textView5.setText("A justiça, será feita.");
        this.titulo = "Kassadin";
        this.dicas = "Foi comprar cigarro.";
        break;
      case 21:
        textView2.setText("Eu só to tentando aproveitar a vida.");
        textView3.setText("Eu não preciso de nada, á não ser agora.");
        textView4.setText("Não faz corpo mole não! Vem com tudo!");
        textView5.setText("É total nojento e perigoso, é por isso que eu gosto!");
        this.titulo = "Rakan";
        this.dicas = "Ele é lindo!";
        break;
      case 20:
        textView2.setText("Dizem que eu não sei quando desistir, como se isso fosse uma ofença.");
        textView3.setText("Falar com qualquer pessoa sobre qualquer coisa, nunca esta na minha lista.");
        textView4.setText("As brigas de taverna, parece me perseguir.");
        textView5.setText("Humanos... São tão cegos.");
        this.titulo = "Xayah";
        this.dicas = "Que PENA de seus adversários.";
        break;
      case 19:
        textView2.setText("A pior parte de se perder uma lâmina, é procurar dentro de todas minhas vítimas.");
        textView3.setText("Aprecie o sabor do aço.");
        textView4.setText("Patético.");
        textView5.setText("Não há lugar para se esconder.");
        this.titulo = "Talon";
        this.dicas = "Assassin's cred";
        break;
      case 18:
        textView2.setText("Eu sou... Glacinata.");
        textView3.setText("Carne congela tão facilmente...");
        textView4.setText("Criança tola.");
        textView5.setText("O frio adormecerá sua dor.");
        this.titulo = "Lissandra";
        this.dicas = "Teve seu rosto rasgado por garras ursinas.";
        break;
      case 17:
        textView2.setText("Seus pilantras. Se preparem!");
        textView3.setText("Por que não existe nenhum dragão das neves? (Sons) Verdade! a gente poderia fazer um!");
        textView4.setText("A voz da fada estava vindo daqui, aposto que o gromp engoliu ela.");
        textView5.setText("Tombar, rolar e... Tombarolar! (Sons)");
        this.titulo = "Nunu";
        this.dicas = "Anda em uma montaria.";
        break;
      case 16:
        textView2.setText("Viva cada dia, como se fosse o primeiro.");
        textView3.setText("Que dia maravilhoso! O tipo preferido da groselheira.");
        textView4.setText("Nem todo errante esta perdido.");
        textView5.setText("É tão bom poder esticar os galhos.");
        this.titulo = "Ivern";
        this.dicas = "Adora um verde";
        break;
      case 15:
        textView2.setText("Tem certeza de que não está na liga errada?");
        textView3.setText("Vamos a luta!");
        textView4.setText("Olho por olho.");
        textView5.setText("A sua hora chegou.");
        this.titulo = "Kayle";
        this.dicas = "Um anjo.";
        break;
      case 14:
        textView2.setText("\nCriaturas inteligentes... Elas me temem.");
        textView3.setText("Consumir até os ossos!");
        textView4.setText("Minhas asas estão inquietas..");
        textView5.setText("Pronto para ceifar!");
        this.titulo = "Kha'zix";
        this.dicas = "Metamorfose ambulante.";
        break;
      case 13:
        textView2.setText("Só eu posso fugir do vazio!");
        textView3.setText("Seu tiro saiu pela culatra!");
        textView4.setText("o que levamos conosco, deve nos elevar, não nos derrubar.");
        textView5.setText("Memórias, amores, esperança, são meram necessidades.");
        this.titulo = "Kai'sa";
        this.dicas = "Seu vestimento não está morto.";
        break;
      case 12:
        textView2.setText("Retalhe a coragem deles.");
        textView3.setText("Verdadeiros guerreiros nascem em sangue.");
        textView4.setText("Isso não é um mero massacre, é a minha obra prima!");
        textView5.setText("Eles lhe saudarão como heróis.");
        this.titulo = "Aatrox";
        this.dicas = "Um destruidor de... Mundos?";
        break;
      case 11:
        textView2.setText("\"Eu, sou o oásis!");
        textView3.setText("Imperadores estufam o peito e caregam!");
        textView4.setText("Pruu.. Pruu...Pru...");
        textView5.setText("Meus soldados, marcham!");
        this.titulo = "Azir";
        this.dicas = "Um imperador em ascenção";
        break;
      case 10:
        textView2.setText("Até mesmo a menor das pedras pode balançar os seus.");
        textView3.setText("Toda lição é uma dadiva.");
        textView4.setText("A confiança de um passaro não está no galho!");
        textView5.setText("O trabalho árduo é capaz de polir as pedas mais ásperas.");
        this.titulo = "Taliyah";
        this.dicas = "Sua passiva, a faz parecer o Gabriel Medina.";
        break;
      case 9:
        textView2.setText("É assim que as estrelas caem... Se apaixonando.");
        textView3.setText("A noite mais escura tem as estrelas mais brilhantes.");
        textView4.setText("A misericórdia não é um luxo humano.. E também, uma responsabilidade.");
        textView5.setText("Se achou esperto não é mesmo?");
        this.titulo = "Ahri";
        this.dicas = "Referência a Naruto!";
        break;
      case 8:
        textView2.setText("Adversidade é o primeiro caminho para a verdade.");
        textView3.setText("A luz é definida... Pela escuridão.");
        textView4.setText("Meu espirito não está perdido!");
        textView5.setText("Uma espada quebrada, é o bastante para tipos como você!");
        this.titulo = "Riven";
        this.dicas = "Sua espada esta fora da garantia.";
        break;
      case 7:
        textView2.setText("Você não me pega! HUA-HUA!");
        textView3.setText("Nascente e poente, o fim também é um começo");
        textView4.setText("Eu nem sabia que meninos existiam! Eu quero um!");
        textView5.setText("Quando os seres daqui olham para cima será que acham que estamos olhando para baixo? Porque a gente não tá não.");
        this.titulo = "Zoe";
        this.dicas = "Olhos de cores distintas.";
        break;
      case 6:
        textView2.setText("A criança se foi, mas o assassino vive.");
        textView3.setText("Não precisava acabar assim.");
        textView4.setText("Fui forjado pela inclemente provicência da guerra.");
        textView5.setText("Você provará seu valor? Provavelmente, não...");
        this.titulo = "Kayn";
        this.dicas = "Luta para não se deixar ser controlado.";
        break;
      case 5:
        textView2.setText("Simetria é tão entediante.");
        textView3.setText("A tempestade esta nos corações deles. Eu os acalmo.");
        textView4.setText("A essência de algo é encontrada em sua ausência.");
        textView5.setText("Vivo pelo aplauso! Você vai morrer por ele.");
        this.titulo = "Jhin";
        this.dicas = "Um verdadeiro artista!";
        break;
      case 4:
        textView2.setText("As trevas vem de dentro.");
        textView3.setText("Despreze limitações.");
        textView4.setText("Segredos guardados, armas disperdiçadas.");
        textView5.setText("Tradição é o cadáver da sabedoria.");
        this.titulo = "Zed";
        this.dicas = "Sombrio!";
        break;
      case 3:
        textView2.setText("O amanhã não é garantido há ninguém.");
        textView3.setText("O caminho para ruina é mais curto do que pensa.");
        textView4.setText("Estou só procurando um caminho para casa.");
        textView5.setText("Seria o único propósito da folha o de cair?");
        this.titulo = "Yasuo";
        this.dicas = "x1 lixo?";
        break;
      case 2:
        textView2.setText("O único verdadeiro pecado é negar o desejo.");
        textView3.setText("Minha vontade é o que importa. A fome é o que nos guia.");
        textView4.setText("Uma vontade compartilhada é uma coisa poderosa.");
        textView5.setText("É do coranção que flue a água mais turva.");
        this.titulo = "Tahm Khench";
        this.dicas = "É um rei!";
        break;
      case 1:
        textView2.setText("O segredo para a imortalidade? Não morra.");
        textView3.setText("Raiva da motivação sem propósito.");
        textView4.setText("Olhe para seu interior");
        textView5.setText("A mente concentrada pode perfurar rochas.");
        this.titulo = "Master yi";
        this.dicas = "Mestre em uma arte marcial!";
        break;
      case 0:
        this.titulo = "Kindred";
        textView2.setText("Abraçar a vida significa aceitar a morte.");
        textView3.setText("Todas as coisas grandes e pequenas morrem.");
        textView4.setText("Retorne ao nada.");
        textView5.setText("Toda vida é temporária.");
        this.dicas = "Usa máscara!";
        break;
    } 
    CheckBox checkBox1 = (CheckBox)findViewById(2131165232);
    if (checkBox1.isChecked()) {
      placarpla1++;
      checkBox1.setChecked(false);
    } 
    checkBox1 = (CheckBox)findViewById(2131165233);
    if (checkBox1.isChecked()) {
      placarpla2++;
      checkBox1.setChecked(false);
    } 
    checkBox1 = (CheckBox)findViewById(2131165234);
    if (checkBox1.isChecked()) {
      placarpla3++;
      checkBox1.setChecked(false);
    } 
    checkBox1 = (CheckBox)findViewById(2131165235);
    if (checkBox1.isChecked()) {
      placarpla4++;
      checkBox1.setChecked(false);
    } 
    checkBox1 = (CheckBox)findViewById(2131165236);
    if (checkBox1.isChecked()) {
      placarpla5++;
      checkBox1.setChecked(false);
    } 
    this.sorte++;
    TextView textView1 = (TextView)findViewById(2131165401);
    if (this.f == 4) {
      if (this.sorte == 1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player1);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player1);
      } 
      if (this.sorte == 2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player2);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player2);
      } 
      if (this.sorte == 3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player1);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player1);
      } 
      if (this.sorte == 4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player2);
        stringBuilder.append(" e última rodada!");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player2);
        ((Button)findViewById(2131165306)).setVisibility(4);
        ((Button)findViewById(2131165215)).setVisibility(4);
        ((Button)findViewById(2131165300)).setVisibility(4);
        ((Button)findViewById(2131165301)).setVisibility(0);
        this.bundles.putString("player11", this.player1);
        this.bundles.putString("player21", this.player2);
        this.bundles.putString("player31", this.player3);
        this.bundles.putString("player41", this.player4);
        this.bundles.putString("player51", this.player5);
        return;
      } 
    } else if (this.f == 6) {
      if (this.sorte == 1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player1);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player1);
      } 
      if (this.sorte == 2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player2);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player2);
      } 
      if (this.sorte == 3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player3);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player3);
      } 
      if (this.sorte == 4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player1);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player1);
      } 
      if (this.sorte == 5) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player2);
        stringBuilder.append("");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player2);
      } 
      if (this.sorte == 6) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vez de ");
        stringBuilder.append(this.player3);
        stringBuilder.append(" e última rodada!");
        Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
        textView1.setText(this.player3);
        ((Button)findViewById(2131165306)).setVisibility(4);
        ((Button)findViewById(2131165215)).setVisibility(4);
        ((Button)findViewById(2131165300)).setVisibility(4);
        ((Button)findViewById(2131165301)).setVisibility(0);
        this.bundles.putString("player11", this.player1);
        this.bundles.putString("player21", this.player2);
        this.bundles.putString("player31", this.player3);
        this.bundles.putString("player41", this.player4);
        this.bundles.putString("player51", this.player5);
        return;
      } 
    } else {
      StringBuilder stringBuilder;
      if (this.f == 8) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          textView1.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          textView1.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          textView1.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          textView1.setText(this.player4);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          textView1.setText(this.player1);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          textView1.setText(this.player2);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          textView1.setText(this.player3);
        } 
        if (this.sorte == 8) {
          textView1.setText(this.player4);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player4);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 10) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player5);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player5);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 9) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 10) {
          stringBuilder.setText(this.player5);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player5);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 63) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 6) {
          stringBuilder.setText(this.player2);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player2);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 9) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 9) {
          stringBuilder.setText(this.player3);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player3);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 9) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 9) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 10) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 11) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 12) {
          stringBuilder.setText(this.player4);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player4);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 15) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player5);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player5);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 9) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 10) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player5);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player5);
        } 
        if (this.sorte == 11) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 12) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 13) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 14) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 15) {
          stringBuilder.setText(this.player5);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player5);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 105) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 9) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 10) {
          stringBuilder.setText(this.player2);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player2);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 155) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 9) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 10) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 11) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 12) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 13) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 14) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 15) {
          stringBuilder.setText(this.player3);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player3);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 20) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 9) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 10) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 11) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 12) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 13) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 14) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 15) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 16) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 17) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 18) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 19) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 20) {
          stringBuilder.setText(this.player4);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player4);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
          return;
        } 
      } else if (this.f == 20) {
        if (this.sorte == 1) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 2) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 3) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 4) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 5) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player5);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player5);
        } 
        if (this.sorte == 6) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 7) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 8) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 9) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 10) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player5);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player5);
        } 
        if (this.sorte == 11) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 12) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 13) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 14) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 15) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player5);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player5);
        } 
        if (this.sorte == 16) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 17) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 18) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 19) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 20) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player5);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player5);
        } 
        if (this.sorte == 21) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player1);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player1);
        } 
        if (this.sorte == 22) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player2);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player2);
        } 
        if (this.sorte == 23) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player3);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player3);
        } 
        if (this.sorte == 24) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Vez de ");
          stringBuilder1.append(this.player4);
          stringBuilder1.append("");
          Toast.makeText((Context)this, stringBuilder1.toString(), 0).show();
          stringBuilder.setText(this.player4);
        } 
        if (this.sorte == 25) {
          stringBuilder.setText(this.player5);
          stringBuilder = new StringBuilder();
          stringBuilder.append("Vez de ");
          stringBuilder.append(this.player5);
          stringBuilder.append(" e última rodada!");
          Toast.makeText((Context)this, stringBuilder.toString(), 0).show();
          ((Button)findViewById(2131165306)).setVisibility(4);
          ((Button)findViewById(2131165215)).setVisibility(4);
          ((Button)findViewById(2131165300)).setVisibility(4);
          ((Button)findViewById(2131165301)).setVisibility(0);
          this.bundles.putString("player11", this.player1);
          this.bundles.putString("player21", this.player2);
          this.bundles.putString("player31", this.player3);
          this.bundles.putString("player41", this.player4);
          this.bundles.putString("player51", this.player5);
        } 
      } 
    } 
  }
  
  public void rank(View paramView) {
    this.emjogo.start();
    if (((CheckBox)findViewById(2131165232)).isChecked())
      placarpla1++; 
    if (((CheckBox)findViewById(2131165233)).isChecked())
      placarpla2++; 
    if (((CheckBox)findViewById(2131165234)).isChecked())
      placarpla3++; 
    if (((CheckBox)findViewById(2131165235)).isChecked())
      placarpla4++; 
    if (((CheckBox)findViewById(2131165236)).isChecked())
      placarpla5++; 
    Intent intent = new Intent((Context)this, placar.class);
    intent.putExtras(this.bundles);
    startActivity(intent);
  }
  
  public void resps(View paramView) {
    this.emjogo.start();
    ((TextView)findViewById(2131165344)).setText(this.titulo);
    (new Handler()).postDelayed(new Runnable() {
          public void run() {
            ((TextView)jogo.this.findViewById(2131165344)).setText("Toque para ver a resposta");
          }
        },  2500L);
  }
  
  public void trocar(View paramView) {
    AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
    builder.setTitle("Deseja realmente trocar de frases?");
    builder.setCancelable(false).setPositiveButton("Sim", new DialogInterface.OnClickListener() {
          public void onClick(DialogInterface param1DialogInterface, int param1Int) {
            ((Button)jogo.this.findViewById(2131165306)).setVisibility(4);
            ImageView imageView1 = (ImageView)jogo.this.findViewById(2131165391);
            CheckBox checkBox1 = (CheckBox)jogo.this.findViewById(2131165232);
            CheckBox checkBox2 = (CheckBox)jogo.this.findViewById(2131165233);
            CheckBox checkBox3 = (CheckBox)jogo.this.findViewById(2131165234);
            CheckBox checkBox4 = (CheckBox)jogo.this.findViewById(2131165235);
            CheckBox checkBox5 = (CheckBox)jogo.this.findViewById(2131165236);
            imageView1.setVisibility(4);
            checkBox1.setVisibility(4);
            checkBox2.setVisibility(4);
            checkBox3.setVisibility(4);
            checkBox4.setVisibility(4);
            checkBox5.setVisibility(4);
            TextView textView1 = (TextView)jogo.this.findViewById(2131165265);
            TextView textView2 = (TextView)jogo.this.findViewById(2131165266);
            TextView textView3 = (TextView)jogo.this.findViewById(2131165267);
            TextView textView4 = (TextView)jogo.this.findViewById(2131165268);
            ImageView imageView2 = (ImageView)jogo.this.findViewById(2131165228);
            ImageView imageView3 = (ImageView)jogo.this.findViewById(2131165229);
            ImageView imageView4 = (ImageView)jogo.this.findViewById(2131165230);
            ImageView imageView5 = (ImageView)jogo.this.findViewById(2131165231);
            imageView2.setVisibility(0);
            imageView3.setVisibility(0);
            imageView4.setVisibility(0);
            imageView5.setVisibility(0);
            textView1.setVisibility(4);
            textView2.setVisibility(4);
            textView4.setVisibility(4);
            textView3.setVisibility(4);
            switch (((Integer)jogo.this.list.get(jogo.this.sorte)).intValue()) {
              default:
                jogo.this.sorte++;
                return;
              case 60:
                textView1.setText("Se perguntarem, diga que essa pele é falsa.");
                textView2.setText("Nunca teremos piedade, nem mesmo para você.");
                textView3.setText("Nossos extintos são extremamente afiados.");
                textView4.setText("Este é o nosso caminho.");
                jogo.this.titulo = "Udry";
                jogo.this.dicas = "Esquecido...";
                return;
              case 59:
                textView1.setText("Que comece o banho de sangue.");
                textView2.setText("Seria medo, esse cheiro que sinto?");
                textView3.setText("Suas escolhas me agradam, por enquanto.");
                textView4.setText("A violência resolve tudo.");
                jogo.this.titulo = "Katarina";
                jogo.this.dicas = "Otaku que manja dos Shinpo";
                return;
              case 58:
                textView1.setText("Hora de dar as caras.");
                textView2.setText("Observe atentamente.");
                textView3.setText("Estão exatamente onde eu queria.");
                textView4.setText("Mas que trapaceiro você é.");
                jogo.this.titulo = "Leblanc";
                jogo.this.dicas = "Dibrado forever";
                return;
              case 57:
                textView1.setText("Meu machado está com sede!");
                textView2.setText("Finalmente,um pouco de diversão!");
                textView3.setText("Vamos lá, não vou machucar você. Eu prometo.");
                textView4.setText("O desejo de matar está crescendo!");
                jogo.this.titulo = "Olaf";
                jogo.this.dicas = "Um viking";
                return;
              case 56:
                textView1.setText("A mortalidade é uma fraqueza.");
                textView2.setText("Precisamos de um sacrifício.");
                textView3.setText("Não desafie a vontade do destino.");
                textView4.setText("Conforme mostra a clarividência.");
                jogo.this.titulo = "Malzahar";
                jogo.this.dicas = "Te passa AIDS.";
                return;
              case 55:
                textView1.setText("Mantenha distância!");
                textView2.setText("Criadores, me guiem!");
                textView3.setText("O tempo se esgota.");
                textView4.setText("Você não sabe nada sobre perdas.");
                jogo.this.titulo = "Ryze";
                jogo.this.dicas = "RIP Faker.";
                return;
              case 54:
                textView1.setText("Saiba qual é teu lugar.");
                textView2.setText("Tuas limitações será sua ruina.");
                textView3.setText("Teus esforços fúteis são... Desepcionantes.");
                textView4.setText("Isso é o melhor que podes fazer?");
                jogo.this.titulo = "Camille";
                jogo.this.dicas = "Coração da veia, chega a bater e forte.";
                return;
              case 53:
                textView1.setText("Traga o martelo, carga completa!");
                textView2.setText("Eu te assustei?");
                textView3.setText("Nosso futuro será brilhante.");
                textView4.setText("Transformação completa.");
                jogo.this.titulo = "Jayce";
                jogo.this.dicas = "Thor do LOL";
                return;
              case 52:
                textView1.setText("Talvez você deva reconsiderar esse pequeno encontro.");
                textView2.setText("Podem até me ver, não podem me deter mesmo.");
                textView3.setText("Quanto mais kunais, melhor!");
                textView4.setText("chega de meditações e de mestres.");
                jogo.this.titulo = "Akali";
                jogo.this.dicas = "Continua Broken.";
                return;
              case 51:
                textView1.setText("Mais um passo em direção ao fim.");
                textView2.setText("A cova que abro, é para você.");
                textView3.setText("O além aguarda por você.");
                textView4.setText("Eu lamentarei por ti.");
                jogo.this.titulo = "Yorick";
                jogo.this.dicas = "Servente de obra.";
                return;
              case 50:
                textView1.setText("A fúria consumiu tudo o que havia de bom de você irmão.");
                textView2.setText("Logo, não hávera nada.");
                textView3.setText("Sua alma sera avaliada.");
                textView4.setText("A morte, é uma amante cruel.");
                jogo.this.titulo = "Nasus";
                jogo.this.dicas = "Cachorro filósofo";
                return;
              case 49:
                textView1.setText("Massacre-os.");
                textView2.setText("Vou acabar com todos vocês.");
                textView3.setText("Deixarei o mundo em pedaços.");
                textView4.setText("Todos sofrerão o quanto eu sofri.");
                jogo.this.titulo = "Renekton";
                jogo.this.dicas = "O calor no deserto deve ter o deixado louco.";
                return;
              case 48:
                textView1.setText("Vamos logo com isso.");
                textView2.setText("Acerte onde dói.");
                textView3.setText("Derramo sangue por onde eu passo.");
                textView4.setText("Sutileza? Não é comigo.");
                jogo.this.titulo = "Draven";
                jogo.this.dicas = "Carrasco de Noxus.";
                return;
              case 47:
                textView1.setText("Vão se arrepender por se oporem a mim.");
                textView2.setText("Com uma força esmagadora.");
                textView3.setText("Testemunhem a verdadeira força!");
                textView4.setText("Um poder inigualável.");
                jogo.this.titulo = "Darius";
                jogo.this.dicas = "Irmão do estuprador compulsivo.";
                return;
              case 46:
                textView1.setText("Botar um ovo não é tao fácil como parece.");
                textView2.setText("Pobres criaturas, confinadas a uma única vida.");
                textView3.setText("Tão jovem, tão ingênuo.");
                textView4.setText("Pense além de uma vida.");
                jogo.this.titulo = "Anivia";
                jogo.this.dicas = "Parente das galinha";
                return;
              case 45:
                textView1.setText("Não me faça machucar você.");
                textView2.setText("Hora de brincar.");
                textView3.setText("Cinzas... Cinzas.. Todas elas cai.");
                textView4.setText("Você ta com cheiro de... Queimado.");
                jogo.this.titulo = "Annie";
                jogo.this.dicas = "NA madrasta";
                return;
              case 44:
                textView1.setText("Por que não ir beber leite quente então? ");
                textView2.setText("Pense com calma amizade.");
                textView3.setText("Você bate igual carneirinho, sem chifres.");
                textView4.setText("Estes sapatos, são apertados demais!");
                jogo.this.titulo = "Braum";
                jogo.this.dicas = "Ama os Poros";
                return;
              case 43:
                textView1.setText("Eu adoro um desafio.");
                textView2.setText("A todos só o que resta, é a morte.");
                textView3.setText("Quem se atreve a desobedecer minha vontade?");
                textView4.setText("Hoje é um bom dia para morrer.");
                jogo.this.titulo = "Jarvan IV";
                jogo.this.dicas = "Puto com o Sion";
                return;
              case 42:
                textView1.setText("Hora de lutar!");
                textView2.setText("Estão ao alcance de minhas garras.");
                textView3.setText("Sintam minha ferroaja.");
                textView4.setText("Nós pensamos da mesma forma invocador.");
                jogo.this.titulo = "Skarner";
                jogo.this.dicas = "Tem nojo de incetos.";
                return;
              case 41:
                textView1.setText("Os humanos acertaram em algumas coisas, como cerveja, cerveja escura.");
                textView2.setText("Isso não significa que somos amigos.");
                textView3.setText("Você parece merecer isso, não me desepcione.");
                textView4.setText("Forjando nervos de aço!");
                jogo.this.titulo = "ORN";
                jogo.this.dicas = "Cabrito passa reto";
                return;
              case 40:
                textView1.setText("Há algo podre, em você.");
                textView2.setText("A vida se alimenta da morte.");
                textView3.setText("É tão bom esticar os galhos.");
                textView4.setText("As árvores aprenderam a violência.");
                jogo.this.titulo = "Maokai";
                jogo.this.dicas = "Carvão vegetal jaja";
                return;
              case 39:
                textView1.setText("Eu terei minha vingança.");
                textView2.setText("Afundarei todos vocês.");
                textView3.setText("Todos se afogarão.");
                textView4.setText("Abandonado, para morrer.");
                jogo.this.titulo = "Nautilos";
                jogo.this.dicas = "Tank Raiz";
                return;
              case 38:
                textView1.setText("Descanse em paz.\n");
                textView2.setText("Levante-se e lute, custe o que custar.");
                textView3.setText("Comida de verme achando que pode.");
                textView4.setText("Tiro de sorte? Sorte é não tomar um tiro meu.\n");
                jogo.this.titulo = "Lucian";
                jogo.this.dicas = "Talaricado ao live";
                return;
              case 37:
                textView1.setText("Continue, adoro alvos em movimento.");
                textView2.setText("Como tirar doce de criança.");
                textView3.setText("É o fim da linha.");
                textView4.setText("Gosto dos meus inimigos de duas formas: Mortos ou de pé na cova.");
                jogo.this.titulo = "Graves";
                jogo.this.dicas = "Censurado";
                return;
              case 36:
                textView1.setText("Pessoas ricas, não passam de mentirosos... e mentirosos... morrem.\n");
                textView2.setText("Vou dar um mergulho para respirar, não me espere.");
                textView3.setText("Você nos deve sangue!");
                textView4.setText("Trabalhe duro, e morra cedo. A outra alternativa é pior.");
                jogo.this.titulo = "Pyke";
                jogo.this.dicas = "Expectativa/Realidade";
                return;
              case 35:
                textView1.setText("Lágrimas, parecem não ter qualquer função.");
                textView2.setText("Órgãos não podem ser removidos com segurança?");
                textView3.setText("Hum... Está é uma criatura frágil.");
                textView4.setText("Suas extermidades parecem ser desnecessárias.");
                jogo.this.titulo = "Vel'koz";
                jogo.this.dicas = "Maicon wasalski!";
                return;
              case 34:
                textView1.setText("Eles são absoletos.");
                textView2.setText("Destruir, e depois aprimorar.");
                textView3.setText("Eu sou o primeiro de muitos.");
                textView4.setText("O metal é a perfeição.");
                jogo.this.titulo = "Viktor";
                jogo.this.dicas = "Criador de skins";
                return;
              case 33:
                textView1.setText("Uma morte silênciosa.");
                textView2.setText("Preparar, vamos lá!");
                textView3.setText("Equilibrio em todas as coisas.\n");
                textView4.setText("Alvos grandes são os melhores, tem mais espaço para acertar.");
                jogo.this.titulo = "Kennen";
                jogo.this.dicas = "Mini flash";
                return;
              case 32:
                textView1.setText("Isso deve doer.");
                textView2.setText("Já era hora!");
                textView3.setText("Mexer, ou não mexer...");
                textView4.setText("Batido, não misturado.\n");
                jogo.this.titulo = "Singed";
                jogo.this.dicas = "Muita mecânica";
                return;
              case 31:
                textView1.setText("Quando você tem talento, não tem essa história de tiro de sorte.\n");
                textView2.setText("Eu quase nunca sei o que estou procurando, mas eu sempre acho.\n");
                textView3.setText("Exploradores de verdade, seguem a bússula do seu instinto.");
                textView4.setText("Parece que o mundo enlouqueceu... Bem na hora.");
                jogo.this.titulo = "Ezreal";
                jogo.this.dicas = "Largou o museu de mão";
                return;
              case 30:
                textView1.setText("Da para parar? To tentando acertar você!");
                textView2.setText("Últimas palavras? Há! Só morre.");
                textView3.setText("Fiz isso acidentalmente de propósito.");
                textView4.setText("Estou tentando me importar... Mas não consigo.");
                jogo.this.titulo = "Jinx";
                jogo.this.dicas = "Crackuda";
                return;
              case 29:
                textView1.setText("Um pouqinho de agarra e esmaga!");
                textView2.setText("Grupo de demolição: Uma garota.");
                textView3.setText("Adoro seu sorriso, ele me parece um alvo.");
                textView4.setText("Uma rodada de soco para a galera!");
                jogo.this.titulo = "Vi";
                jogo.this.dicas = "Seria um bom goleiro(a)";
                return;
              case 28:
                textView1.setText("Éh.. Rum...");
                textView2.setText("Ta.. Legal..");
                textView3.setText("Ok.");
                textView4.setText("Ta.. Rum...");
                jogo.this.titulo = "Rammus";
                jogo.this.dicas = "Mascote da copa de 2014";
                return;
              case 27:
                textView1.setText("Morte? Hum.. Nada simples assim.");
                textView2.setText("A carne é uma prisão.");
                textView3.setText("últimas palavras?");
                textView4.setText("Ah... Os doces sons da mizéria.");
                jogo.this.titulo = "Tresh";
                jogo.this.dicas = "Talarico de almas";
                return;
              case 26:
                textView1.setText("A era do homem, chegou ao fim.");
                textView2.setText("A magia me chama.");
                textView3.setText("Metal é mais rígido do que carne.");
                textView4.setText("Um golem em movimento não enferruja.");
                jogo.this.titulo = "Blitzcrank";
                jogo.this.dicas = "Bumblebee do LOL";
                return;
              case 25:
                textView1.setText("Nimguém questionará nossa determinação.");
                textView2.setText("Existe sabedoria na guerra.");
                textView3.setText("A indecição é um fracasso.");
                textView4.setText("Você sabe o que dizem, não se pode fugir de karma.");
                jogo.this.titulo = "Karma";
                jogo.this.dicas = "Precisa mesmo de dica?";
                return;
              case 24:
                textView1.setText("A ordem através da música.");
                textView2.setText("A fanfarra se eleva.");
                textView3.setText("Continue no ritmo.");
                textView4.setText("Acelerar em movimento, concordo.");
                jogo.this.titulo = "Sona";
                jogo.this.dicas = "Não fala muito.";
                return;
              case 23:
                textView1.setText("Pronto para a segunda rodada!");
                textView2.setText("Quanto maior eles forem, mais forte acerto eles.");
                textView3.setText("Ativar turbo!");
                textView4.setText("Éh... só precisa de um empurrãozinho.");
                jogo.this.titulo = "Rumble";
                jogo.this.dicas = "Ta pegando fogo bixo!";
                return;
              case 22:
                textView1.setText("Silêncio, sua magia é inútil contra mim!");
                textView2.setText("Você é inútil, e vazio.");
                textView3.setText("Eu tentei silenciar minha mãe uma vez, cara... Como me arrependo.");
                textView4.setText("A justiça, será feita.");
                jogo.this.titulo = "Kassadin";
                jogo.this.dicas = "Foi comprar cigarro.";
                return;
              case 21:
                textView1.setText("Eu só to tentando aproveitar a vida.");
                textView2.setText("Eu não preciso de nada, á não ser agora.");
                textView3.setText("Não faz corpo mole não! Vem com tudo!");
                textView4.setText("É total nojento e perigoso, é por isso que eu gosto!");
                jogo.this.titulo = "Rakan";
                jogo.this.dicas = "Ele é lindo!";
                return;
              case 20:
                textView1.setText("Dizem que eu não sei quando desistir, como se isso fosse uma ofença.");
                textView2.setText("Falar com qualquer pessoa sobre qualquer coisa, nunca esta na minha lista.");
                textView3.setText("As brigas de taverna, parece me perseguir.");
                textView4.setText("Humanos... São tão cegos.");
                jogo.this.titulo = "Xayah";
                jogo.this.dicas = "Que PENA de seus adversários.";
                return;
              case 19:
                textView1.setText("A pior parte de se perder uma lâmina, é procurar dentro de todas minhas vítimas.");
                textView2.setText("Aprecie o sabor do aço.");
                textView3.setText("Patético.");
                textView4.setText("Não há lugar para se esconder.");
                jogo.this.titulo = "Talon";
                jogo.this.dicas = "Assassin's cred";
                return;
              case 18:
                textView1.setText("Eu sou... Glacinata.");
                textView2.setText("Carne congela tão facilmente...");
                textView3.setText("Criança tola.");
                textView4.setText("O frio adormecerá sua dor.");
                jogo.this.titulo = "Lissandra";
                jogo.this.dicas = "Teve seu rosto rasgado por garras ursinas.";
                return;
              case 17:
                textView1.setText("Seus pilantras. Se preparem!");
                textView2.setText("Por que não existe nenhum dragão das neves? (Sons) Verdade! a gente poderia fazer um!");
                textView3.setText("A voz da fada estava vindo daqui, aposto que o gromp engoliu ela.");
                textView4.setText("Tombar, rolar e... Tombarolar! (Sons)");
                jogo.this.titulo = "Nunu";
                jogo.this.dicas = "Anda em uma montaria.";
                return;
              case 16:
                textView1.setText("Viva cada dia, como se fosse o primeiro.");
                textView2.setText("Que dia maravilhoso! O tipo preferido da groselheira.");
                textView3.setText("Nem todo errante esta perdido.");
                textView4.setText("É tão bom poder esticar os galhos.");
                jogo.this.titulo = "Ivern";
                jogo.this.dicas = "Adora um verde";
                return;
              case 15:
                textView1.setText("Tem certeza de que não está na liga errada?");
                textView2.setText("Vamos a luta!");
                textView3.setText("Olho por olho.");
                textView4.setText("A sua hora chegou.");
                jogo.this.titulo = "Kayle";
                jogo.this.dicas = "Um anjo.";
                return;
              case 14:
                textView1.setText("\nCriaturas inteligentes... Elas me temem.");
                textView2.setText("Consumir até os ossos!");
                textView3.setText("Minhas asas estão inquietas..");
                textView4.setText("Pronto para ceifar!");
                jogo.this.titulo = "Kha'zix";
                jogo.this.dicas = "Metamorfose ambulante.";
                return;
              case 13:
                textView1.setText("Só eu posso fugir do vazio!");
                textView2.setText("Seu tiro saiu pela culatra!");
                textView3.setText("o que levamos conosco, deve nos elevar, não nos derrubar.");
                textView4.setText("Memórias, amores, esperança, são meram necessidades.");
                jogo.this.titulo = "Kai'sa";
                jogo.this.dicas = "Seu vestimento não está morto.";
                return;
              case 12:
                textView1.setText("Retalhe a coragem deles.");
                textView2.setText("Verdadeiros guerreiros nascem em sangue.");
                textView3.setText("Isso não é um mero massacre, é a minha obra prima!");
                textView4.setText("Eles lhe saudarão como heróis.");
                jogo.this.titulo = "Aatrox";
                jogo.this.dicas = "Um destruidor de... Mundos?";
                return;
              case 11:
                textView1.setText("\"Eu, sou o oásis!");
                textView2.setText("Imperadores estufam o peito e caregam!");
                textView3.setText("Pruu.. Pruu...Pru...");
                textView4.setText("Meus soldados, marcham!");
                jogo.this.titulo = "Azir";
                jogo.this.dicas = "Um imperador em ascenção";
                return;
              case 10:
                textView1.setText("Até mesmo a menor das pedras pode balançar os seus.");
                textView2.setText("Toda lição é uma dadiva.");
                textView3.setText("A confiança de um passaro não está no galho!");
                textView4.setText("O trabalho árduo é capaz de polir as pedas mais ásperas.");
                jogo.this.titulo = "Taliyah";
                jogo.this.dicas = "Sua passiva, a faz parecer o Gabriel Medina.";
                return;
              case 9:
                textView1.setText("É assim que as estrelas caem... Se apaixonando.");
                textView2.setText("A noite mais escura tem as estrelas mais brilhantes.");
                textView3.setText("A misericórdia não é um luxo humano.. E também, uma responsabilidade.");
                textView4.setText("Se achou esperto não é mesmo?");
                jogo.this.titulo = "Ahri";
                jogo.this.dicas = "Referência a Naruto!";
                return;
              case 8:
                textView1.setText("Adversidade é o primeiro caminho para a verdade.");
                textView2.setText("A luz é definida... Pela escuridão.");
                textView3.setText("Meu espirito não está perdido!");
                textView4.setText("Uma espada quebrada, é o bastante para tipos como você!");
                jogo.this.titulo = "Riven";
                jogo.this.dicas = "Sua espada esta fora da garantia.";
                return;
              case 7:
                textView1.setText("Você não me pega! HUA-HUA!");
                textView2.setText("Nascente e poente, o fim também é um começo");
                textView3.setText("Eu nem sabia que meninos existiam! Eu quero um!");
                textView4.setText("Quando os seres daqui olham para cima será que acham que estamos olhando para baixo? Porque a gente não tá não.");
                jogo.this.titulo = "Zoe";
                jogo.this.dicas = "Olhos de cores distintas.";
                return;
              case 6:
                textView1.setText("A criança se foi, mas o assassino vive.");
                textView2.setText("Não precisava acabar assim.");
                textView3.setText("Fui forjado pela inclemente provicência da guerra.");
                textView4.setText("Você provará seu valor? Provavelmente, não...");
                jogo.this.titulo = "Kayn";
                jogo.this.dicas = "Luta para não se deixar ser controlado.";
                return;
              case 5:
                textView1.setText("Simetria é tão entediante.");
                textView2.setText("A tempestade esta nos corações deles. Eu os acalmo.");
                textView3.setText("A essência de algo é encontrada em sua ausência.");
                textView4.setText("Vivo pelo aplauso! Você vai morrer por ele.");
                jogo.this.titulo = "Jhin";
                jogo.this.dicas = "Um verdadeiro artista!";
                return;
              case 4:
                textView1.setText("As trevas vem de dentro.");
                textView2.setText("Despreze limitações.");
                textView3.setText("Segredos guardados, armas disperdiçadas.");
                textView4.setText("Tradição é o cadáver da sabedoria.");
                jogo.this.titulo = "Zed";
                jogo.this.dicas = "Sombrio!";
                return;
              case 3:
                textView1.setText("O amanhã não é garantido há ninguém.");
                textView2.setText("O caminho para ruina é mais curto do que pensa.");
                textView3.setText("Estou só procurando um caminho para casa.");
                textView4.setText("Seria o único propósito da folha o de cair?");
                jogo.this.titulo = "Yasuo";
                jogo.this.dicas = "x1 lixo?";
                return;
              case 2:
                textView1.setText("O único verdadeiro pecado é negar o desejo.");
                textView2.setText("Minha vontade é o que importa. A fome é o que nos guia.");
                textView3.setText("Uma vontade compartilhada é uma coisa poderosa.");
                textView4.setText("É do coranção que flue a água mais turva.");
                jogo.this.titulo = "Tahm Khench";
                jogo.this.dicas = "É um rei!";
                return;
              case 1:
                textView1.setText("O segredo para a imortalidade? Não morra.");
                textView2.setText("Raiva da motivação sem propósito.");
                textView3.setText("Olhe para seu interior");
                textView4.setText("A mente concentrada pode perfurar rochas.");
                jogo.this.titulo = "Master yi";
                jogo.this.dicas = "Mestre em uma arte marcial!";
                return;
              case 0:
                break;
            } 
            jogo.this.titulo = "Kindred";
            textView1.setText("Abraçar a vida significa aceitar a morte.");
            textView2.setText("Todas as coisas grandes e pequenas morrem.");
            textView3.setText("Retorne ao nada.");
            textView4.setText("Toda vida é temporária.");
            jogo.this.dicas = "Usa máscara!";
          }
        }).setNegativeButton("Não", new DialogInterface.OnClickListener() {
          public void onClick(DialogInterface param1DialogInterface, int param1Int) {
            param1DialogInterface.cancel();
          }
        });
    builder.create().show();
  }
}


/* Location:              C:\Users\05013719070\Downloads\dex2jar-2.0\dex2jar-2.0\5-1-dex2jar.jar!\xv\adivinheicampeo_lolzin\jogo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */