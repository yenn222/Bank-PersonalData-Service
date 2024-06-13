package BankData;

import java.nio.channels.ScatteringByteChannel;
import java.util.*;


public class BankDataMain {
    public static void main(String[] args) {
        HashMap<String, ArrayList<BankAccount>> account = new HashMap<>();
        while (true) {
            try {
                System.out.println("관리 메뉴: 1. 전체 입력 2. 검색 3. 삭제 4. 종료");
                Scanner scanner = new Scanner(System.in);
                int choice1 = Integer.parseInt(scanner.nextLine());
                if (choice1 == 1) {
                    while (true) {
                        try {

                            System.out.print("고객 이름을 입력하세요: ");
                            String name = scanner.next();

                            System.out.print("계좌번호를 입력하세요: (숫자로만 입력)");
                            String number = scanner.next();

                            System.out.print("계좌의 유형을 입력하세요: ");
                            String category = scanner.next();

                            System.out.print("상품명을 입력하세요: ");
                            String type = scanner.next();

                            System.out.print("잔액을 입력하세요: (숫자로만 입력)");
                            int balance = scanner.nextInt();

                            System.out.print("개설일자를 입력하세요: (숫자로만 입력)");
                            int date = scanner.nextInt();

                            System.out.print("관리영업점을 입력하세요: ");
                            String store = scanner.next();

                            System.out.print("관리직원을 입력하세요: ");
                            String employee = scanner.next();

                            account.put(number, new ArrayList<>());
                            account.get(number).add(new BankAccount(name, number, category, type, balance, date, store, employee));

                            System.out.println("더 입력하시겠습니까? (Y/N): ");
                            String end = scanner.next();
                            String endUpper = end.toUpperCase();
                            if (endUpper.equals("Y")) {
                                continue;
                            } else if (endUpper.equals("N")) {
                                break;
                            } else {
                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("입력 오류 발생!");
                            break;
                        } catch (Exception e) {
                            System.out.println("오류 발생!");
                        }

                    }
                } else if (choice1 == 2) {
                    while (true) {
                        try {
                            System.out.println("계좌번호를 입력하세요: ");
                            String key = scanner.next();
                            ArrayList<BankAccount> accountInformation = account.get(key);

                            System.out.println("검색 메뉴: 1. 이름 출력 2. 계좌 유형 출력 3. 상품명 출력 4. 잔액 출력 5. 개설일자 출력 6. 전체 정보 출력 7.종료");

                            int choice = scanner.nextInt();

                            if (choice == 1) {
                                System.out.println("이름: " + accountInformation.get(0).getName());
                            } else if (choice == 2) {
                                System.out.println("계좌 유형: " + accountInformation.get(0).getCategory());
                            } else if (choice == 3) {
                                System.out.println("상품명: " + accountInformation.get(0).getType());
                            } else if (choice == 4) {
                                System.out.println("잔액: " + accountInformation.get(0).getBalance());
                            } else if (choice == 5) {
                                System.out.println("개설일자: " + accountInformation.get(0).getDate());
                            } else if (choice == 6) {
                                System.out.println("전체 출력 : ");
                                accountInformation.get(0).printAll();
                            } else if (choice == 7) {
                                break;

                            } else {
                                System.out.println("잘못된 선택입니다. 다시 선택하세요.");

                            }

                            System.out.println("정보를 추가로 열람하시겠습니까? (Y/N): ");
                            String end = scanner.next();
                            String endUpper = end.toUpperCase();

                            if (endUpper.equals("Y")) {
                                continue;
                            } else if (endUpper.equals("N")) {
                                break;
                            } else {
                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                            }
                        } catch (Exception e) {
                            System.out.println("오류 발생!");
                        }
                    }

                } else if (choice1 == 3) {
                    try {
                        System.out.println("삭제할 계좌번호를 입력하세요");
                        String accountNumber = scanner.nextLine();
                        System.out.println(accountNumber + " 계좌를 정말 삭제하겠습니까?");
                        System.out.println("삭제하려면 yes를 입력하세요.");
                        String choiceRemove = scanner.nextLine();
                        if (choiceRemove.equals("yes")) {
                            account.remove(accountNumber);
                            System.out.println("계좌가 정상 삭제 되었습니다.");
                        }
                        else if (choiceRemove.equals("no")) {
                            break;
                        }

                    }catch (Exception e){
                        System.out.println("오류 발생!");
                    }

                } else if (choice1 == 4) {
                    break;

                } else {
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");

                }
            } catch (InputMismatchException e) {
                System.out.println("입력 오류 발생!");

            }
        }
    }
}
