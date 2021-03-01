package MyFirstProject;

 interface animals {
    void show();
}
class cat implements animals{
	public  void show(){System.out.println("aa");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     animals a = new cat();
     a.show();
	}

}
