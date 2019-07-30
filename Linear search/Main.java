#include<stdio.h>
int main()
{
  int n,i,s;
  scanf("%d",&n);
  int a[n];
  for(i=1;i<=n;i++)
    scanf("%d",a+i);
  scanf("%d",&s);
  for(i=0;i<=n;i++)
  {
    if(a[i]==s)
    {
      printf("%d",i);
      return 0;
    }
  }
  printf("%d isn't present in the array.",s);
  return 0;
}