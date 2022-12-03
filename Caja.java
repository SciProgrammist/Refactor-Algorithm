import java.util.Scanner;

class Caja {
	Scanner teclado;
	Storage storage;
	menu_message message;

	public Caja(){
		init();
		showApp();
	}

	public void init(){
		teclado = new Scanner(System.in);
		storage = new Storage();
		message = new menu_message();
	}

	public void showApp(){
		int opcion = 0;
		while (opcion < 1 || opcion > 4) {
			message.showMainMenu();
			opcion = teclado.nextInt();
			int opcionDetalle = -1;
			int q = 0;
			float p = 0;
			switch(opcion){
				case 1:
					message.showProducts(storage);
					opcionDetalle = teclado.nextInt();
					if(opcionDetalle < 0 || opcionDetalle> storage.getProducts().length){
						System.out.println("la opcion no es valida");
						break;
					}
					System.out.print("Cantidad: ");
					q = teclado.nextInt();
					System.out.print("Precio: ");
					p = teclado.nextFloat();
					storage.buyProduct(opcionDetalle, q, p);
					break;
				case 2:
					message.showProducts(storage);
					opcionDetalle = teclado.nextInt();
					if (opcionDetalle <0 || opcionDetalle > storage.getProducts().length){
						System.out.println("La opcion no es valida");
						break;
					}
					System.out.print("Cantidad: ");
					q = teclado.nextInt();
					storage.saleProduct(opcionDetalle, q);				
					break;
				case 3:
				 message.showReport(storage);
				 System.out.print("Presione 0 para continuar...");
				 opcion = teclado.nextInt();
				 break;
				case 4:




			}

		}

		
	}


}