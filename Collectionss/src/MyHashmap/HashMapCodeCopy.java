package MyHashmap;
import java.util.*;

public class HashMapCodeCopy {

    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }

        }


        private int n;//nodes
        private int N;//buckets
        private LinkedList<HashMapCodeCopy.HashMap.Node> buckets[]; //N = buckets.length

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }
        public void put(K key,V value)
        {
            int bi=hashfunc(key);
            int di=SearchLinkedList(key,bi);
            if(di==-1)
            {
                buckets[di].add(new Node(key, value));
                n++;
            }
            else 
             {
                Node node=buckets[bi].get(di);
                node.value=value;
            }
            double lambda=(double) n/N;
            if(lambda>2.0)
            {
                rehashy();
            }
        }

        private void rehashy() {
        }

        private int SearchLinkedList(K key, int bi) 
        {
            LinkedList<HashMapCodeCopy.HashMap.Node> ll=buckets[bi];
            for(int i=0;i<ll.size();i++)
            {
               if(ll.get(i)==key)
               {
                   return i;
               }
            }
            return -1;
        }

        private int hashfunc(K key) 
        {
            int n=key.hashCode();
            return Math.abs(n)%N;
        }
        public V get(K key)
        {
            int bi=hashfunc(key);
            int di=SearchLinkedList(key,bi);
            if(di==-1)
            {
                System.out.println("There is no key to get");
                return null;
            }
            else
            {
                Node node=buckets[bi].get(di);
                V value=node.value;
                return value;

            }
        }
        public boolean containskey(K key)
        {
            int bi=hashfunc(key);
            int di=SearchLinkedList(key,bi);
            if(di==-1)
            {
                return false;
            }
            else {
                return true;
            }
        }
        public V remove(K key)
        {
            int bi=hashfunc(key);
            int di=SearchLinkedList(key,bi);
            if(di==-1)
            {
                return null;
            }
            else
            {
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }
        public ArrayList<K> keyset()
        {
            ArrayList<K> al=new ArrayList();
            for (int i=0;i< buckets.length;i++)
            {
                LinkedList<HashMapCodeCopy.HashMap.Node> ll=buckets[i];
                for (int j=0;j<ll.size();j++)
                {
                    Node node=ll.get(j);
                    al.add(node.key);
                }
            }
            return al;
        }



    }
}