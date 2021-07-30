
public class Stock{

    private String stockName;
    private int stockPrice;
    private int stockNumber;

    public Stock(String stockName,int stockPrice,int stockNumber){
        this.stockName=stockName;
        this.stockPrice=stockPrice;
        this.stockNumber=stockNumber;
    }

    public Stock(){
    }

    public String getStockName(){
        return stockName;
    }

    public int getStockPrice(){
        return stockPrice;
    }

    public int getStockNumber(){
        return stockNumber;
    }

    public void setStockName(String stockName){
        this.stockName=stockName;
    }

    public void setStockPrice(int stockPrice){
        this.stockPrice=stockPrice;
    }

    public void setStockNumber(int stockNumber){
        this.stockNumber=stockNumber;
    }

    public String toString(){
        return stockName+" "+stockPrice+" "+stockNumber+"  "+(stockPrice*stockNumber)+" "+"\n";

    }

    public static void main(String[] args) {
        System.out.println( );
    }

}
