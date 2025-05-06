#include<bits/stdc++.h>
using namespace std;
#include"DemoPortal.h"

int main()
{
    string st;
    Portal *dmp=new DemoPortal();  //instatiating DemoPortal object.
    dmp->setVals();
    while(true)
    {
        cin>>st;

        if(st=="End") break;
        if(st=="Check")
        {
            dmp->checkResponse();  
        }
        else if(st=="List")
        {
            string s1,s2;
            cin>>s1>>s2;
            dmp->processUserCommand(st+" "+s1+" "+s2);
        }
        else if(st=="Start")
        {
            dmp->processUserCommand(st);
        }
        else
        {
            string s2;int s3;
            cin>>s2>>s3;
            dmp->processUserCommand(st+" "+s2+" "+to_string(s3));
        }
    }
}