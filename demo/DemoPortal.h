#include<bits/stdc++.h>
using namespace std;
#ifndef DEMOPORTAL_H
#define DEMOPORTAL_H
#include"Protal.h"
class DemoPortal:public Portal {     
    public:
    map<string,string> mp;  
    vector<string> spl(string s);
    void setVals();
    void processUserCommand(string command);
    void checkResponse();
};
#endif