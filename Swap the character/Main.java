#include<stdio.h>
int main()
{
 char a[50],b[50],c[50];
 int i;
 scanf("%s%s%s",a,b,c);
  for(i=0;a[i]!='\0';i++)
    if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' || 
       a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U')
      a[i]='$';
  printf("%s",a);
    for(i=0;b[i]!='\0';i++)
    if(!(b[i]=='a' || b[i]=='e' || b[i]=='i' || b[i]=='o' || b[i]=='u' ||
         b[i]=='A' || b[i]=='E' || b[i]=='I' || b[i]=='O' || b[i]=='U'))
      b[i]='#';
    printf("%s",b);
      for(i=0;c[i]!='\0';i++)
        if(c[i]>='a' && c[i]<='z')
          c[i]-=32;
   printf("%s",c);
  
}