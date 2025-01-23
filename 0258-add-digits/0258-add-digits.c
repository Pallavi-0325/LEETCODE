int addDigits(int num)
{
      int sum,temp;
      sum=0;
      if(num<9)
      {
        return num;
      }  
      while (num>9)
       {
        int temp=num;
            int sum=0;
            while(temp)
            {
                sum+=temp%10;
                temp/=10;
            }
            num=sum;
       }
       return num;
}