package ca.uwaterloo.enghack17.cvision;

import java.awt.Color;

class FrequencyList {
    Node  front_i;

    class Node {
        public Color c_i;
        public int freq_i;
        public Node next_i;
        public Node prev_i;

        Node(Color c_p, Node next_p, Node prev_p) {
            this.c_i = c_p;
            this.freq_i = 1;
            this.next_i = next_p;
            this.prev_i = prev_p;
        }

        public void insert(Color c_p, int threshold_p) {
            // TODO
        }
    }

    public void insert(Color c_p, int threshold_p) {
        if (null == front_i) front_i = new Node(c_p, null, null);
        else front_i.insert(c_p, threshold_p);
    }

    public Color [] head(int n_p) {
        Color[] head = new Color[n_p];
        Node current = front_i;

        for(int i = 0 ; i < n_p ; i++) {
            if (null == current) break;
            head[i] = current.c_i;
            current = current.next_i;
        } // end for(i)

        return head;
    }

    FrequencyList() {
        front_i = null;
    }
}