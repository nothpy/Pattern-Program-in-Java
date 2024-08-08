class Patternprogram{
    public static void main(String[] args) {
        int n = 15;
        Printpattern(n);
        
    }
    public static void Printpattern(int n)
    {
      for (int i = 1; i <= n; i++)
      {
         for (int j = 1; j <= n; j++)
          {
             if (j%2==1)
             System.out.print("1 ");
             else System.out.print("0 ");
          }
          System.out.println();
     }
     /*output
      * 
      1 0 1 0 1 
      1 0 1 0 1
      1 0 1 0 1
      1 0 1 0 1
      1 0 1 0 1 
      */
     System.out.println("");
     for (int i = 1; i <= n; i++)
      {
         for (int j = 1; j <= n; j++)
          {
             if (j%2==1)
             System.out.print("0 ");
             else System.out.print("1 ");
          }
          System.out.println();
     }
     /*output
      * 
      0 1 0 1 0
      0 1 0 1 0 
      0 1 0 1 0
      0 1 0 1 0
      0 1 0 1 0 
      */
     System.out.println("");
     for (int i = 1; i <= n; i++)
      {
         for (int j = 1; j <= n; j++)
          {
             if (i%2==1)
             System.out.print("1 ");
             else System.out.print("0 ");
          }
          System.out.println();
     }

     /*outout
      * 
      1 1 1 1 1
      0 0 0 0 0
      1 1 1 1 1 
      0 0 0 0 0
      1 1 1 1 1
      */
     System.out.println("");
     for (int i = 1; i <= n; i++)
      {
         for (int j = 1; j <= n; j++)
          {
             if (i%2==1)
             System.out.print("0 ");
             else System.out.print("1 ");
          }
          System.out.println();
     }
     /*output
      * 
      0 0 0 0 0 
      1 1 1 1 1
      0 0 0 0 0 
      1 1 1 1 1 
      0 0 0 0 0
      */
     System.out.println("");
     for (int i = 1; i <= n; i++)
      {
         for (int j = 1; j <= n; j++)
          {
             System.out.print(i*j+" ");
          }
          System.out.println();
     }
     /*output
      * 
      1 2 3 4 5 
      2 4 6 8 10 
      3 6 9 12 15 
      4 8 12 16 20 
      5 10 15 20 25
      */
      System.out.println("");

     for (int i = 1; i <= n; i++)
      {
         for (int j = 1; j <= n; j++)
          {
             System.out.print("("+i+","+j+")"+"  ");
          }
          System.out.println();
     }
     /*output
      * 
      (1,1)  (1,2)  (1,3)  (1,4)  (1,5)
      (2,1)  (2,2)  (2,3)  (2,4)  (2,5)
      (3,1)  (3,2)  (3,3)  (3,4)  (3,5)
      (4,1)  (4,2)  (4,3)  (4,4)  (4,5)
      (5,1)  (5,2)  (5,3)  (5,4)  (5,5)
      */
      System.out.println("");
      for(int i=1;i<=n;i++){
         for(int j=1;j<=n;j++){
            //  if((1<i&&i<n) && (1<j&&j < n) )  System.out.print("  ");
            //   else System.out.print("* ");
            // another logic
            if(i==1 || i==n || j==1 || j==n) System.out.print("* ");
            else System.out.print("  ");
         }
         System.out.println("");
      }
      // output 
      /*
              * * * * *
              *       *
              *       *
              *       * 
              * * * * *
       */

       System.out.println("");
      for(int i=1;i<=n;i++){
         for(int j=1;j<=n;j++){
            //  if((1<i&&i<n) && (1<j&&j < n) )  System.out.print("  ");
            //   else System.out.print("* ");
            // another logic
            if(i==1 || i==2 || i==n || i== n-1|| j==1 || j==2 || j==n || j== n-1 ) System.out.print("* ");
            else System.out.print("  ");
         }
         System.out.println("");
      }
      // OUTPUT 
      /*
            * * * * *
            * * * * *
            * *   * * 
            * * * * *
            * * * * * 
       */
      System.out.println("");
      for(int i=1;i<=n;i++){
         for(int j=1;j<=n;j++){
            if(i==j || i+j==n+1) System.out.print("* ");
            else System.out.print("  ");
         }
         System.out.println("");
      }
      System.out.println("");
      int midi = n/2+1;
      for(int i=1;i<=n;i++){
         for(int j=1;j<=n;j++){
            if(i==midi || j==midi) System.out.print("* ");
            else System.out.print("  ");
         }
         System.out.println("");
      }
      System.out.println("");
      int mid = n/2+1;
      for(int i=1;i<=n;i++){
         for(int j=1;j<=n;j++){
            if(i==mid || j==mid || i==j || i+j==n+1 || i==1 || i==n || j==1 || j==n) System.out.print("* ");
            else System.out.print("  ");
         }
         System.out.println("");
      }
    }
}