class menu_message{
    public void showMainMenu(){
        System.out.println("**************************");
        System.out.println("* BIENVENIDOS AL SISTEMA *");
        System.out.println("*------------------------*");
        System.out.println("*                        *");
        System.out.println("*  1. Comprar.           *");
        System.out.println("*  2. Vender.            *");
        System.out.println("*  3. Informes.          *");
        System.out.println("*  4. Salir              *");
        System.out.println("*                        *");
        System.out.println("**************************");
    }

    public void showProducts(Storage s){
        System.out.println("*******************************************************");
        System.out.println("*               PRODUCTOS DEL INVENTARIO              *");
        System.out.println("*-----------------------------------------------------*");
        for (int i = 0; i < s.getProducts().length; i++ ){
            System.out.println("* " + i +". " + s.getProducts()[i].getName());
        }
        System.out.println("*******************************************************");
    }

    public void showReport(Storage s){
        System.out.println("*******************************************************");
        System.out.println("*                 INFORME DE INVENTARIO               *");
        System.out.println("*-----------------------------------------------------*");
        System.out.println("* PRODUCT\t| CANTIDAD\t| PRECIO\t| TOTAL\t*");
        for( int i = 0; i < s.getProducts().length; i++){
            //Refactorizando Informes
            String name = s.getProducts()[i].getName();
            int quantity = s.getProducts()[i].getQuantity();
            float price = s.getProducts()[i].getPrice();
        System.out.println("* " + name + "\t\t| "+ quantity + "\t\t| " + price + "\t\t| " + (quantity*price) + " *");

        }
        System.out.println("*******************************************************");
 
    }

}