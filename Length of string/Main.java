#include<stdio.h>
int main()
{
 int i;
  char x[200];
  scanf("%[^\n]s",x);
  for(i=0;x[i]!='\0';i++);
  printf("%d",i);
  return 0;
}