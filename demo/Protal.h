#include<bits/stdc++.h>
using namespace std;
#ifndef PORTAL_H
#define PORTAL_H
class Portal{

    public:
    int requestID,portalID;
    virtual void setVals()=0;
    virtual void processUserCommand(string command)=0;
    virtual void checkResponse()=0;
};
#endif