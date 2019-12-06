public class NetMsg{
	public int from;
	public int to;
	public String hook;
	public NetMsg(){}
	public NetMsg(int from, int to, String hook) {
		this.from = from;
		this.to = to;
		this.hook = hook;
	}
}