class static2{
     public static void main(String args[]){
	stat s=new stat();
	stat s1=new stat();
	s.statw();
	s1.statw();
	System.out.print("Using Static variable to count objects of class :"+s.a);
	
	}
}

class stat{
	
		static int a=0;
		public void statw(){
			a+=1;
		}
}




