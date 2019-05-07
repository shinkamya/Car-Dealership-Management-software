public class Car {
	int mkYear;
	int car;
	int nocars;
    String model;
    String colour;
    String name;
    int total=0;
    public Car() {
        }
    public Car(int my, int nc, String m, String c, String n){
        mkYear=my;
        nocars=nc;
        model=m;
        colour=c;
        name=n;
        }
	public int getmy() {    	return mkYear; }
    public int getnc()  {	return nocars;}
    public String getm() {	return model; }
    public String getc() { return colour; }
    public String getn() { return name; }
    public void setnc(int nc)	 { nocars=nc; }
    public void setmy(int my) { mkYear=my;}
    public void setm(String m) { model=m; }
    public void setc(String c) { colour=c; }
    public void setn(String n) {name=n;}
}