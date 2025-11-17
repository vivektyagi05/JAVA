package Exception;

class outOfStockException extends Exception {
    
    public outOfStockException(String massege){
        super(massege);
    }
}

public class onlineShopping{

    //  thiis ussed in throws

    public static void quantity(int AvailableStock, int requiredStock) throws outOfStockException{
        if(AvailableStock <= requiredStock){
            throw new outOfStockException("outOfStockException");
        }else{
            System.out.println("Current Stocks : "+AvailableStock);
            System.out.println("Confirm Order : "+requiredStock);
            System.out.println("Upadted Stocks : "+(AvailableStock-requiredStock));
        }
    }
    public static void main(String[] args) {
        try {
            quantity(150,25);
            quantity(15,25);

        } catch (outOfStockException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}

