
public class InTheFuture {
	public int minimum(int a, int k, int p) throws Exception{
		int noOfDays = 0;
		int aWorkedPgms = p;
		int kWorkedPgms = 0;
		if(a < 1 || k<1)
			throw new Exception("A/K does not meet the minimum value criteria");
		if(a >100 || k>100)
			throw new Exception("A/K does not meet the maximum value criteria"); 
		if(p<0 || p>100)
			throw new Exception("P is not in valid value range");
		if(k<=a)
			return -1;
		do {
			noOfDays++;
			aWorkedPgms =aWorkedPgms+a;
			kWorkedPgms = kWorkedPgms+k;
			if(kWorkedPgms>aWorkedPgms){
				break;
			}
		}while(true);
		
		return noOfDays;
	}

}