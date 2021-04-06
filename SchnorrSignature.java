import java.math.BigInteger;

public class SchnorrSignature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger p = new BigInteger("809");
		BigInteger g = new BigInteger("3");
		BigInteger x =   new BigInteger("768");
		BigInteger h =  new BigInteger("349");
		g = g.mod(p);
		h = g.modPow(x,p);
		System.out.println(h);
		//int randomVal = (int) (Math.random()*p.intValue()); // u
		//System.out.println(randomVal);
		BigInteger u = new BigInteger("588");
		//int u = 588;//
		System.out.println(g.modPow(u, p));
		BigInteger u2 = new BigInteger("0");
		
	}

}
