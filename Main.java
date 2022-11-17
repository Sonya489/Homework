import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] q = new String[5];

        q[0] = "Вы зашли в темную комнату. В темноте слышен пугающий шорох. Ваши действия?";
        q[1] = "Выйти из комнаты";
        q[2] = "Включить свет";
        q[3] = "Шагнуть навстречу зловещему звуку";
        q[4] = "Крикнуть что есть сил 'уходи отсюда!'";

        Scanner superscanner = new Scanner(System.in);

        boolean gameOver = false;
        int counter = 10;
        int trueAnswer = 0;

        while (gameOver != true) {
            if (counter == 0){
                System.out.println("Звук послышался совсем близко и что-то резко затянуло вас в пучину тьмы! Вы проиграли.");
                break;
            }
            System.out.println(q[0]);
            for (int i = 1; i < 5; i++) {
                System.out.println(i + ": " + q[i]);
            }

            System.out.print("Ваши действия: ");
            int answer = superscanner.nextInt();

            if (answer == 1) {
                System.out.println("Разумно и безопасно. Вы остались целы, хоть и не узнали, что это было");
                gameOver = true; 
            }

            if (answer == 2) {
                q[0] = "Выключатель предательски треснул. Свет не включился, пугающий шорох все ближе";
                q[2] = "Еще раз попробовать включить свет {для самых одаренных}";
                trueAnswer++;
                counter--;
                if (trueAnswer == 5){
                    System.out.println("Внезапно свет включился, и вы проснулись. К счастью всё это был сон!");
                    System.out.println("Вы выиграли!");
                    break;
                }
            }

            if (answer == 3){
                q[0] ="Шорох становится всё громче и громче!";
                counter--;
            }
            if (answer == 4) {
                q[0] ="Звук быстро приближается!";
                counter--;
            }

        }
    }
}