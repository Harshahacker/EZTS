package vehicles_ops;

class Main {

	public static void main(String[] args) {
	
              Master vehicles_ops = new Master(10002,1436,"RED");
              System.out.println(vehicles_ops.toString());
              
              bike bk = new bike(143,111285,"yellow","Sports");
              System.out.println(bk.toString());
              
              car cr= new car(1247,136987,"Black",300);
              System.out.println(cr.toString());
              
              bus bs= new bus(1231,47885,"Violet",60);
              System.out.println(bs.toString());
     }

}
