package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	String ft = "";
    	char[] c = unfunkifiedText.toCharArray();
    	for(int i = c.length-1; i >= 0; i--) {
    		ft+=c[i];
    	}
    	
        return ft;

    }
}
