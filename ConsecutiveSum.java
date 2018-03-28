
public class ConsecutiveSum {

	public static int consecutive(int i) throws Exception{
		int count = 0;
		
		if(i<1 || i>Math.pow(10, 12) )
			throw new Exception("Input is not valid");
		
        for (int n = 1; n * (n + 1) < 2 * i; n++)
        {
            float a = (float) ((1.0 * i-(n * (n + 1)) / 2) / (n + 1));
            if (a-(int)a == 0.0) 
                count++;        
        }
		return count;
	}

}
