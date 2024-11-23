package _03_Text_Funkifier;

//import javax.crypto.Cipher;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }
    
    
    @Override
    public String funkifyText() {
     	char[] c = unfunkifiedText.toCharArray();
     	String ft = (c[0]+"").toLowerCase();
     	for(int i =1; i < c.length; i++) {
     		if(i%2 == 1) {
     			if((c[i]+"").toLowerCase().equals(c[i]+"")) {
     				ft += (c[i]+"").toUpperCase();
     			}
     			else {
     				ft+=
     						(c[i]+"").toLowerCase();
     			}
     		}
     		else {
     			ft+=c[i]+"";
     		}
     	}
        return ft;

    }
    
    

}
