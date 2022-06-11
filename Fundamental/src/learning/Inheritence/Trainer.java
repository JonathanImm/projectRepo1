package learning.Inheritence;

import java.net.ProtocolFamily;
import java.sql.SQLException;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import javax.sql.RowSet;
import javax.sql.rowset.Predicate;

public class Trainer extends Orang implements Prof, ProcessHandle, Predicate{
	
	public static void main(String[] args) {
		
		System.out.println(word);
		
		Trainer turo = new Trainer(); //Similar to Abstract Class, you cannot directly...
									  //...summon an Interface. You must use its extension
		//Summon the Prof() Interface using Trainer Class.
		
		turo.spri();
		
	}

	
	@Override
	public void spri() {
		// TODO Auto-generated method stub
		
		System.out.println("Grass Meow!");
		
	}

	@Override
	public void fue() {
		// TODO Auto-generated method stub
		
		System.out.println("Fire Chilly!");
		
	}

	@Override
	public void quax() {
		// TODO Auto-generated method stub
		
		System.out.println("Quack");
		
	}


	@Override
	public boolean evaluate(RowSet rs) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean evaluate(Object value, int column) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean evaluate(Object value, String columnName) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public long pid() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public Optional<ProcessHandle> parent() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Stream<ProcessHandle> children() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Stream<ProcessHandle> descendants() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Info info() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CompletableFuture<ProcessHandle> onExit() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean supportsNormalTermination() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean destroy() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean destroyForcibly() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int compareTo(ProcessHandle other) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}//End Bracket!
