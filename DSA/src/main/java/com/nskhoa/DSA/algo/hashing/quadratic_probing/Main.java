package com.nskhoa.DSA.algo.hashing.quadratic_probing;

class Main {
  public static void main(String[] args) {
    QuadraticProbing quadraticProbing = new QuadraticProbing(13);
    quadraticProbing.insertKeyInHashTable("The");
		quadraticProbing.insertKeyInHashTable("quick");
		quadraticProbing.insertKeyInHashTable("brown");
		quadraticProbing.insertKeyInHashTable("fox");
		quadraticProbing.insertKeyInHashTable("over");
		quadraticProbing.insertKeyInHashTable("lazy");
		quadraticProbing.displayHashTable();

  }
}
