#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,a[3][3],b[3][3],c[3][3];
clrscr();
printf("enter 1st matrix");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
scanf("%d",&a[i][j]);
}
}
printf("enter 2nd matrix");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
scanf("%d",&b[i][j]);
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
c[i][j]=a[i][j]-b[i][j];
}
}
printf("the matrix as subtract is \n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
printf("%d\t",c[i][j]);
}
printf("\n");
}
getch();
}
