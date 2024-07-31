package com.example;


import com.example.command.LightOnCommand;
import com.example.command.LightOffCommand;
import com.example.invoker.RemoteControl;
import com.example.receiver.Light;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Light light = new Light();

        
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        
        RemoteControl remoteControl = new RemoteControl();

        while (true) {
            System.out.println("1. Turn On Light");
            System.out.println("2. Turn Off Light");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                remoteControl.setCommand(lightOn);
                remoteControl.pressButton();
            } else if (choice == 2) {
                remoteControl.setCommand(lightOff);
                remoteControl.pressButton();
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
