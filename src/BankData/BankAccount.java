package BankData;

public class BankAccount {
    private String name;
    private String number;
    private String category;
    private String type;
    private int balance;
    private int date;
    private String store;
    private String employee;

    public BankAccount(final String name, final String number, final String category, final String type, final int balance, final int date, final String store, final String employee){
        this.name = name;
        this.number = number;
        this.category = category;
        this.type = type;
        this.balance = balance;
        this.date = date;
        this.store = store;
        this.employee = employee;
    }

    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public String getCategory() {
        return category;
    }
    public String getType() {
        return type;
    }
    public int getBalance() {
        return balance;
    }
    public int getDate() {
        return date;
    }
    public String getStore() {
        return store;
    }
    public String getEmployee() {
        return employee;
    }
    public void printAll(){
        System.out.println("이름: " + name);
        System.out.println("계좌번호: " + number);
        System.out.println("계좌 유형: " + category);
        System.out.println("상품명: " + type);
        System.out.println("잔액: " + balance);
        System.out.println("개설 일자: " + date);
        System.out.println("관리 영업점: " + store);
        System.out.println("관리 직원: " + employee);
    }
}