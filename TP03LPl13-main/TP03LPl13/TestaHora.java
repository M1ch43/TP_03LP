import java.util.Scanner;
import java.io.*;

public class TestaHora 
{
public static void main(String[] args) throws IOException, InterruptedException{

int opc1;
int h1;
int m1;
int s1;
int hora;
int min;
int seg;
Hora hr = new Hora();
int opc;
Scanner ler = new Scanner(System.in);
do{
new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

System.out.println("Controle de Hora");

System.out.println("0 - Sair");
System.out.println("1 - Setar Hora");
System.out.println("2 - Setar Minuto");
System.out.println("3 - Setar Segundo");
System.out.println("4 - Obter Hora");
System.out.println("5 - Obter Minuto");
System.out.println("6 - Obter Segundo");
System.out.println("7 - Obter Hora/24");
System.out.println("8 - Obter Hora/12");
System.out.println("9 - Obter Segundos decorrido");
System.out.println("Digite sua opção");
do{
opc1 = ler.nextInt();
}while(opc1<0||opc1>9);

opc=opc1;
switch(opc)
{
case 1:
do{
System.out.println("Digite a Hora");
h1 = ler.nextInt();
}while(h1>=24 || h1<0);

hr.setHor(h1);
break;

case 2:
do{
System.out.println("Digite o Minuto");
m1 = ler.nextInt();
}while(m1>=60||m1<0);

hr.setMin(m1);
break;

case 3:
do{
System.out.println("Digite o Segundo");
s1 = ler.nextInt();
}while(s1>=60||s1<0);

hr.setSeg(s1);
break;

case 4:
System.out.println(hr.getHor() + " horas");
break;

case 5:
System.out.println(hr.getMin() + " minutos");
break;

case 6:
System.out.println(hr.getSeg() + " segundos");
break;

case 7:
System.out.println(hr.getHora1());
break;

case 8:
System.out.println(hr.getHora2());
break;

case 9:
System.out.println(hr.getSegundos() + " segundos");
break;

}//switch

System.out.println("Digite algo");

ler.next();

}while(opc!=0);

}//main
}//class
