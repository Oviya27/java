package Array;

public class jaggedArray {

	public static void main(String[] args) {
        int c[][] = {{12, 13, 15},{10},{5, 8},{4, 1,17}};
        
		System.out.println("c length :"+c.length);
			for(int i=0;i<c.length;i++) {
				for(int j=0;j<c.length;j++) {
					System.out.println(c[i][j]+" ");
				}
				System.out.println();
	}

}
}