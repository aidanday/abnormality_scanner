import java.awt.Color;

package ca.uwaterloo.enghack17.cvision;

public FrequencyList {
    Node * front_i;

    private Node {
        Color c_i;
	int freq_i;
        Node * next_i;
	Node * prev_i;
    }

    public void insert(Color c_p, int threshold_p) {
        // TODO
    }

    public Color [] head(int n_p) {
        Color head [n_p];
	Node * current = front_i;

	for(int i = 0 ; i < n_p ; i++) {
	    if (null == current) break;
	    head[i] = (*current).c_i;
	    current = (*current).next;
	} // end for(i)

	return head;
    }

    FrequencyList() {
        front_i = null;
    }
}
