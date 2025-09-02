public class Changer {
    private double change;
    int[] cValues;
    String[] cNames;

    public Changer(double purchaseAmount, double paymentAmount, double tolerance){
        this.change = (paymentAmount * 100) - (purchaseAmount * 100) - tolerance;

        cValues = new int[]{5000, 2000, 1000, 500, 100, 25, 10, 5, 1};
        cNames = new String[]{
            "Fifties", "Twenties", "Tens", "Fives", "Ones",
                "Quarters", "Dimes", "Nickels", "Pennies"
        };
   }

   public void printChanges(){
        for (int i=0; i < cValues.length; i++){
            int count;

            if(change >= cValues[i]){
                count = (int)change / cValues[i];
                System.out.println(count + " " + cNames[i]);
                change = change - (cValues[i] * count);
            }
        }
   }
}



