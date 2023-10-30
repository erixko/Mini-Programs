package com.vrablic.michal;

public class Opilec {

    public static void opilec(int Width , int Distance) throws InterruptedException {

        int drunk_man_pos_left = Width/2;
        int drunk_man_pos_right = Width/2;


        do{
            System.out.println("Krcma> " + "*".repeat(drunk_man_pos_left) + "#" + "*".repeat(drunk_man_pos_right) + " <Domov");
            int randomChoice = (Math.random() < 0.5) ? 0 : 1;
            if(randomChoice == 0) {
                drunk_man_pos_left--;
                drunk_man_pos_right++;
            }if(randomChoice == 1) {
                drunk_man_pos_left++;
                drunk_man_pos_right--;
            }



            if(drunk_man_pos_left < 0) {
                System.out.println("Opicel sa dostal do krcmy");
                return;
            }else if(drunk_man_pos_right < 0){
                System.out.println("Opicel sa dostal domov");
                return;
            }
            Thread.sleep(400);

            Distance--;
        }while(Distance > 0);
        System.out.println("Opilec zaspal na ceste");
    }
}
