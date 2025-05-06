#include <bits/stdc++.h>
using namespace std;
#include "product.h"

void product :: setVals( string cat, string ne,string i ,string pr, string num)
{
    category = cat;
    ID=i;
    name = ne;
    number = num;
    price = pr;
}

string product :: getName()    //returns name.
{ 
    return name;
}

string product :: getPrice()   //returns price.
{
    return price;
}
string product :: getNumber()   //returns number.
{
    return number;
}

void product :: Print()    //To print the desired output.
{
    cout << category << " " << name << " " << number << " " << price << endl;
}
string product::getCategory()
{
    return category;
}
string product:: getID()
{
    return ID;
}