/*Exercise : Child allowance
 A mother is entitled to € 25.00 child allowance per child.  She will receive a
supplement of €12.50 for the third child (and each subsequent child).
For the fifth (and each subsequent) child, she will receive an additional
allowance of €7.50.  If the mother's monthly wage is less than or equal
to €500.00, she will receive a 25% surcharge on the child benefit.
But if her monthly wage is greater than €2000.00, she will receive 25%
less child benefit.  A mother is always entitled to a minimum of €25.00 per child.

Question: Read in the number of children and monthly wages, and show the child
benefit to which the mother is entitled.  (For example, 5 children and € 1000.00
monthly wage gives € 170.00 child benefit).*/


public class ChildBenefit {
    public static void main(String[] args) {
        System.out.println(childBenefit(1,500));
        System.out.println(childBenefit(5,500));
        System.out.println(childBenefit(10,500));
        System.out.println(childBenefit(1,2500));
        System.out.println(childBenefit(4,1500));
        System.out.println(childBenefit(5,2500));
        System.out.println(childBenefit(6,2500));
        System.out.println(childBenefit(-5,2500));
        System.out.println(childBenefit(6,-2500));
    }
    public static double childBenefit(int childNumber, double wage) {
        double childNum=childNumber;
        if (childNum < 0) {
            System.out.println("Enter the correct Child number!");
            return 0;
        }
        if (wage < 0) {
            System.out.println("Enter the correct Wage information!");
            return 0;
        }
        double basePerChildBenefit = 25;
        double extraBenefitFrom3Child = 12.5;
        double extraBenefitFrom5Child = 7.5;
        double childBenefit;
        double minChildBenefit = basePerChildBenefit * childNum;

        if (childNum <= 2) {
            childBenefit = basePerChildBenefit * childNum;
            if (wage <= 500) {
                childBenefit = childBenefit * 1.25;
            }
            return childBenefit;
        }
        else if (childNum <= 4) {
            childBenefit =
                    basePerChildBenefit * childNum + extraBenefitFrom3Child * (childNum - 2);
            if (wage <= 500) {
                childBenefit = childBenefit * 1.25;
            }
            else if (wage > 2000) {
                childBenefit = childBenefit * 0.75;
                if (childBenefit < minChildBenefit) {
                    childBenefit = minChildBenefit;
                }
            }
            return childBenefit;
        }
        else {
            childBenefit =
                    basePerChildBenefit * childNum +
                            extraBenefitFrom3Child * (childNum - 2) +
                            extraBenefitFrom5Child * (childNum - 4);
            if (wage <= 500) {
                childBenefit = childBenefit * 1.25;
            }
            else if (wage > 2000) {
                childBenefit = childBenefit * 0.75;
                if (childBenefit < minChildBenefit) {
                    childBenefit = minChildBenefit;
                }
            }
            return childBenefit;
        }
    }
}

