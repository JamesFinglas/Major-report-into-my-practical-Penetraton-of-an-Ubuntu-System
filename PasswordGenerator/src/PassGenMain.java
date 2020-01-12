import java.io.*;

public class PassGenMain{
	public String[] f = {"f5"};
	public String[] t = {"t4"};
	public String[] p = {"pg3"};
	public String[] y = {"yb3", "ybs3", "hhs3"};
	public String[] j = {"jb3"};
	public String[] pb = {"patb2","p&tb2"};
	public String[] s = {"sp4"};
	public String[] dte = {"dte2"};
	public String[] to = {"taj2"};
	public String[] w = {"wecatrr2","rrawec","rr&wec2","rr2","wc2"};
	public String[] ta = {"t1", "lt1","td1"};
	public String[] i = {"i&ss2", "iass2","ias2"};

	public String text = "";
	public PassGenMain(){
		gen();
	}
	public void gen(){
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter("list.txt", true));

			for(int x = 0; x < y.length; x++){
				for(int h = 0; h < pb.length; h++){		
					for(int g = 0; g < w.length; g++){
						for(int d = 0; d < ta.length; d++){
							for(int k = 0; k < i.length; k++){                              	
								text = f[0] + t[0] + p[0] + y[x] + j[0] + pb[h] + s[0] + dte[0] + to[0] + w[g] + ta[d] + i[k];				
								System.out.println(text);
								writer.newLine();
							}
						}
					}
				}
			}
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args){
		PassGenMain g = new PassGenMain();
	}
}