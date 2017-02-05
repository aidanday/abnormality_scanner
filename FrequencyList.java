package ca.uwaterloo.enghack17.cvision;

import java.awt.Color;

class FrequencyList {
    Node front_i;

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
            if (threshold_p < (color_diff(c_p, this.c_i) >> 16)) {
                if (null == next_i) {
                    next_i = new Node(c_p, null, this);
		    return
                }
                return next_i.insert(c_p, threshold_p);
            }

            freq_i++;
            int r_new = (c_i.getRed() * (freq_i - 1) + c_p.getRed()) / freq_i;
            int g_new = (c_i.getGreen() * (freq_i - 1) + c_p.getGreen()) / freq_i;
            int b_new = (c_i.getBlue() * (freq_i - 1) + c_p.getBlue()) / freq_i;
            this.c_i = new Color(r_new, g_new, b_new);

            while ((null != prev_i) && (prev_i.freq_i < freq_i)) {
                this.swap_back();
            } // end while(prev_i.freq_i < freq_i)
        }

        private void swap_back() {
            Node other = this.prev_i;
            assert((null != other);

            Node temp = this.next_i;
            if (null != temp) temp.prev_i = other;
	    temp = other.prev_i;
            if (null != temp) temp.next_i = this;

            this.prev_i = other.prev_i;
            other.next_i = this.next_i;

            this.next_i = other;
            other.prev_i = this;
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
