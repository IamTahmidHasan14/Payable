public class Main {
    public static void main(String[] args) {
        Payable[] pable = new Payable[4];
        pable[0] = new SalariedEmployee("Ahmad","Khan","821661272565",156400.21);
        pable[1] = new SalariedEmployee("Jhon","Ali","766356834234",67420.21);
        pable[2] = new Invoice("106","Ram",22,2400.1);
        pable[3] = new Invoice("60","GPU",2,12400.1);

        for(Payable x:pable){
            System.out.println(x.toString());
            System.out.println("Amount: "+ x.getPaymentAmount());
            System.out.println();
        }
    }
}
