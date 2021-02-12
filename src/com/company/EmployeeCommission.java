package com.company;
class EmployeeCommission extends CommissionEmployeeTest{

    public double commissionPercentage;
    public double grossSales;

    public EmployeeCommission(String fn, String sn, String ssn, double cp, double gs){
        super(ssn,fn,sn);

        this.commissionPercentage=cp;
        this.grossSales=gs;
    }

    public EmployeeCommission(String fn, String sn, String ssn) {
        super(fn, sn, ssn);
    }

    public double getcommissionp(){
        return this.commissionPercentage;
    }
    public void setcommissionp(double cp){
        this.commissionPercentage=cp;
    }

    public double getgrossSales(){
        return this.grossSales;
    }

    public void setgrossSales(double gs){
        this.grossSales=gs;
    }

    public double calculateEarnings(){
        return this.grossSales*this.commissionPercentage;
    }

}





