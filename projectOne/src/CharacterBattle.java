import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {

        Scanner animegame = new Scanner(System.in);


        int HP;
        int winpoint1 = 0;
        int winpoint2 = 0;


        System.out.println("Enter odd number of rounds: ");
        int oddRounds = Integer.parseInt(animegame.nextLine());


        while(oddRounds % 2 == 0) {
            System.out.println("That is not an odd number");
            oddRounds = Integer.parseInt(animegame.nextLine());
        }

        for(int i = 1;  i <= oddRounds; i++){
            System.out.println("ROUND " + i);

            System.out.println("Enter the name of any character in media you prefer: ");
            String Player1 = animegame.nextLine();
            System.out.println(Player1);
            System.out.println("remember to give character stats based on the they are given canonically");


            System.out.println("Name your Special Move: ");
            String AttackName1 = animegame.nextLine();

            System.out.println("GIVE ME NUMBERS FROM NOW ON.");

            System.out.println("How much HP do you want: ");
            int HP1 = Integer.parseInt(animegame.nextLine());
            System.out.println("How much destruction should it cause: ");
            int AttackPower1 = Integer.parseInt(animegame.nextLine());
            System.out.println("How fast is your attack: ");
            int AttackSpeed1 = Integer.parseInt(animegame.nextLine());


            System.out.println("Enter the name of any character in media you prefer: ");
            String Player2 = animegame.nextLine();
            System.out.println(Player2);
            System.out.println("remember to give character stats based on the they are given canonically");

            System.out.println("Name your Special Move: ");
            String AttackName2 = animegame.nextLine();

            System.out.println("GIVE ME NUMBERS FROM NOW ON.");

            System.out.println("How much HP do you want: ");
            int HP2 = Integer.parseInt(animegame.nextLine());
            System.out.println("How much destruction should it cause: ");
            int AttackPower2 = Integer.parseInt(animegame.nextLine());
            System.out.println("How fast is your attack: ");
            int AttackSpeed2 = Integer.parseInt(animegame.nextLine());

            while(HP1 > 0 && HP2 > 0 ){
                if (AttackSpeed1 > AttackSpeed2){
                    HP2 -= AttackPower1;
                    HP1 -= AttackPower2;
                } else if  (AttackSpeed2 > AttackSpeed1){
                    HP1 -= AttackPower2;
                    HP2 -= AttackPower1;
                }  else if (AttackSpeed1 == AttackSpeed2){

                    Random Randturn =  new Random();
                    int randomTYRN = Randturn.nextInt(2);
                    if (randomTYRN == 0){
                        HP2 -= AttackPower1;
                        HP1 -= AttackPower2;
                    } else if (randomTYRN == 1) {
                        HP1 -= AttackPower2;
                        HP2 -= AttackPower1;
                    }

                }


            }
            if(HP1 <= 0){
                System.out.println(Player2 + " WON... for now ");
                winpoint2++;
                System.out.println(Player2 + " WINS: " +winpoint2);


            } else if (HP2 <= 0){
                System.out.println(Player1 + " WON... for now ");
                winpoint1++;
                System.out.println(Player1 + " WINS: " + winpoint1);

            }


        }
        if(winpoint1 > winpoint2){
            System.out.println("PLAYER 1 WON THE ENTIRE GAME");
            System.out.println("Congrats gal");
        } else if (winpoint2 > winpoint1){
            System.out.println("PLAYER 1 WON THE ENTIRE GAME");
            System.out.println("Congrats gal");
        }


        }







    }

