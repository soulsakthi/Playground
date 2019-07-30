#include<stdio.h>
int main()
{
  int n,a[100],i,r=0;
  scanf("%d",&n);
  while(n!=0)
  {
    a[r++]=n%8;
    n=n/8;
  }
  for(i=r-1;i>=0;i--)
    printf("%d",a[i]);
  return 0;
}