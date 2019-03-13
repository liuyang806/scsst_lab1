package scsst;

public class Triangle {
	public static int[] remain = {50,20,5,5,1,1,1};
	
	public int RMB(int x){
		for(int i = 0;i < remain.length;i++){
			if(x >= remain[i]){
				x -= remain[i];
			}
		}
		if(x == 0)
			return 1;
		else
		    return 0;
	}
}
