
         int month =sc.nextInt();
          int year =sc.nextInt();

          if(year>=1990&&year<=1999)
          {
            if(month>0&&month<=12)
            {
                if((date>0&&date<=31)||month==1||month==3||month==5||month==7||month==9||month==11)
                {
                    if((date>0&&date<31)||month==4||month==6||month==8||month==10)
                    {
                        if((date>0&&date<29)||month==2)
                        {
                            System.out.println("valid");
                        }
                    }
                }
            }
          }
          else{
            System.out.println("invalid");
          }
    