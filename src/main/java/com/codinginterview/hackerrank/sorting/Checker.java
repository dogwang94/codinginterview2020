package com.codinginterview.hackerrank.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class SortingCustomObjects 
{
	public static void main(String[] args) 
	{
	
		List<Player> player = new ArrayList<Player>();
		player.add(new Player("aleksa", 150));
		player.add(new Player("amy", 100));
		player.add(new Player("david", 100));
		player.add(new Player("akansha", 75));
		player.add(new Player("heraldo", 50));
		
		Collections.sort(player, new Checker());

		System.out.println(player);
	}

}

class Checker implements Comparator<Player> {
  	// complete this method
    @Override
    public int compare(Player a, Player b) {
        if(a.getScore() != b.getScore()) {
            return b.getScore() - a.getScore();
        }
        return a.getName().compareTo(b.getName());
    }
}
  //the answer for test
//class Checker implements Comparator<Player> {
//  	// complete this method
//    @Override
//    public int compare(Player a, Player b) {
//        if(a.score != b.score) {
//            return b.score - a.score;
//        }
//        return a.name.compareTo(b.name);
//    }
//}

  //Way to using lambda
//public class Checker implements Comparator<Player>
//{
//	@Override
//	public int compare(Player a, Player b)
//	{		
//		return b.getScore()-a.getScore();	
//	}
//
//}

