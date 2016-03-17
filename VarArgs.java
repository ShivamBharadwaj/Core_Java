package com.my.sample;

public class VarArgs {
	void show(int ...x){
	int	sum=0;
	for(int u:x){
		sum=sum+u;
		System.out.println(sum);
	}
	}

	public static void main(String[] args) {
		VarArgs v=new VarArgs();
		v.show(9,8,6);
		//ENHANCE FOOR LOOP
		/*int a[]={9,8,7,6,5,4,3,2,1,0};
		for(int t:a){
			System.out.println("no.is  "+t);
		}*/
	}

}
