#include<bits/stdc++.h>
using namespace std;
#include"DemoPortal.h"
#include"Product.h"
#include"Sort.h"
void DemoPortal::setVals()
{
    portalID=1;
    requestID=1;
}
vector<string> DemoPortal::spl(string s)
{
    vector<string> sv;
    stringstream ss(s);
    string sn;
    while(getline(ss,sn,' '))
    {
        sv.push_back(sn);
    }
    return sv;
}
void DemoPortal:: processUserCommand(string command)
{
    //cout<<"Hi";
    ofstream Myfile;
    Myfile.open("PortalToPlatform.txt",ios::app);
    if(Myfile)
    {
        vector<string> cmv;
        cmv=spl(command);
        if(cmv[0]=="Start")
        {
            mp[to_string(requestID)]="Start";
        }
        else if(cmv[0]=="List")
        mp[to_string(requestID)]=cmv[1]+cmv[2];
        else
        mp[to_string(requestID)]="Buy";
        Myfile <<portalID<<" "<<requestID<<" "<<command<<"\n"; 
        requestID++;  
    }
    Myfile.close();
}
void DemoPortal:: checkResponse()
{
    string myt;
    ifstream MyRdFl("PlatformToPortal.txt");
    while (getline (MyRdFl, myt)) {
        jump:
        vector<string> myta;
        myta=spl(myt);
        if(mp[myta[1]]=="Start")
        {
            cout<<myta[2]<<" "<<myta[3]<<endl;
        }
        else if(mp[myta[1]]=="Buy")
        {
            cout<<myta[2]<<endl;
        }
        if(mp[myta[1]]=="BookPrice"||mp[myta[1]]=="BookName"||mp[myta[1]]=="MobilePrice"||mp[myta[1]]=="MobileName")
        {
            vector<product*> prods;
            string x=myta[1];
            product *pr=new product();
            string cat;
            if(mp[myta[1]]=="BookPrice"||mp[myta[1]]=="BookName") cat="Book" ;
            else cat="Mobile";
            pr->setVals(cat,myta[2],myta[3],myta[4],myta[5]);
            prods.push_back(pr);
            string sk;
            string skei="";
            while(getline(MyRdFl,myt))
            {
                vector<string> vs;
                vs=spl(myt);
                if(vs[1]==x)
                {
                    product* prod=new product();
                    prod->setVals(cat,vs[2],vs[3],vs[4],vs[5]);
                    prods.push_back(prod);
                }
                else
                {
                    vector<product*> prods1;
                    Sort st;
                    if(mp[x]=="BookPrice"||mp[x]=="MobilePrice")
                    st.set_parameter("Price");
                    else
                    st.set_parameter("Name");
                    prods1=st.SortBasedOnParameter(prods);
                    for(int i=0;i<prods1.size();i++)
                    {
                        cout<<prods1[i]->getName()<<" "<<prods1[i]->getID()<<" "<<prods1[i]->getPrice()<<" "<<prods1[i]->getNumber()<<endl;
                    }
                    goto jump;
                
                }
            }
            vector<product*> prods1;
            Sort st;
            if(mp[myta[1]]=="BookPrice"||mp[myta[1]]=="MobilePrice")
            {
            
            st.set_parameter("Price");}
            else
            st.set_parameter("Name");
            prods1=st.SortBasedOnParameter(prods);
            for(int i=0;i<prods1.size();i++)
            {
                cout<<prods1[i]->getName()<<" "<<prods1[i]->getID()<<" "<<prods1[i]->getPrice()<<" "<<prods1[i]->getNumber()<<endl;
            }
            
            
           
        }
                      
        }
        MyRdFl.close();
        std::ofstream ofs;
        ofs.open("PortalToPlatform.txt", std::ofstream::out | std::ofstream::trunc);
        ofs.close();
    }


// Close the file   
   // MyRdFl.close();



