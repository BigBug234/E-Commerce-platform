#include<bits/stdc++.h>
using namespace std;
#ifndef PRODUCT_H
#define PRODUCT_H
class product
{
    protected:
        string name;  //all these are attributes of product
        string price;
        string number;
        string category;
        string ID;
    public:
        //product();
        void setVals(string, string,string, string, string);
        string getName();
        string getPrice();
        string getNumber();
        string getCategory();
        void Print();
        string getID();
};
#endif