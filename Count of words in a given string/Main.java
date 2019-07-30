#include<stdio.h>
int main()
{
  char x[300];
  int i,w=0;
  scanf("%[^\n]s",x);
  for(i=0;x[i]!='\0';i++)
  {
    if(x[i]==' ')
      w++;
  }
  w++;
  printf("%d",w);
}