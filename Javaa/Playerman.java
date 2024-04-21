import java.util.Scanner;
interface playable{
void play()
}

class mp3player implements playable{
public void play(){
System.out.println("playing mp3 audio");
}}

class wavplayer implements playable{
public void play(){
System.out.println("playing wavplayer");
}}

class musicplayer{
public void playaudio(playable audio){
audio.play();
}}

public class Playermain{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
mp3player obj=new mp3player();
mavplayer obj2=new mavplayer();
musicplayer obj3 =new musicplayer();
int choice=scanner.nextInt();
switch(choice){
case 1:
musicplayer.playaudio(mp3player);
break;
case 2:
musicplayer.playaudio(wavplayer);
break;
default:
System.out.println(invalid choice");
}
scanner.close();
}}