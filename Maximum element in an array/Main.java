#include<stdio.h>
#include<stdlib.h>
int main()
{
 int *a,n,i,temp;
  scanf("%d",&n);
  a=(int*)malloc(n*sizeof(a));
  for(i=0;i<n;i++)
    scanf("%d",a+i);
  temp=a[0];
  for(i=0;i<n;i++)
    if(temp<a[i])
      temp=a[i];
  printf("%d",temp);
 
}