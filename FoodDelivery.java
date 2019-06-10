import java.io.*;
import java.util.Scanner;
class DeliveryBoy
{
	int id,state;
	int x=0,y=0;
}
class FoodDelivery
{
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	DeliveryBoy dbs[]=new DeliveryBoy[10];
	int xp,yp,xd,yd,t=0;
	for(int i=0;i<10;i++)
	{
	dbs[i]=new DeliveryBoy();
	dbs[i].id=i;
	dbs[i].state=0;
	}

    int ch=1;
	

	while(ch!=0)
	{
	System.out.println("Enter xp,yp,xd,yd");
	xp=in.nextInt();
	yp=in.nextInt();
	xd=in.nextInt();
	yd=in.nextInt();
	double min= Math.sqrt(Math.pow(dbs[0].x-xp,2) + Math.pow(dbs[0].y-yp,2));
	for(int i=0;i<10;i++)
	{
	if(Math.sqrt(Math.pow(dbs[i].x-xp,2) + Math.pow(dbs[i].y-yp,2)) <= min && dbs[i].state==0)
	 {
		min=Math.sqrt(Math.pow(dbs[i].x-xp,2) + Math.pow(dbs[i].y-yp,2));
		t=i;
	 }
    }
	dbs[t].state=1;
	double deldis = Math.sqrt(Math.pow((xp-xd),2) + Math.pow((yp-yd),2));
	System.out.println("the assigned del boy id="+t);
	System.out.println("The dist from pickup to dest="+ deldis);
	dbs[t].x=xd;
	dbs[t].y=yd;
	dbs[t].state=0;
	System.out.println("Enter 1 to cont,0 to exit");
	ch=in.nextInt();
	}
	 
	}
}
