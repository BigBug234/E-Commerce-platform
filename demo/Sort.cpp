#include <bits/stdc++.h>
using namespace std;
#include "Sort.h"

void Sort :: set_parameter(string p)
{
    parameter = p;
}

bool compare_name( product *x, product *y)             
{
        return x->getName() < y->getName();
}

bool compare_price(product *x,product *y)
{
    return stof(x->getPrice()) < stof(y->getPrice());
}


vector<product*> Sort :: SortBasedOnParameter( vector<product*>products)
{
    int i;
    if(parameter == "Name")
    {                                               
        sort( products.begin(), products.end(), compare_name);    //Used to sort the vector based on name.
    
    }
    else if(parameter == "Price")
    {
        
        sort( products.begin(), products.end(), compare_price);   //Used to sort the vector based on price.

    }
    return products;
    
}