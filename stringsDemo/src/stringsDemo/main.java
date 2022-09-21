package stringsDemo;

public class main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";

		/*
		 * System.out.println(mesaj); System.out.println("Eleman sayısı :" +
		 * mesaj.length()); System.out.println("5. eleman:" + mesaj.charAt(4));
		 * System.out.println(mesaj.concat(" Yaşasın!"));
		 * System.out.println(mesaj.startsWith("A")); ////ne ile başlıyor.
		 * System.out.println(mesaj.endsWith("."));//ne ile bitiyor. char[] karakterler
		 * = new char [5]; mesaj.getChars(0, 5, karakterler, 0);
		 * System.out.println(karakterler); System.out.println(mesaj.indexOf('a'));
		 */
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj); //kelimeleri değiştirmek için kullanılır.
		System.out.println(mesaj.substring(2));// burdan ititbaren al demek.
		
		for (String kelime :mesaj.split(" ")) {  //boşluğa kadar alarak ayırır.
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase()); //küçük harfe çevirir.
		System.out.println(mesaj.toUpperCase()); // büyük harfe çevirir.
		System.out.println(mesaj.trim()); // başındaki ve sonundaki boşlukları atar.
		
	}

}
