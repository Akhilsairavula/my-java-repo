package stringdemo;

public class RahulProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights = {30, 10, 22, 30, 40, 50, 79};
		
		
		int max = heights[0];
		int count=1;
		int dollar = 17;
		
		for(int i=1;i<heights.length;i++) {
			if(heights[i] > max) {
				max = heights[i];
				count++;
			}
		}
		System.out.println("max no---->"+count * dollar);
			
		

	}

}

