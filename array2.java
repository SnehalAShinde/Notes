class array2
{
  public static void main(String[] args) 
  {
    int[]a={10,20,30,10,25,10,40,10};
    int n=0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==10)
        {
            n++;
        }
    }
    System.out.println(n);
  }  
}
