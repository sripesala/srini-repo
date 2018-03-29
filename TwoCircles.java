
public class TwoCircles {

	public String[] circles(String[] info) throws Exception{
		String[] result = new String[info.length]; 
		int i =0;
		for(String p : info) {
			String[] param = p.split(" ");
			int[] iparam = new int[param.length];
			int x1,y1,r1=0;
			int x2,y2,r2=0;
			if(param.length != 6) {
				throw new Exception("One of the parameter doesn't have sufficient values"+p);
			}
			try {
				x1 = Integer.parseInt(param[0]); 
				y1 = Integer.parseInt(param[1]);
				r1 = Integer.parseInt(param[2]);
				x2 = Integer.parseInt(param[3]); 
				y2 = Integer.parseInt(param[4]);
				r2 = Integer.parseInt(param[5]);
			} catch (NumberFormatException e) {
				throw new Exception("One of the circle parameter is invalid.");
			}
			int distSq = (x1 - x2) * (x1 - x2) +(y1 - y2) *(y1 -y2);
			int radSumSq = (r1 + r2) * (r1 + r2);
			
			if((x1 - x2) == 0 && (y1 -y2)==0) { 
				result[i] = "Concentric";
			}else if (distSq == radSumSq || distSq == ((r2-r1)*(r2-r1))) {
				result[i] = "Touching";
			}else if(r2 >= r1 && distSq < ((r2-r1)*(r2-r1)))
			{
				result[i] = "Disjoint-Inside";
			}
			else if(r1 >= r2 && distSq < ((r1-r2)*(r1-r2))) { 
				result[i] = "Disjoint-Inside";
			}
			else if (distSq > radSumSq) { 
				result[i] = "Disjoint-Outside";
			}else {
				result[i] = "Intersecting";
			}
			i++;
		}	
		return result;
	}
	
}
