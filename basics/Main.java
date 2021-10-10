import java.time.LocalDateTime;
public class Main {
  public static void main(String[] args){
   int dogCount = 2;
   System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + "."); 
   int catCount = 1;
   System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
   flipNHeads(1);
   clock(); 
}
  static String pluralize(String word, int num){
  if(num == 0 || num > 1)
    return word+'s';
  else
    return word;
  }
  
  static void flipNHeads(int numOfHeads){
    int counter = 0;
    int flips = 0;
    while(numOfHeads>counter){
      double randomNumber = Math.random();
      if(randomNumber<0.5){
      System.out.println("tails");
    }
    else{
      System.out.println("heads");
      counter++;
    }
    flips++;
  }
    System.out.println("it took "+ flips +" flips to flip " +numOfHeads +" head in a row");
  }
  
  static void clock() {
LocalDateTime now = LocalDateTime.now();
int second = now.getSecond(); 
  while(true){ 
    now = LocalDateTime.now();
if(second != now.getSecond()){
    int hour = now.getHour();
    int minute = now.getMinute();
    int newSecond = now.getSecond();
    System.out.println(hour+":"+minute+":"+second);
    second = newSecond;
}

   }
  }
}