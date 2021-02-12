package com.company;

class CommissionEmployeeTest {



        public String firstName;
        public String secondName;
        public String socialSecurityNumber;


        public CommissionEmployeeTest(String fn,String sn,String ssn){

            this.firstName=fn;
            this.secondName=sn;
            this.socialSecurityNumber=ssn;

        }


        public void setFirstName(String f){

            this.firstName=f;
        }
        public void setSecondName(String s){

            this.secondName=s;
        }
        public void setSocialSecurityNumber(String nss){

            this.socialSecurityNumber=nss;
        }

        public String getFirstName(){

            return this.firstName;
        }

        public String getSecondName(){

            return this.secondName;
        }

        public String getsocialSecurityNumber(){

            return this.socialSecurityNumber;
        }



    }
