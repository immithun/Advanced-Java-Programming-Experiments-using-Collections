import java.util.*;
public class Main {
private static int board = 100;
private static Map<Integer, Integer>snakes = new HashMap<>();
private static Map<Integer, Integer>ladders = new HashMap<>();
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int numsnakes,numladders,currp=1;
System.out.print("Enter the number of snakes: ");
numsnakes = s.nextInt();
initializesnakes(numsnakes);
System.out.print("Enter the number of ladders: ");
numladders = s.nextInt();
initializeladders(numladders);
while (currp < board) {
System.out.print("Press Enter to roll the dice.");
s.nextLine();
int diceRoll = rollDice();
System.out.println("You rolled a " + diceRoll + ".");
int newp = currp + diceRoll;
newp = applydice(newp);
if (newp <= board) {
currp = newp;
}
displayBoard(currp);
}
System.out.println("Congratulations! You reached position 100 You win!");
}
private static void initializesnakes(int n) {
for (int i = 1;i<=n; i++) {
Scanner s1 = new Scanner(System.in);
System.out.print("Enter the head position of snake "+i+": ");
int head = s1.nextInt();
System.out.print("Enter the tail position of snake "+i+": ");
int tail = s1.nextInt();
snakes.put(head, tail);
}
}
private static void initializeladders(int n) {
Scanner s2 = new Scanner(System.in);
for (int i=1;i<=n;i++) {
System.out.print("Enter the bottom position of ladder "+i +": ");
int bottom = s2.nextInt();
System.out.print("Enter the top position of ladder "+i+": ");
int top = s2.nextInt();
ladders.put(bottom, top);
}
}
private static int rollDice() {
int k= (int)(Math.random()*6)+1;
return k;
}
private static int applydice(int pos) {
if(snakes.containsKey(pos)) {
System.out.println("Oops! You landed on a snake.Sliding down to position 
"+snakes.get(pos)+".");
return snakes.get(pos);
} else if(ladders.containsKey(pos)) {
System.out.println("Hooray! You landed on a ladder.Climbing up to position 
"+ladders.get(pos)+".");
return ladders.get(pos);
}
return pos;
}
private static void displayBoard(int currp) {
for (int i=1;i<=board;i++) {
if (i==currp) {
System.out.print("P ");
}else{
System.out.print(i+" ");
}
if (i%10==0) {
System.out.println();
}
}
}
