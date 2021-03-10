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

    public double getCommissionPercentage(){
        return this.commissionPercentage;
    }
    public void setCommissionPercentage(double cp){
        this.commissionPercentage=cp;
    }

    public double getGrossSales(){
        return this.grossSales;
    }

    public void setGrossSales(double gs){
        this.grossSales=gs;
    }

    public double calculateEarnings(){
        return this.grossSales*this.commissionPercentage;
    }

}





