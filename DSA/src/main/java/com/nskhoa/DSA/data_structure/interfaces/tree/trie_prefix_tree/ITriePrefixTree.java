package com.nskhoa.DSA.data_structure.interfaces.tree.trie_prefix_tree;

import com.nskhoa.DSA.data_structure.implementation.tree.trie_prefix_tree.TrieNode;

public interface ITriePrefixTree {
    void insert(String word);

    boolean search(String word);

    boolean delete(TrieNode parentNode, String word, int index);

    void delete(String word);
}
