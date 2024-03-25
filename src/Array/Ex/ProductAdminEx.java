package Array.Ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        while(true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            if(option == 1){
                if (productCount == 10){
                    System.out.println("더이상 상품을 등록하 수 없습니다");
                }
                else {
                    System.out.print("상품의 이름을 입력하세요: ");
                    productNames[productCount] = scanner.nextLine();
                    System.out.print("상품이 가격을 입력하세요: ");
                    productPrices[productCount] = scanner.nextInt();
                    productCount++;
                }
            }
            if(option == 2){
                if(productNames[0] == null){
                    System.out.println("등록된 상품이 없습니다.");
                }
                else {
                    for (int l = 0; l < productCount; l++) {
                        System.out.println(productNames[l] + ": " + productPrices[l]);
                    }
                }
            }
            if(option == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }




    }
}
