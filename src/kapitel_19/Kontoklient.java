package kapitel_19;
import java.rmi.Naming;
import java.util.ArrayList;

public class Kontoklient
{
	public static void main(String[] arg) throws Exception
	{
		KontoI k =(KontoI) Naming.lookup("rmi://localhost:1099/kontotjeneste");
		System.out.println("Kontonavn er " + k.getNavn());

   /* k.overførsel(100, "Sebassan");
    k.overførsel(50, "Supermand");
		System.out.println( "Saldo er: "+ k.saldo() );
		k.overførsel(-150, "Turbolån.dk");
		System.out.println( "Saldo ved slut er: "+ k.saldo() );
		k.haevning(50);
		System.out.println( "Saldo er :"+ k.saldo() );
		*/

   	k.overførsel(1, "Jepa");
		k.overførsel(1, "Jepa");
		k.overførsel(1, "Jepa");
		k.overførsel(1, "Jepa");
		k.overførsel(1, "Jepa");
		k.overførsel(1, "Jepa");
		k.overførsel(1, "Jepa");
		k.overførsel(1, "Jepa");
		k.overførsel(1, "Jepa");
		k.overførsel(1, "Jepa");
		k.overførsel(-10, "Sebastian");


		ArrayList<String> bevægelser = k.bevægelser();

		for (String element: bevægelser
				 ) {
			System.out.println( bevægelser.indexOf(element) + ": "+ element );
		}

	}
}
/*
	long tid = System.currentTimeMillis();
	for (int i=0; i<100; i++) {
		k.overførsel(1);
		k.overførsel(-1);
	}
	long dt = System.currentTimeMillis() - tid;
	System.out.println( "Kørselstiden for RMI var: "+ dt );
*/
