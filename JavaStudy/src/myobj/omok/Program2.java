package myobj.omok;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        char board[][] = new char[12][12];// 12*12 바둑판 배열
        boolean chk[][] = new boolean[12][12];//중복값 판별용 배열

        // ----------------------------------------------------초기 바둑판 양식 배열에 저장
        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 12; y++) {
                if (x == 0 && y == 0)// 왼쪽 위 모서리막기
                    board[x][y] = '┌';
                else if (x == 11 && y == 11)// 오른쪽 아래 모서리막기
                    board[x][y] = '┘';
                else if (x == 11 && y == 0)// 왼쪽 아래 모서리막기
                    board[x][y] = '└';
                else if (x == 0 && y == 11)// 오른쪽 위 모서리막기
                    board[x][y] = '┐';
                else if (x == 0)// 위에 막기
                    board[x][y] = '┬';
                else if (x == 11)// 아래 막기
                    board[x][y] = '┴';
                else if (y == 0)// 왼쪽 막기
                    board[x][y] = '├';
                else if (y == 11)// 오른쪽 막기
                    board[x][y] = '┤';
                else
                    board[x][y] = '┼';

                chk[x][y] = false;
            }
        }
        // ----------------------------------------------------
        int ox = -1; // 돌
        int oy = -1; // 돌

        //이전좌표
        int xBefore = -1;
        int yBefore = -1;

        QUIT:
        while (true) {
            Scanner scan = new Scanner(System.in);
//
//            System.out.println("┌───────────────────────────┐");
//            System.out.println("│          Omok Game        │");
//            System.out.println("└───────────────────────────┘");
//            System.out.println();
//
//            System.out.println("1. 게임시작");
//            System.out.println("2. 도움말");
//            System.out.println("3. 종료");
//            System.out.print(">");
//            int option = scan.nextInt();

            int count = 1;// 홀수일때 흰돌, 짝수일때 검돌

            GAMEOVER:
            while (true) {

                //중복 제거 & 첫 사이클은 그냥 지나침.
                //첫 사이클부터 통과하면 배열 변수 초기값 -1이여서 오류발생!
                if (ox != -1 && oy != -1 && !chk[ox][oy]) {
                    xBefore = ox;
                    yBefore = oy;

                    if (count % 2 == 1)
                        board[ox][oy] = '●';
                    else if (count % 2 == 0)
                        board[ox][oy] = '○';

                    chk[ox][oy] = true;
                    count++;

                    System.out.printf("☆이전 좌표 : [%2d][%2d]☆\n", xBefore, yBefore);
                } else if (count > 1)
                    System.out.println("\n☆★☆★중복 좌표입니다.☆★☆★");

                // 배열 바둑판 출력 양식.
                {
                    for (int i = 0; i < 12; i++) {
                        for (int j = 0; j < 12; j++) {
                            System.out.printf("%-2c", board[i][j]);
                        }
                        System.out.println();
                    }
                }

                //좌표 입력
                do {
                    System.out.println("\n그만두기:-1");
                    if (count % 2 == 1)
                        System.out.println("● 백돌 차례입니다");
                    else
                        System.out.println("○ 흑돌 차례입니다");
                    System.out.print(" x sp y> ");


                    ox = scan.nextInt();
                    if (ox == -1) {
                        System.out.println("GAMEOVER~~");
                        break GAMEOVER;
                    }
                    oy = scan.nextInt();

                    //1~11 범위를 벗어나면 배열 Index오류 발생!! ☆★중요☆★ 예) 15입력시 오류발생해서 멈춤...
                    if (!(1 <= ox && ox <= 11) || !(1 <= oy && oy <= 11)) {
                        System.out.println("\n              ♨경고♨                ");
                        System.out.println("오목 좌표의 범위(-1 or 1~11)를 벗어났습니다.");
                    }

                } while (!(1 <= ox && ox <= 11) || !(1 <= oy && oy <= 11));
                System.out.println("==================================");

            }
            break;
        }
        }
    }
