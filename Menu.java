import java.util.*;

class Menu{
	
	int array[];

	Menu(int size){
		array=new int[size];
	}

	void fillArray(int a[]){
		Random numAleatorio = new Random();
		int n = 0; 
		for (int i=0;i<a.length;i++) {
			n = numAleatorio.nextInt(100-0+1) + 0;//Numero Aleatorio de 0 a 100
			a[i]=n;
		}
	}

	void showArray(int a[]){
		System.err.print("Arreglo: ");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+"	");
		}
		System.out.print("\n\n");
	}

	int[] getArray(){
		return array;
	}

	public static void main(String[] args) {
		Menu e=new Menu(5);
		boolean exec=true;
		Scanner rd=new Scanner(System.in);
		while(exec==true){
			System.err.println("___________NUEVO__________");
			e.fillArray(e.getArray());
			e.showArray(e.getArray());
			System.out.println("\n"+"|||||||||||||||||||||||-Elija un Metodo de Ordenamiento-||||||||||||||||||||"+
							 "\n|			(1) Quicksort 					   |"+
							 "\n|			(2) Bubblesort					   |"+
							 "\n|			(3) Radix					   |"+
							 "\n|			(4) Shellsort					   |"+
							 "\n|			(5) Salir					   |"+
							 "\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||"+"\n");

			switch(rd.nextInt()){
				case 1:
					System.err.println("___________ANTES__________");
					e.showArray(e.getArray());
					Quicksort q=new Quicksort();
					q.quicksort(e.getArray(),0,e.getArray().length-1);
					System.err.println("___________Quicksort__________");
					e.showArray(e.getArray());
					break;
				case 2:
					System.err.println("___________ANTES__________");
					e.showArray(e.getArray());
					Bubblesort b=new Bubblesort();
					b.bubble(e.getArray());
					System.err.println("____________Bubblesort___________");
					e.showArray(e.getArray());
					break;
				case 3:
					System.err.println("___________ANTES__________");
					e.showArray(e.getArray());
					Radix r=new Radix();
					r.AlgoritmoRadix(e.getArray());
					System.err.println("___________Radix__________");
					e.showArray(e.getArray());
					break;
				case 4:
					System.err.println("___________ANTES__________");
					e.showArray(e.getArray());
					Shallsort s=new Shallsort();
					s.algoritmoShell(e.getArray());
					System.err.println("___________Shellsort__________");
					e.showArray(e.getArray());
					break;
				case 5:
					exec=false;
					break;
				default:
					System.out.println("!Intenta De Nuevo!");
					break;
			}
		}
	}

}