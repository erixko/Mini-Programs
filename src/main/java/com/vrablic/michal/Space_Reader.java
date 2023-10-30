package com.vrablic.michal;

import java.util.Scanner;

public class Space_Reader {
    static int num = 0;
    public static int read_space(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String line = scanner.nextLine();
        for(int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == ' ') {
                num++;
            }
        }
    return num;
    }
}
