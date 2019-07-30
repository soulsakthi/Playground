#include<stdio.h>
int main()
{
	long int n,i,sum=1;
    scanf("%ld",&n);
     for(i=2;i<=n;i++)
       sum=sum*i;
  printf("%ld",sum);
}