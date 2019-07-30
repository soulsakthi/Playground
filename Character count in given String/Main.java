#include<stdio.h>
int main()
{
 char a[50]; int l,i,x=1;
  scanf("%s",a);
  for(l=0;a[l]!='\0';l++);
  if(l>20)
    printf("Invalid Input");
  else
  {
    for(i=0;a[i]!='\0';i++)
    {
      if(a[i]==a[i+1])
        x++;
      else
      {
        printf("%c%d",a[i],x);
        x=1;
      }
    }
  }
}