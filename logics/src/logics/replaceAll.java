package logics;

public class replaceAll {
public static void main(String[] args) {
	String str="J1$A@2V#3A?45m&a7v#9a";
	System.out.println(str.replaceAll("[J$A@V#A?m&Aav#a]",""));
	System.out.println(str.replaceAll("[A-Za-z0-9]",""));
	System.out.println(str.replaceAll("[0-9a-z$@?&#]",""));
	System.out.println(str.replaceAll("[A-Z0-9@#&?$]",""));
}
}