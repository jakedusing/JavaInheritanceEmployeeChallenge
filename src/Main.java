public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);

        SalariedEmployee joe = new SalariedEmployee("Joe", "09/30/1988", "03/15/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}