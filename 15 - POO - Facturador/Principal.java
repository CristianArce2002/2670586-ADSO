public class Principal{
	public static void main(String[] args) {

		Usuario[] lista_usuarios = new Usuario[100];
		Producto[] lista_productos = new Producto[100];
		
		lista_usuarios[0] = new Usuario("108800", "Oscar Loaiza", "Calle 20", "CLIENTE");
		lista_usuarios[1] = new Usuario("108801", "Daniel Garcia", "Calle 19", "CLIENTE");
		lista_usuarios[2] = new Usuario("108802", "Juan Lopez", "Calle 18", "CLIENTE");
		lista_usuarios[3] = new Usuario("108803", "Catalina Mendez", "Calle 17", "CLIENTE");
		lista_usuarios[4] = new Usuario("108804", "Andres Lopez", "Calle 16", "CLIENTE");

		lista_usuarios[5] = new Usuario("109900", "Juan Castillo", "Calle 20", "Vendedor");
		lista_usuarios[6] = new Usuario("109901", "Ana Segura", "Calle 19", "Vendedor");
		lista_usuarios[7] = new Usuario("109902", "Julian Perez", "Calle 18", "Vendedor");
		lista_usuarios[8] = new Usuario("109903", "Carolina Tobon", "Calle 17", "Vendedor");
		lista_usuarios[9] = new Usuario("109904", "Carlos Perez", "Calle 16", "Vendedor");

		lista_productos[0] = new Producto("1010", "Leche", 3800);
		lista_productos[1] = new Producto("1011", "Carne 1Kg", 25600);
		lista_productos[2] = new Producto("1012", "Carne 1Lb", 12800);
		lista_productos[3] = new Producto("1013", "Jabon Barra", 2500);
		lista_productos[4] = new Producto("1014", "Detergente 1Kg", 15000);
		
		Facturador ventana = new Facturador(lista_usuarios, lista_productos);

	}

}