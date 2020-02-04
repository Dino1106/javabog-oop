package kapitel_19;
import java.lang.reflect.Array;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.rmi.server.UnicastRemoteObject;

public class KontoImpl extends UnicastRemoteObject implements KontoI
{
	private int saldo = 100; // man starter med 100 kroner
	private ArrayList<String> bevægelser = new ArrayList<>();
	private String name = "Manæmis";

	public KontoImpl() throws java.rmi.RemoteException
	{
	}

	@Override
	public void overførsel(int kroner, String modtager) throws RemoteException {
		int nySaldo = saldo + kroner; // her beregnes ny saldo
		String s = "Overførsel på "+kroner+" kr. Ny saldo er "+nySaldo+" kr." + ", modtager: " + modtager;
		System.out.println(s);
		// transaktionen gemmes - vi simulerer at det tager lidt tid
		try { Thread.sleep(500); } catch (InterruptedException ex) { }
		saldo = nySaldo; // her er transaktionen gemt
		System.out.println("Transaktionen på " + kroner + " kr er gemt");
		bevægelser.add(s);
	}

	public int saldo()
	{
		System.out.println("Der spørges om saldoen. Den er "+saldo+" kr.");
		return saldo;
	}

	@Override
	public void haevning(int kroner) throws RemoteException {
		int nySaldo = saldo - kroner; // her beregnes ny saldo
		String s = "Hævning af "+kroner+" kr. Ny saldo er "+nySaldo+" kr.";
		bevægelser.add(s);
		saldo = nySaldo;
	}

	@Override
	public String getNavn() throws RemoteException {
		return name;
	}

	public ArrayList<String> bevægelser()
	{
		System.out.println("Der spørges på alle bevægelser.");
		return bevægelser;
	}
}