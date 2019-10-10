
#include<stdio.h>
#include<conio.h>
#include<iostream.h>
#include<math.h>
#include<string.h>
class bus
{
int bus_no,passenger,noofbus;
char dest[20],date[20];
int fare;
public:
void getdata()
{
cout<<"Enter the destination";
gets(dest);
cout<<"enter the date";
gets(date);
cout<<"enter total number of passengers";
cin>>passenger;
cal();
}
void cal()
{
int bus_capacity=50;
if(strcmpi(dest,"mumbai")==0)
fare=passenger*10;
if(strcmpi(dest,"delhi")==0)
fare=passenger*9;
else
fare=passenger*8;
noofbus=ceil((float)passenger/bus_capacity);
}
void publish()
{
cout<<"Bus number:1013202717"<<endl;
cout<<"Destination:";
puts(dest);
cout<<"Date:";
puts(date);
cout<<"Total no of passengers"<<passenger<<endl;
cout<<"Total number of buses:";
cout<<noofbus<<endl;
cout<<"Total fare:"<<fare;
}
};
void main()
{
clrscr();
cout<<"MADE BY ANKUR"<<endl;
bus b;
b.getdata();
b.publish();
getch();
}


