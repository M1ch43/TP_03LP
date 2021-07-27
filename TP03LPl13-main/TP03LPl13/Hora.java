import java.util.Scanner;

public class Hora
{
//atributos (privados)
private int hora;
private int min;
private int seg;


public Hora()
{
/*
int h1;
int m1;
int s1;
Scanner ler = new Scanner(System.in);
do{
System.out.println("Digite a Hora");
h1 = ler.nextInt();
}while(h1>=24 || h1<0);

do{
System.out.println("Digite o Minuto");
m1 = ler.nextInt();
}while(m1>=60||m1<0);

do{
System.out.println("Digite o Segundo");
s1 = ler.nextInt();
}while(s1>=60||s1<0);

this.hora = h1;
this.min = m1;
this.seg = s1;
*/
}

public Hora(int Hora, int Min, int Seg)
{
this.hora = Hora;
this.min = Min;
this.seg = Seg;
}

public void setHor(int Hora)
{
this.hora = Hora;
}

public void setMin(int Min)
{
this.min = Min;
}

public void setSeg(int Seg)
{
this.seg = Seg;
}

public void setHor()
{
int h1;
Scanner ler = new Scanner(System.in);
System.out.println("Digite a Hora");
h1 = ler.nextInt();

this.hora = h1;
}

public void setMin()
{
int m1;
Scanner ler = new Scanner(System.in);
System.out.println("Digite o Minuto");
m1 = ler.nextInt();

this.min = m1;
}

public void setSeg()
{
int s1;
Scanner ler = new Scanner(System.in);
System.out.println("Digite o Segundo");
s1 = ler.nextInt();

this.seg = s1;
}


public int getHor()
{
return hora;
}

public int getMin()
{
return min;
}

public int getSeg()
{
return seg;
}

public String getHora1()
{
return(hora + ":" + min + ":" + seg);
}

public String getHora2()
{
int hora1=0;
String cond="A.M.";
if(hora>12){
hora1 = hora - 12;
cond = "P.M.";
}

if(hora==0){
hora1=12;
cond = "A.M.";
}

if(hora==12){
hora1=12;
cond = "P.M.";
}

if(hora>0&&hora<12)
{
hora1=hora;
cond = "A.M.";
}

return(hora1 + ":" + min + ":" + seg + " " + cond);
}

public int getSegundos()
{
return ((hora*3600) + (min*60) + seg);

}

}//class
