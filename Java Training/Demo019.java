
class Income{
    void CalTax(int monthlySalary, int hra, int pf){
        

        int annual = (monthlySalary*12);

        int deduction = hra+pf;

        int taxable =   annual - deduction;

        double tax;
        if(taxable<=500000){
            tax = taxable * 0.10;
        } else if((taxable>500000)&(taxable<=1000000)){
            tax = taxable * 0.20;
        } else{
            tax = taxable * 0.30;
        }
        System.out.println("Tax: "+tax);
    }
}

public class Demo019 {
    public static void main(String[] args) {
        Income i = new Income();

        i.CalTax(40000,1000,5000);

    }
}
