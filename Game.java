package OOP.Petsitter;
import java.util.Scanner;

public class Game {
    private Player p;
    Scanner sc = new Scanner(System.in);
    public Game() {
        p = new Player();
        System.out.println("Your Username: ");
        String name = sc.next();
        p.setUsername(name);
    }

    public void playgame() {
        int pilihan = 0;
        while (pilihan <= 9) {
            // tampilkan menu
            System.out.println("WHAT TO DO :");
            System.out.println("1. Buy a pet");
            System.out.println("2. Play with pet");
            System.out.println("3. Train pet");
            System.out.println("4. Feed pet");
            System.out.println("5. Put pet to bath");
            System.out.println("6. Put the pet to bed");
            System.out.println("7. Sell the pet");
            System.out.println("8. View pet status");
            System.out.println("9. Exit");
            System.out.println("Choose: ");
            pilihan = sc.nextInt();

            // suruh pet dari player untuk melakukan aktivitas yang dipilih
            switch (pilihan) {
                case 1:
                    Dog newDog = new Dog();
                    System.out.println("Name your pet: ");
                    String dogname = sc.nextLine() + sc.next();
                    newDog.setName(dogname);
                    p.addDog(newDog);
                    break;
                case 2:
                    System.out.println(p.getPet() == null);
                    if (p.getPet() != null) {
                        p.getPet().play();
                        
                    } else {
                        System.out.println("You must buy a set first!");
                    }
                    break;
                case 3:
                    if (p.getPet() != null) {
                        p.getPet().train();
                    } else {
                        System.out.println("You must buy a set first!");
                    }
                    break;
                case 4:
                    if (p.getPet() != null) {
                        p.getPet().eat();
                    } else {
                        System.out.println("You must buy a set first!");
                    }
                    break;
                case 5:
                    if (p.getPet() != null) {
                        p.getPet().bath();
                    } else {
                        System.out.println("You must buy a set first!");
                    }
                    break;
                case 6:
                    if (p.getPet() != null) {
                        p.getPet().sleep();
                    } else {
                        System.out.println("You must buy a set first!");
                    }
                    break;
                case 7:
                    Dog d = p.getPet();
                    System.out.println("Your pet status: ");
                    System.out.println("Name            : " + d.getName());
                    System.out.println("age             : " + d.getAge());
                    System.out.println("health          : " + d.getHealth());
                    System.out.println("Happiness       : " + d.getHappiness());
                    System.out.println("Interlligenece  :" + d.getIntelligence());
                    System.out.println("Cleaniness      :" + d.getCleniness());
                    System.out.println("Fullnes         :" + d.getFullness());
                    System.out.println("Price           :" + d.getPrice());
                    break;
                case 8:
                    if (p.getPet() != null) {
                        p.sellDog();

                    } else {
                        System.out.println("You must buy a set first!");
                    }
                    break;
                case 9:
                    System.exit(0);
                    break;

            }
            if (p.getPet() != null) {
                if (p.getPet().isDie()) {
                    p.dogDies();
                }
            }
        }
    }

}
