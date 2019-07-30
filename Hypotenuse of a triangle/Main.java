#include<stdio.h>
int main()
{
  float a,b,c;
  scanf("%f%f",&a,&b);
  a*=a;
  b*=b;
  c=sqrt(a+b);
  printf("%.2f",c);
  return 0;
}