public class DVMsg{
	public int sender;
	public int receiver;
	public int[] dv;

	public DVMsg(int sender, int receiver, int[] dv) {
		this.sender = sender;
		this.receiver = receiver;
		this.dv = dv.clone();
	}

	public String toString() {
		String s = "<s:" + sender + " , r:" + receiver + " ,dv:";
		for(int d:dv){
			s += d + " ,";
		}
		s+=">";
		return s;
	}
}