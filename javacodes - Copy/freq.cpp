#include<iostream>
#include<cmath>
using namespace std;

void getmax(string s,int k,long &n)
{
    int a[s.length()];

      for(int i=0;i<s.length();i++)
      {
        int count=1;
        for(int j=i+1;j<s.length();j++)
        {
            if(s[i]==s[j])
            {
                count++;
                a[j]=-1;
            }
        }
        if(a[i]!=-1)
        a[i]=count;
      }

      long sum=0;

      for(int i=0;i<s.length();i++)
      {
        if(a[i]!=-1)
        sum=sum+pow(int(s[i])-96,a[i]);
      }
    
    
      if(n<sum%1000000007)
      n=sum%1000000007;
}


long getMaximumCouponValue(string coupon,int k)
{
    long n=0;

    for(int i=0;i<coupon.length()-k+1;i++)
    {
        string str="";
        for(int j=i;j<k+i;j++)
        {
            str+=coupon[j];
        }
        getmax(str,k,n);
    }

    return n;
}
int main(){
      string s;
      cin>>s;
      int k;
      cin>>k;
      
      long result=getMaximumCouponValue(s,k);

      cout<<result;

     return 0;
}