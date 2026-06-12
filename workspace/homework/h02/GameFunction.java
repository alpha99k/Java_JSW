package homework.h02;

import java.util.Scanner;

public class GameFunction {


    static int[] fight(int hp, int enemyHp){
        System.out.println("적과 싸웁니다.");
        int enemyDamage  = (int)(Math.random() * 11);
        enemyHp -= enemyDamage;
        int damage = (int)(Math.random() * 11);
        hp -= damage;
        System.out.println("적에게 " + enemyDamage + "의 데미지를 주고 " + damage + "의 데미지를 입었다.");
        System.out.println("나의 남은 체력은 " + hp + "입니다.");
        System.out.println("적의 남은 체력은 " + enemyHp + "입니다.");
        return new int[]{hp, enemyHp};
    }

    static int[] runAway(int hp){
        int damage = (int)(Math.random() * 3);
        hp -= damage;
        int enemyHp = (int)(Math.random() * 90) + 10; // 10 ~ 99
        System.out.println("도망간다. 대신 " + damage + "의 체력이 소비되었다.");
        System.out.println("남은 체력은 " + hp + "입니다.");
        return new int[]{hp, enemyHp};

    }

    static int heal(int hp){
        hp += 10;
        System.out.println("체력이 10 회복 되었다.");
        System.out.println("남은 체력은 " + hp + "입니다.");
        return hp;
    }

    static int[] useUltimateSkill(int hp, int enemyHp, int ultimateSkill){
        if(ultimateSkill > 0){
            int chance = (int)(Math.random() * 2);
            int enemyDamage = enemyHp * chance;
            enemyHp -= enemyDamage;
            int damage = 0;
            ultimateSkill--;
            System.out.println("궁극의 필살기를 사용했다.");
            System.out.println("적에게 " + enemyDamage + "의 데미지를 주고 " + damage + "의 데미지를 입었다.");
            System.out.println("나의 남은 체력은 " + hp + "입니다.");
            System.out.println("적의 남은 체력은 " + enemyHp + "입니다.");
        }else{
            System.out.println("사용할 수 있는 필살기가 없습니다.");
        }
        return new int[]{hp, enemyHp, ultimateSkill};

    }

    static void ending(int hp, int enemyHp) {
        if(hp <= 0) {
            System.out.println("당신은 사망했습니다. \n =THE END=");
        } else if (enemyHp <= 0) {
            System.out.println("당신은 승리했습니다. \n =THE END=");

        }
    }


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("***멋쟁이 전사처럼***");
        System.out.println("캐릭터 이름을 지어주세요.");
        String name = s.next();
        int hp = 50; // 내 에너지
        int ultimateSkill = 1; // 필살기 기술 수량
        int enemyHp = (int)(Math.random()*90) + 10; // 적군 에너지
        System.out.println(name + "님 어서오세요. 게임을 시작합니다.");


        while(hp > 0 && enemyHp > 0){
            System.out.println(enemyHp + " 체력을 가진 적을 만났다. 어떤 행동을 하시겠습니까?");
            System.out.println("1) 싸운다 2) 도망간다 3) HP를 10 회복한다 4) 필살기 사용");
            int action = s.nextInt();

            switch(action){
                //싸우기
                case 1 -> {
                    int[] result = fight(hp, enemyHp);
                    //가져온 배열 값 씌우기
                    hp = result[0];
                    enemyHp = result[1];
                }

                //도망가기
                case 2 -> {
                    int[] result = runAway(hp);
                    //가져온 배열 값 씌우기
                    hp = result[0];
                    enemyHp = result[1];
                }

                //체력 회복
                case 3 -> {
                    hp = heal(hp);
                }

                //궁극기 사용
                case 4 -> {
                    int[] result = useUltimateSkill(hp, enemyHp, ultimateSkill);
                    hp = result[0];
                    enemyHp = result[1];
                    ultimateSkill = result[2];

                }
            }
        }
        ending(hp, enemyHp);
        }
    }

