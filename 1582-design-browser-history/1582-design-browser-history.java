class BrowserHistory {

    public class Node{
        String data;
        Node next;
        Node prev;

        Node(String data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    Node temp;
    public BrowserHistory(String homepage) {
        Node head = new Node(homepage);
        temp = head;
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        newNode.prev = temp;
        temp.next = newNode;
        temp = temp.next;
    }
    
    public String back(int steps) {
        while(steps>0 && temp.prev != null){
            temp = temp.prev;
            steps--;
        }
        return temp.data;
        
    }
    
    public String forward(int steps) {
        while(steps>0 && temp.next != null){
            temp = temp.next;
            steps--;
        }
        return temp.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */