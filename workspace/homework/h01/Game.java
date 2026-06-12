package homework.h01;

import java.util.Scanner;

public class Game {
    static Scanner s = new Scanner(System.in);                   //스캐너 전역변수 선언

    static void main(String[] args) {
        String userName = "";
        String userRole = "";
        String quitCommand = "R";                                       //나가기 커맨드
        int userLuk = 0, userStr = 0, userInt = 0, userDex = 0;         //능력치
        String userSkill_1 = "", userSkill_2 = "", userSkill_3 = "", userSkill_4 = "";

        while (quitCommand.equalsIgnoreCase("R")) {
            userName = StartScreen(userName);
            userStr = abilityDistributionS(userStr);
            userLuk = abilityDistributionL(userLuk);
            userInt = abilityDistributionD(userInt);
            userDex = abilityDistributionI(userDex);

            // 능력치 총합 검사 및 게임 재시작 여부 검사
            if (userDex + userLuk + userInt + userStr > 25) {
                System.out.println("\n----------능력치 과부하(총합" + (userDex + userLuk + userInt + userStr) + ")---------");
                quitCommand = quitContinue(quitCommand);
            } else {
                System.out.println("\n[캐릭터 생성 완료!] " + userName + " 모험가님, 모험을 떠날 준비가 되었습니다.");
                break;
            }
        }

        userRole = roleSelection(userStr, userLuk, userDex, userInt);   //직업배정 메소드 호출
        String result = tut(userRole, userSkill_1, userSkill_2, userSkill_3, userSkill_4, userLuk, userDex, userStr, userInt);

    }

    static String StartScreen(String name) {
        System.out.println("┌─────────────────────────────────────────────────────────────────────┐\n" +
                "│                                                                     │\n" +
                "│   __  __ _    _ _______    _          _   _  _____ ______ _____     │\n" +
                "│  |  \\/  | |  | |__   __|  | |   /\\   | \\ | |/ ____|  ____|  __ \\    │\n" +
                "│  | \\  / | |  | |  | |     | |  /  \\  |  \\| | |  __| |__  | |__) |   │\n" +
                "│  | |\\/| | |  | |  | | _   | | / /\\ \\ | . ` | | |_ |  __| |  _  /    │\n" +
                "│  | |  | | |__| |  | || |__| |/ ____ \\| |\\  | |__| | |____| | \\ \\    │\n" +
                "│  |_|  |_|\\____/   |_| \\____//_/    \\_\\_| \\_|\\_____|______|_|  \\_\\   │\n" +
                "│                                                                     │\n" +
                "│                         - 멋쟁이 모험가처럼 -                           │\n" +
                "│                                                                     │\n" +
                "└─────────────────────────────────────────────────────────────────────┘\n" +
                " \n" +
                "                       ─ 이름을 입력하여 시작하세요 ─\n" +
                " \n" +
                "               [ Press your name to Start Adventure ]");


        String Name = s.next();
        System.out.println("                       " + Name + "님 환영합니다. ");
        return Name;
    }               //시작화면

    static int abilityDistributionS(int str) {
        System.out.print("능력치(4)의 총합은 25를 넘지 못합니다. \nSet you ability STR (1 ~ 10):");
        str = s.nextInt();
        return str;
    }             //능력치(STR)배정

    static int abilityDistributionL(int luk) {
        System.out.print("능력치(4)의 총합은 25를 넘지 못합니다. \nSet you ability LUK (1 ~ 10):");
        luk = s.nextInt();
        return luk;
    }               //능력치(LUK)배정

    static int abilityDistributionD(int dex) {
        System.out.print("능력치(4)의 총합은 25를 넘지 못합니다. \nSet you ability DEX (1 ~ 10):");
        dex = s.nextInt();
        return dex;
    }               //능력치(DEX)배정

    static int abilityDistributionI(int intel) {
        System.out.print("능력치(4)의 총합은 25를 넘지 못합니다. \nSet you ability INT (1 ~ 10):");
        intel = s.nextInt();
        return intel;
    }             //능력치(INT)배정

    static String quitContinue(String command) {
        System.out.println("게임을 다시 시작하려면 'R' 종료는 'Q'를 입력해 주세요");
        command = s.next();
        return command;
    }             //QuitCommand

    static String roleSelection(int str, int luk, int dex, int intel) {
        String role = "";
        if (str > luk && dex > intel) {
            role = "Warrior";
        } else if (luk > str && intel > dex) {
            role = "Rogue";
        } else if (dex > str && intel > luk) {
            role = "Archer";
        } else if (intel > str && luk > dex) {
            role = "Magician";
        } else if (intel == str && luk == dex && str == dex)
            role = "Adventurer";
        System.out.println("\n====================================");
        System.out.println("     당신의 최종 직업은 [" + role + "] 입니다!");
        System.out.println("====================================");
        return role;
    }   //능력치에 따른 직업배정

    static String skillSet_1(String userRole) {
        String skill_1 = "";
        if (userRole == "Warrior") {
            skill_1 = "HeavyStrike";
        } else if (userRole == "Rogue") {
            skill_1 = "SurpriseAttack";
        } else if (userRole == "Archer") {
            skill_1 = "Double Shot";
        } else if (userRole == "Magician") {
            skill_1 = "MagicMissile";
        } else if (userRole == "Adventurer") {
            skill_1 = "Throw Stone";
        }
        return skill_1;
    }                       //1번 스킬

    static int rolldice(int Luk) {
        return (int) (Math.random() * 10 + 1) * Luk;
    }   //주사위 * LUK

    static String tut(String userRole, String userSkill_1, String userSkill_2, String userSkill_3, String userSkill_4,
                      int userLuk, int userDex, int userStr, int userInt) {
        int enemyHp = 100, userHP = 100, enemyMp = 100, userMP = 100;
        int action = 0;
        int runAway = 0;
        String result = "";
        System.out.println("\n\n\n" + "====================================\n" +
                "           (Tutorial)슬라임 출현!" + "\n====================================");
        System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⣤⣤⣤⣤⣤⣤⣤⣤⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀  ⠀⠀⢀⣠⣤⣤⣾⠟⠛⠛⠛⠛⠛⠛⠛⠻⣦⣤⣤⣄⠀⠀⠀⠀⠀\n" +
                "⠀  ⠀⣠⣾⡿⠟⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⠟⠿⣿⣦⣄⠀⠀⠀\n" +
                "   ⣠⣼⡿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀\n" +
                "   ⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣶⡄⠀\n" +
                "   ⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⣀⣀⠀⠀⠀⣿⣿⡇⠀\n" +
                "   ⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀⠀⣿⣿⠀⠀⠀⣯⣿⡇⠀\n" +
                "   ⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠿⠇⠀⠀⠀⠿⣿⠤⣤⣧⣧⣿⡇⡀\n" +
                "   ⠿⢿⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠀⡀⠀⠀⠀⠁⣠⣼⣿⠟⠃\n" +
                "⠀  ⠀⠿⢷⣄⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣁⣀⣀⣀⣤⣿⠿⠁⠀⠀\n" +
                "⠀⠀⠀    ⠘⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠁⠁⠀⠀⠀");

        while (userHP > 0 && enemyHp > 0) {
                System.out.println("=========================================");
                System.out.println("   취할 행동을 골라주세요 ( 행동 입력 )");
                System.out.println("=========================================");
                System.out.println("1. 도망가기 \n2. 싸운다 \n");
                action = s.nextInt();
                switch (action) {
                    case 1:
                        if (runAway > 1) {
                            runAway = rolldice(userLuk);
                            enemyHp = -1;
                        }               //도망가기
                    case 2:
                        switch (userRole){
                            case "Warrior" :
                                System.out.println("    1. HeavyStrike");
                                System.out.println("    2. Shiled Bash");
                                System.out.println("    3. War cry");
                                System.out.println("    4. Last Stand");
                            case "Rogue" :
                                System.out.println("    1. Surprise Attack");
                                System.out.println("    2. Apply Poison");
                                System.out.println("    3. Smoke Bomb");
                                System.out.println("    4. Assassinate");
                            case "Magician" :
                                System.out.println("    1. Magic Missile");
                                System.out.println("    2. Fireball");
                                System.out.println("    3. Mana Heal");
                                System.out.println("    4. Meteor");
                            case "Archer" :
                                System.out.println("    1. Double Shot");
                                System.out.println("    2. Ensnaring Shot");
                                System.out.println("    3. Hawk Eye");
                                System.out.println("    4. Piercing Arrow");
                            case "Adventurer" :
                                System.out.println("    1. Throw Stone");
                                System.out.println("    2. First Aid");
                                System.out.println("    3. Rope Trick");
                                System.out.println("    4. Lucky Dip");
                        }
                }

        }
        return result;
    }
}




