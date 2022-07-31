package oops;

public class OverLoadingExample
{
public int Getarea(int l,int b) {
	return l*b;
}
public int Getarea(int l) {
	return l*l;
}
public float Getarea(float l) {
	return l*l;
}
}