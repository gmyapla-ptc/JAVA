
public class TECHPPRIEST_0372_COMMAND_CONSOLE {
    public static void main (String[]args) {    
    System.out.println("=== TECHPPRIEST 0372 COMMAND CONSOLE ===");
    System.out.println("1. Check Techpriest Status");
    System.out.println("2. Check Weapon");
    System.out.println("3. Request Reinforcement");
    System.out.println("4. Self-Destruct");
    System.out.println("5. EXIT");
        System.out.println();
        System.out.println("----------------------------------------------");
        

        int choice = 3;
        int weaponchoice = 1;


        switch (choice) {
            case 1:
                System.out.println("=====STATUS=====");
                System.out.println("NAME : GERECHO 0372");
                System.out.println("CLASS : Technoarcheologist ");
                System.out.println("SERIAL NUMBER : MARS-0372");
                System.out.println("Health Status : Functional");
                System.out.println("Optics 1 : Optical input severely DAMAGE");
                System.out.println("Optics 2 : Optical input severely DAMAGE");
                System.out.println("Vox-synthesizer  : input Optimal");
                System.out.println("Audio-feeds 1 : input FUNCTIONAL");
                System.out.println("Audio-feeds 2 : input barely FUNCTIONAL");
                System.out.println("Respiratory Augmetics : FUNCTIONAL");
                System.out.println("Manipulators 1 :  Optimal");
                System.out.println("Manipulators 2 :  Optimal");
                System.out.println("Locomotors 1 :  Optimal");
                System.out.println("Locomotors 2 :  Optimal");
                System.out.println("Mechadendrites 1 :  OFFLINE");
                System.out.println("Mechadendrites 2 :  DAMAGED");
                System.out.println("Mechadendrites 3 :  OFFLINE");
                System.out.println();
                System.out.println("----------------------------------------------");
                break;
                
                
            case 2:
                System.out.println("WEAPON SETS INVENTORY");
                switch (weaponchoice) {
                    case 1:
                        System.out.println("Primary Weapon : Arc Rifle");
                        System.out.println("Secondary Weapon 1: Grav-Pistol");
                        System.out.println("Secondary Weapon 2: LasPistol");
                        System.out.println("Secondary Weapon 3: Transonic Razor");
                        System.out.println("Throwables : Krak Grenade x 5");
                        System.out.println("Throwables : Melta Bomb x 2");
                        System.out.println("Throwables : Frag Grenade x 5");
                        System.out.println();
                        System.out.println("----------------------------------------------");
                        break;
                    case 2:
                        System.out.println("Primary Weapon : Galvanic Rifle");
                        System.out.println("Secondary Weapon 1: Phosphor Serpenta");
                        System.out.println("Secondary Weapon 2: Laspistol");
                        System.out.println("Secondary Weapon 3: Power Sword");
                        System.out.println("Throwables : Servo-Skull Grenade x 2");
                        System.out.println("Throwables : Photon Flash Flare x 3");
                        System.out.println("Throwables : EMP Grenade x 4");
                        System.out.println();
                        System.out.println("----------------------------------------------");
                        break;
                    case 3:
                        System.out.println("Primary Weapon : Hot-shot Lasgun");
                        System.out.println("Secondary Weapon 1: Plasma Pistol");
                        System.out.println("Secondary Weapon 2: Arc Pistol");
                        System.out.println("Secondary Weapon 3: Omnissian Axe");
                        System.out.println("Throwables : Krak Grenade x 3");
                        System.out.println("Throwables : Smoke Grenade x 3");
                        System.out.println("Throwables : Frag Grenade x 4");
                        System.out.println();
                        System.out.println("----------------------------------------------");
                        break; }
            case 3:
                System.out.println("REINFORCEMENT REQUEST");
                System.out.println("Requesting Unit : Technoarcheologist GERECHO 0372");
                System.out.println("Location : Unknown Ruins, Sector 7");
                System.out.println("Threat Level : HIGH");
                System.out.println("Request Type : Armed Escort");
                System.out.println("Units Requested : Astra Militarum Squad x 1");
                System.out.println("Units Requested : Skitarii Vanguard x 1");
                System.out.println("Vox-hail : TRANSMITTING...");
                System.out.println("Mars Forge-Command : SIGNAL RECEIVED");
                System.out.println("Status : REINFORCEMENTS APPROVED");
                System.out.println("ETA : 12 Terran Hours");
                System.out.println();
                        System.out.println("----------------------------------------------");
                break;
                
            case 4:
                System.out.println("SELF-DESTRUCT SEQUENCE");
                System.out.println("WARNING : Auto-destruct protocol requested");
                System.out.println("Authorization : GERECHO 03254 / MARS-0372");
                System.out.println("Machine Spirit : PROTESTING...");
                System.out.println("Sacred Data-Vaults : PURGING");
                System.out.println("Reactor Core : OVERLOADING");
                System.out.println("Detonation in 5...");
                System.out.println("4...");
                System.out.println("3...");
                System.out.println("2...");
                System.out.println("1...");
                System.out.println("The Omnissiah protects.");
                System.out.println("STATUS : TECHPRIEST TERMINATED");
                System.out.println();
                System.out.println("----------------------------------------------");
                break;
        case 5:
                System.out.println("EXITING CONSOLE");
                System.out.println("Vox-link : SEVERED");
                System.out.println("Cogitator : ENTERING REST CYCLE");
                System.out.println("Praise the Omnissiah.");
                System.out.println();
                        System.out.println("----------------------------------------------");
                break;

            default:
                System.out.println("ERROR : Invalid command");
                System.out.println("The Machine Spirit does not recognize this input.");
                System.out.println();
                System.out.println("----------------------------------------------");

                           
        }

    
    
    }
}
