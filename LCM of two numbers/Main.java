#include<stdio.h>
int main()
{
  int a,b,hcf,lcm,c,i;
  scanf("%d%d",&a,&b);
  c=a>b?b:a;
  for(hcf=c;hcf>=1;hcf--)
  {
    if(a%hcf==0&&b%hcf==0)
      break;
  }
  lcm=(a*b)/hcf;
  printf("%d",lcm);
  return 0;
}