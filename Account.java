package objectClass;

import exception.InsufficientException;

//은행계좌 클래스
public class Account {
     //멤버변수(필드, 속성)
	 static final String BANKNAME="신한은행"; 
	 String accountNo; //계좌번호 
	 String ownerName; //예금주이름
	 public int balance; //통장 잔액
	 int creditLine;
	 
	 //생성자
	 
	 public Account(String accountNo,String ownerName,int balance){
		 this.accountNo=accountNo;
		 this.ownerName=ownerName;
		 this.balance=balance;
		 

	 }
	 public Account(String accountNo,String ownerName,int balance,int creditLine) {
		 this.creditLine=creditLine;
	 }
	 
	 


	//예금한다 메서드
     public void deposit(int amount) {
    	 balance+=amount; //balance=balance+amount
     }
	 //출금한다 메서드
     public int withdraw(int amount) throws InsufficientException {
    	 if(balance+ creditLine < amount) {
    		 throw new InsufficientException("잔고 부족("+(amount-balance)+"모자람) : 인출이 불가능합니다.");
         }
    	 balance-=amount;// balance=balance-amount;
    	 return amount;
     }
     }
	 

