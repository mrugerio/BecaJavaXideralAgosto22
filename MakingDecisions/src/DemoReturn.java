import java.util.Arrays;

public class DemoReturn {
	
	public static void main(String[] args) {
		//int[][] list = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		int[] res = searchForValue(new int[][]
				{{5,2,1,3,6,},{3,9},{5,7,12,7,9,3,2,111}} ,111);
		System.out.println(Arrays.toString(res)); //[0,0]
	}

	private static int[] searchForValue(int[][] list, int v) {
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == v) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

}
