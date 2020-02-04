package youDoIt;

public class CreatePolicies
{
    public static void main(String[] args)
    {
        CarInsurancePolicy first = new CarInsurancePolicy(123);
        CarInsurancePolicy second = new CarInsurancePolicy(123,  45);
        CarInsurancePolicy third = new CarInsurancePolicy(123, 2, "Castleville");

        first.display();
        second.display();
        third.display();

    }
}
