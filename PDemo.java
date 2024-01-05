class PDemo {
    public static void main(String args[]) 
    {
        int j = 0;
        int n = 10;
        int count = 0;
        for(j=2;j<=n;j++){
         counter=0;
         for(i=1;i<=j;i++){
            if(j%i==0){
               counter++;
            }
         }
         if(counter==2)
         System.out.print(j+" ");
      }
  }
  }