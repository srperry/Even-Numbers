
class Even_Numbers {

	public static void main(String[] args) {
		int sum=0;
		int i;
		for(i=0;i<=50;i= i+2){
			sum=(sum+i);
			if(i%2 !=1){
				System.out.println(i);
			}
		}

System.out.println(sum);
	}

}
