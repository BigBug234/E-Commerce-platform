#include <bits/stdc++.h>
using namespace std;
#include "product.h"
#ifndef SORT_H
#define SORT_H
class Sort
{
    
    public:                 //Used to sort based on parameter.
    void set_parameter( string parmeter);
    vector<product*> SortBasedOnParameter( vector<product*>products);
    string parameter;
};

#endif