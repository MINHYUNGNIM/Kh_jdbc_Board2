package kh_jdbc_board;

import kh_jdbc_board.dao.MemberInsertDao;

import java.util.Scanner;

public class ThreeMain {
    public static void main(String[] args) {
        menuSelect();
    }

    public static void menuSelect() {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("========[EMP Table 조회]==========");
            System.out.println("메뉴를 선택하세요");
            System.out.println("[1] 회원가입 [2] 글쓰기");
            int sel = sc.nextInt();
            switch (sel) {
                case 1:
                    MemberInsertDao insert = new MemberInsertDao();
                    insert.empInsert();
                    break;
            }
        }
    }
}
