#include <bits/stdc++.h>
using namespace std;

vector<double> quadratic(double a, double b, double c){
	vector<double>s;
	if(b*b < 4*a*c) return s;
	else if( b*b == 4*a*c){
		double r = 2*a;
		double t = 0-b;
		double n = r/t;
		s.push_back(n);
		return s;
	}
	else{
		double r =  2*a;
		double t = 0-b;
		double n = b*b;
		double h = 4*a*c;
		n -= h;
		n = sqrt(n);
		double fi = (t + n) / r;
		double se = (t - n) / r;
		s.push_back(fi);
		s.push_back(se);
		return s;
	}
	return s;
}

int main(){
	int a,b,c; cin>>a>>b>>c;
	if(a==0){
		cout<<"a cannot be 0!";
		exit(0);
	}
	vector<double> x = quadratic(a,b,c);
	if(x.empty()) cout<<"IMAGINARY SOLUTIONS ARE NOT SUPPORTED!";
	for(int i = 0; i< x.size(); i ++){
		cout<<x[i];
		if(i != x.size() - 1) cout<<" or ";
	}
}
