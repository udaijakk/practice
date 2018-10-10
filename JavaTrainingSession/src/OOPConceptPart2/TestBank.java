package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.tranferMoney();
		hs.netbanking();
		hs.mobilebanking();
		hs.mutualfund();
		
		
		//dynamic polymorphism
		//child class object can be referred by parent interface reference variable
		USBank u=new HSBCBank();
		u.credit();
		u.debit();
		u.tranferMoney();
	

	}

}
